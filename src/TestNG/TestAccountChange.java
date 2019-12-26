package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.SignIn;
import page.objects.Registration;
import utility.ExcelUtils;

public class TestAccountChange {
	
	@Test
	public void Test1Change() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(SignIn.URLSIGNIN);
		driver.manage().window().maximize();
		String USER_ID = "10004334344";
		String PASSWORD = "abchhhhhhh";
		SignIn.getUsername(driver).clear();
		SignIn.inputUsername(driver, USER_ID);
		SignIn.getPassword(driver).clear();
		SignIn.inputPassword(driver, PASSWORD);
		HomePage.wait2();
		SignIn.clickLogIn(driver);
		HomePage.wait2();
		boolean ExistSignOut = driver.findElement(By.xpath(PetStoreMenu.SIGNOUT_BUTTON)).isDisplayed();

		sa.assertEquals(ExistSignOut, true, "Log In Unsuccesful!");
		
		PetStoreMenu.clickMyAccButton(driver);
		
		Registration.getPHONE(driver).clear();
		Registration.inputPHONE(driver, "(381) 066 123456");
		Registration.getCOUNTRY(driver).clear();
		Registration.inputCOUNTRY(driver, "Italija");
		//System.out.println("editovao");
		HomePage.wait2();
		Registration.clickChangeAccountInfo(driver);
		//System.out.println("kliknuo");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		PetStoreMenu.clickSignOutButton(driver);
		HomePage.wait2();
		PetStoreMenu.clickSignInButton(driver);
		SignIn.getUsername(driver).clear();
		SignIn.inputUsername(driver, USER_ID);
		SignIn.getPassword(driver).clear();
		SignIn.inputPassword(driver, PASSWORD);
		SignIn.clickLogIn(driver);
		PetStoreMenu.clickMyAccButton(driver);
		
		String phone = driver.findElement(By.xpath("//input[@name='account.phone']")).getText();
		String country = driver.findElement(By.xpath("//input[@name='account.phone']")).getText();
		
		sa.assertEquals(phone,  "(381) 066 123456", "Data not changed!");
		sa.assertEquals(country,  "Italija","Data not changed!");
		
		// will fail, because data will not be changed
		HomePage.wait2();
		
		sa.assertAll();
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}

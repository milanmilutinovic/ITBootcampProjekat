package TestNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Cats;
import page.objects.HomePage;
import page.objects.Manx;
import page.objects.PetStoreMenu;
import page.objects.SignIn;
import page.objects.Registration;
public class TestCart {

	
	@Test
	public void Test1Change() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.URLPETSTORE);
		driver.manage().window().maximize();
	PetStoreMenu.clickLeftCats(driver);
	HomePage.wait2();
	Cats.clickCatManx(driver);
	HomePage.wait2();
	Manx.clickTailessManx(driver);
	
	HomePage.wait2();
	driver.navigate().to(PetStoreMenu.URLPETSTORE);
	PetStoreMenu.clickCartButton(driver);
	HomePage.wait2();
	boolean ExistRemoveButton = driver.findElements(By.xpath("//a[contains(text(),'Remove')]")).size() > 0;
	sa.assertEquals(true, ExistRemoveButton,"Not added to cart!");
	
	sa.assertAll();
	driver.close();
	
	}
	
	
	}

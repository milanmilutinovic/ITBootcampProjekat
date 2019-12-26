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

public class TestRegistration {

	@Test
	
	// Test for registering single manually entered user
	
	public void Test1OneUser() { 
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Registration.URLREGISTRATION);
		driver.manage().window().maximize();

		HomePage.wait2();

		String USER_ID, NEW_PASSWORD, REPEAT_PASSWORD, FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS1, ADDRESS2, CITY,
				STATE, ZIP, COUNTRY, LANGUAGE_PREFERENCE, FAVOURITE_CATEGORY;

		USER_ID = "25004334344";
		NEW_PASSWORD = "abchhhhhhh";
		REPEAT_PASSWORD = "abchhhhhh";
		FIRST_NAME = "Milan";
		LAST_NAME = "Milutinovic";
		EMAIL = "milanmilutinovic1985@gmail.com";
		PHONE = "(381) 063 405 346";
		ADDRESS1 = "Prve Pruge 11";
		ADDRESS2 = "Milentija Popovica 26";
		CITY = "Beograd";
		STATE = "Srbija";
		ZIP = "11080";
		COUNTRY = "Srbija";
		LANGUAGE_PREFERENCE = "japanese";
		FAVOURITE_CATEGORY = "DOGS";

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		Registration.inputUSER_ID(driver, USER_ID);
		Registration.inputNEW_PASSWORD(driver, NEW_PASSWORD);
		Registration.inputREPEAT_PASSWORD(driver, REPEAT_PASSWORD);
		Registration.inputFIRST_NAME(driver, FIRST_NAME);
		Registration.inputLAST_NAME(driver, LAST_NAME);
		Registration.inputEMAIL(driver, EMAIL);
		Registration.inputPHONE(driver, PHONE);
		Registration.inputADDRESS1(driver, ADDRESS1);
		Registration.inputADDRESS2(driver, ADDRESS2);
		Registration.inputCITY(driver, CITY);
		Registration.inputSTATE(driver, STATE);
		Registration.inputZIP(driver, ZIP);
		Registration.inputCOUNTRY(driver, COUNTRY);

		Registration.inputLANGUAGE_PREFERENCE(driver, LANGUAGE_PREFERENCE);
		Registration.inputFAVOURITE_CATEGORY(driver, FAVOURITE_CATEGORY);
		Registration.clickMyList(driver);
		Registration.clickMyBanner(driver);

		Registration.clickSaveAccountInfo(driver);

		HomePage.wait2();

		PetStoreMenu.clickSignInButton(driver);
		HomePage.wait2();
		SignIn.inputUsername(driver, USER_ID);
		SignIn.getPassword(driver).clear();
		SignIn.inputPassword(driver, NEW_PASSWORD);
		HomePage.wait2();
		SignIn.clickLogIn(driver);
		HomePage.wait2();
		boolean ExistSignOut = driver.findElement(By.xpath(PetStoreMenu.SIGNOUT_BUTTON)).isDisplayed();

		sa.assertEquals(ExistSignOut, true, "Log In Unsuccesful!");

		sa.assertAll();
		driver.close();
	}

	@Test
	
	// Test for registering users read from Excell table
	
	public void Test2ExcelUsers() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Registration.URLREGISTRATION);
		driver.manage().window().maximize();
		String DATA_SOURCE = "MOCK_DATA.xlsx";
		HomePage.wait2();

		String USER_ID, NEW_PASSWORD, REPEAT_PASSWORD, FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS1, ADDRESS2, CITY,
				STATE, ZIP, COUNTRY, LANGUAGE_PREFERENCE, FAVOURITE_CATEGORY;

		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < 51; i++) {
			
			USER_ID = ExcelUtils.getDataAtNum(i, 0);
			NEW_PASSWORD = ExcelUtils.getDataAt(i, 1);
			REPEAT_PASSWORD = ExcelUtils.getDataAt(i, 1);
			FIRST_NAME = ExcelUtils.getDataAt(i, 2);
			LAST_NAME = ExcelUtils.getDataAt(i, 3);
			EMAIL = ExcelUtils.getDataAt(i, 4);
			PHONE = ExcelUtils.getDataAt(i, 5);
			ADDRESS1 = ExcelUtils.getDataAt(i, 6);
			ADDRESS2 = ExcelUtils.getDataAt(i, 7);
			CITY = ExcelUtils.getDataAt(i, 8);
			STATE = ExcelUtils.getDataAt(i, 9);
			ZIP = ExcelUtils.getDataAtNum(i, 10);
			COUNTRY = ExcelUtils.getDataAt(i, 11);
			LANGUAGE_PREFERENCE = ExcelUtils.getDataAt(i, 12);
			FAVOURITE_CATEGORY = ExcelUtils.getDataAt(i, 13);

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			Registration.inputUSER_ID(driver, USER_ID);
			Registration.inputNEW_PASSWORD(driver, NEW_PASSWORD);
			Registration.inputREPEAT_PASSWORD(driver, REPEAT_PASSWORD);
			HomePage.wait2();
			Registration.inputFIRST_NAME(driver, FIRST_NAME);
			Registration.inputLAST_NAME(driver, LAST_NAME);
			Registration.inputEMAIL(driver, EMAIL);
			Registration.inputPHONE(driver, PHONE);
			Registration.inputADDRESS1(driver, ADDRESS1);
			Registration.inputADDRESS2(driver, ADDRESS2);
			Registration.inputCITY(driver, CITY);
			Registration.inputSTATE(driver, STATE);
			Registration.inputZIP(driver, ZIP);
			Registration.inputCOUNTRY(driver, COUNTRY);
			HomePage.wait2();
			Registration.inputLANGUAGE_PREFERENCE(driver, LANGUAGE_PREFERENCE);
			Registration.inputFAVOURITE_CATEGORY(driver, FAVOURITE_CATEGORY);
			Registration.clickMyList(driver);
			Registration.clickMyBanner(driver);
			HomePage.wait2();

			Registration.clickSaveAccountInfo(driver);

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			HomePage.wait2();
			boolean ExistSignOut = driver.findElements(By.xpath(PetStoreMenu.SIGNOUT_BUTTON)).size() > 0;
			if(ExistSignOut) {
				PetStoreMenu.clickSignOutButton(driver);
				HomePage.wait2();
			}
			PetStoreMenu.clickSignInButton(driver);
			HomePage.wait2();
			SignIn.getUsername(driver).clear();
			SignIn.inputUsername(driver, USER_ID);
			SignIn.getPassword(driver).clear();
			SignIn.inputPassword(driver, NEW_PASSWORD);
			HomePage.wait2();
			SignIn.clickLogIn(driver);
			HomePage.wait2();
			ExistSignOut = driver.findElement(By.xpath(PetStoreMenu.SIGNOUT_BUTTON)).isDisplayed();

			sa.assertEquals(ExistSignOut, true, "Log In Unsuccesful!");

			driver.navigate().to(Registration.URLREGISTRATION);

			Registration.getUSER_ID(driver).clear();
			Registration.getNEW_PASSWORD(driver).clear();
			Registration.getREPEAT_PASSWORD(driver).clear();

			Registration.getFIRST_NAME(driver).clear();
			Registration.getLAST_NAME(driver).clear();
			Registration.getEMAIL(driver).clear();
			Registration.getPHONE(driver).clear();
			Registration.getADDRESS1(driver).clear();
			Registration.getADDRESS2(driver).clear();
			Registration.getCITY(driver).clear();

			Registration.getSTATE(driver).clear();
			Registration.getZIP(driver).clear();
			Registration.getCOUNTRY(driver).clear();

		
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			;
			}

		sa.assertAll();
		driver.close();
		
	}
	
	@Test
	
	// Test for loging users read from Excell table
	public void Test3LogIn() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.URLPETSTORE);
		driver.manage().window().maximize();
		String DATA_SOURCE = "MOCK_DATA.xlsx";
		HomePage.wait2();

		String USER_ID, NEW_PASSWORD, REPEAT_PASSWORD, FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS1, ADDRESS2, CITY,
				STATE, ZIP, COUNTRY, LANGUAGE_PREFERENCE, FAVOURITE_CATEGORY;

		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < 51; i++) {
			driver.navigate().to(SignIn.URLSIGNIN);
			
			USER_ID = ExcelUtils.getDataAtNum(i, 0);
			NEW_PASSWORD = ExcelUtils.getDataAt(i, 1);
			

			SignIn.getUsername(driver).clear();
			SignIn.inputUsername(driver, USER_ID);
			SignIn.getPassword(driver).clear();
			SignIn.inputPassword(driver, NEW_PASSWORD);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HomePage.wait2();
			SignIn.clickLogIn(driver);
			HomePage.wait2();
			boolean ExistSignOut = driver.findElement(By.xpath(PetStoreMenu.SIGNOUT_BUTTON)).isDisplayed();

			sa.assertEquals(ExistSignOut, true, "Log In Unsuccesful!");
			
			PetStoreMenu.clickSignOutButton(driver);

		
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HomePage.wait2();
			}

		sa.assertAll();
		driver.close();
		
	}
@Test
	
	// Test for registering single randomly generated user
	
	public void Test4RandomUser() { 
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Registration.URLREGISTRATION);
		driver.manage().window().maximize();

		HomePage.wait2();


		int USER_ID = Registration.generateI();
		String NEW_PASSWORD = Registration.generateS();
		String FIRST_NAME = Registration.generateS();
		String LAST_NAME = Registration.generateS();
		String EMAIL = Registration.generateS();
		int PHONE = Registration.generateI();
		String ADDRESS1 = Registration.generateS();
		String ADDRESS2 = Registration.generateS();
		String CITY = Registration.generateS();
		String STATE = Registration.generateS();
		int ZIP = Registration.generateI();
		String COUNTRY = Registration.generateS();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		Registration.inputUSER_ID(driver, String.valueOf(USER_ID));
		Registration.inputNEW_PASSWORD(driver, NEW_PASSWORD);
		Registration.inputREPEAT_PASSWORD(driver, NEW_PASSWORD);
		Registration.inputFIRST_NAME(driver, FIRST_NAME);
		Registration.inputLAST_NAME(driver, LAST_NAME);
		Registration.inputEMAIL(driver, EMAIL);
		Registration.inputPHONE(driver, String.valueOf(PHONE));
		Registration.inputADDRESS1(driver, ADDRESS1);
		Registration.inputADDRESS2(driver, ADDRESS2);
		Registration.inputCITY(driver, CITY);
		Registration.inputSTATE(driver, STATE);
		Registration.inputZIP(driver, String.valueOf(ZIP));
		Registration.inputCOUNTRY(driver, COUNTRY);

		Registration.clickMyList(driver);
		Registration.clickMyBanner(driver);

		Registration.clickSaveAccountInfo(driver);

		HomePage.wait2();

		PetStoreMenu.clickSignInButton(driver);
		HomePage.wait2();
		SignIn.inputUsername(driver, String.valueOf(USER_ID));
		SignIn.getPassword(driver).clear();
		SignIn.inputPassword(driver, NEW_PASSWORD);
		HomePage.wait2();
		SignIn.clickLogIn(driver);
		HomePage.wait2();
		boolean ExistSignOut = driver.findElement(By.xpath(PetStoreMenu.SIGNOUT_BUTTON)).isDisplayed();

		sa.assertEquals(ExistSignOut, true, "Log In Unsuccesful!");

		sa.assertAll();
		driver.close();
	}
	
}
package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenu;

public class TestPetStoreMenu {


	@Test
	public static void Test1Left() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.URLPETSTORE);
		driver.manage().window().maximize();

/// Left fish menu 
		PetStoreMenu.clickLeftFish(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLLEFTFISH, currUrl);
		HomePage.wait2();
		driver.navigate().back();

/// Left dogs menu 
		PetStoreMenu.clickLeftDogs(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLLEFTDOGS, currUrl);
		HomePage.wait2();

/// Left cats menu 
		driver.navigate().back();
		PetStoreMenu.clickLeftCats(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLLEFTCATS, currUrl);
		HomePage.wait2();

/// Left reptiles menu 
		driver.navigate().back();
		PetStoreMenu.clickLeftReptiles(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLLEFTREPTILES, currUrl);
		HomePage.wait2();

/// Left birds menu 
		driver.navigate().back();
		PetStoreMenu.clickLeftBirds(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLLEFTBIRDS, currUrl);
		HomePage.wait2();

		sa.assertAll();
		driver.close();

	}

	@Test
	public static void Test2Top() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(PetStoreMenu.URLPETSTORE);
		driver.manage().window().maximize();

/// Top fish menu 

		PetStoreMenu.clickTopFish(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLTOPFISH, currUrl);
		HomePage.wait2();

/// Top dogs menu 
		driver.navigate().back();
		PetStoreMenu.clickTopDogs(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLTOPDOGS, currUrl);
		HomePage.wait2();

/// Top cats menu 
		driver.navigate().back();
		PetStoreMenu.clickTopCats(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLTOPCATS, currUrl);
		HomePage.wait2();

/// Top reptiles menu 
		driver.navigate().back();
		PetStoreMenu.clickTopReptiles(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLTOPREPTILES, currUrl);
		HomePage.wait2();

/// Top birds menu 
		driver.navigate().back();
		PetStoreMenu.clickTopBirds(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLTOPBIRDS, currUrl);
		HomePage.wait2();

		sa.assertAll();
		driver.close();
	}

	@Test
	public static void Test3Mid() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(PetStoreMenu.URLPETSTORE);
		driver.manage().window().maximize();

/// Middle fish menu 

		PetStoreMenu.clickMiddleFish(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLMIDDLEFISH, currUrl);
		HomePage.wait2();

/// Middle dogs menu 
		driver.navigate().back();
		PetStoreMenu.clickMiddleDogs(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLMIDDLEDOGS, currUrl);
		HomePage.wait2();

/// Middle reptiles menu 
		driver.navigate().back();
		PetStoreMenu.clickMiddleReptiles(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLMIDDLEREPTILES, currUrl);
		HomePage.wait2();

/// Middle cats menu 
		driver.navigate().back();
		PetStoreMenu.clickMiddleCats(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLMIDDLECATS, currUrl);
		HomePage.wait2();

/// Middle birds menu 
		driver.navigate().back();
		PetStoreMenu.clickMiddleBirds(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLMIDDLEBIRDS, currUrl);
		HomePage.wait2();

/// Middle parrot menu 
		driver.navigate().back();
		PetStoreMenu.clickMiddleParrot(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLMIDDLEPARROT, currUrl);
		HomePage.wait2();

		sa.assertAll();
		driver.close();
	}

	@Test
	public static void Test4SingIn() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get(PetStoreMenu.URLPETSTORE);
		driver.manage().window().maximize();

/// Sing in button
		PetStoreMenu.clickSignInButton(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreMenu.URLSIGNIN, currUrl);
		HomePage.wait2();
		driver.close();

	}
}

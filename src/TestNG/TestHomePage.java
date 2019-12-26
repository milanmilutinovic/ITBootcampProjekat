package TestNG;


	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;


public class TestHomePage {	
		
		
	  @Test
	  public static void testEnter() {
		  
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\testiranje\\Qa Selenium\\src\\chromedriver2.exe");
			WebDriver driver = new ChromeDriver();

			driver.get(HomePage.URL);

			driver.manage().window().maximize();
			
			HomePage.clickEnterStoreButton(driver);
			
			HomePage.wait2();
			
			String testUrl = driver.getCurrentUrl();
			
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(testUrl, "https://petstore.octoperf.com/actions/Catalog.action");
			
			
			sa.assertAll();
		  
			driver.close();
	  }
}
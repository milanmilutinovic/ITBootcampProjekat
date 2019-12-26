package page.objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static final String URL = "https://petstore.octoperf.com/";
	private static final String ENTER_THE_STORE_BUTTON_XPATH = "//a[contains(text(),'Enter the Store')]";
	
	public static WebElement getEnterStoreButton(WebDriver driver) {
		return driver.findElement(By.xpath(ENTER_THE_STORE_BUTTON_XPATH));
	}
	public static void clickEnterStoreButton(WebDriver driver) {
		getEnterStoreButton(driver).click();
	}
}
	


package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	public static final String URLSIGNIN = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
    
	private static final String TXTUsername_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
    private static final String TXTPassword_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]";
    private static final String BTNLOGIN_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]"; 

	/// Username

	public static WebElement getUsername(WebDriver driver) {
		return driver.findElement(By.xpath(TXTUsername_XPATH));
	}

	public static void clickUsername(WebDriver driver) {
		getUsername(driver).click();
	}

	public static void inputUsername(WebDriver driver, String data) {
		getUsername(driver).sendKeys(data);
	}

	/// Password
	
	//SignIn.getPassword(driver).clear();

	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(TXTPassword_XPATH));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}

	/// Log in

	public static WebElement getLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(BTNLOGIN_XPATH));
	}

	public static void clickLogIn(WebDriver driver) {
		getLogIn(driver).click();
	}

}

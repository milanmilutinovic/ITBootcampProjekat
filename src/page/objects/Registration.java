package page.objects;

import java.nio.charset.Charset;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static final String URLREGISTRATION = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	//ovde bi bio ispravan url kada bi uspeli da se registrujemo
	//public static final String URL3 = "";
	private static final String TXTUSER_ID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String TXTNEW_PASSWORD_XPATH = "//input[@name='password']";
	private static final String TXTREPEAT_PASSWORD_XPATH = "//input[@name='repeatedPassword']";
	private static final String TXTFIRST_NAME_XPATH = "//input[@name='account.firstName']";
	private static final String TXTLAST_NAME_XPATH = "//input[@name='account.lastName']";
	private static final String TXTEMAIL_XPATH = "//input[@name='account.email']";
	private static final String TXTPHONE_XPATH = "//input[@name='account.phone']";
	private static final String TXTADDRESS1_XPATH = "//input[@name='account.address1']";
	private static final String TXTADDRESS2_XPATH = "//input[@name='account.address2']";
	private static final String TXTCITY_XPATH = "//input[@name='account.city']";
	private static final String TXTSTATE_XPATH = "//input[@name='account.state']";
	private static final String TXTZIP_XPATH = "//input[@name='account.zip']";
	private static final String TXTCOUNTRY_XPATH = "//input[@name='account.country']";

	private static final String SELECT_LANGUAGE_PREFERENCE_XPATH = "//select[@name='account.languagePreference']";
	private static final String SELECT_FAVORITE_CATEGORY_XPATH = "//select[@name='account.favouriteCategoryId']";

	private static final String TXTENABLE_MYLIST = "//input[@name='account.listOption']";
	private static final String TXTENABLE_MYBANNER = "//input[@name='account.bannerOption']";

	private static final String BTNSUBMIT_XPATH = "//input[@name='newAccount']";
	private static final String BTNCHANGE_XPATH = "//input[@name='editAccount']";

	/// User ID
	public static WebElement getUSER_ID(WebDriver driver) {
		return driver.findElement(By.xpath(TXTUSER_ID_XPATH));
	}

	public static void clickUSER_ID(WebDriver driver) {
		getUSER_ID(driver).click();
	}

	public static void inputUSER_ID(WebDriver driver, String data) {
		getUSER_ID(driver).sendKeys(data);
	}

	
	/// New Password
	public static WebElement getNEW_PASSWORD(WebDriver driver) {
		return driver.findElement(By.xpath(TXTNEW_PASSWORD_XPATH));
	}

	public static void clickNEW_PASSWORD(WebDriver driver) {
		getNEW_PASSWORD(driver).click();
	}

	public static void inputNEW_PASSWORD(WebDriver driver, String data) {
		getNEW_PASSWORD(driver).sendKeys(data);
	}
	
	
	/// RepeatPassword
	public static WebElement getREPEAT_PASSWORD(WebDriver driver) {
		return driver.findElement(By.xpath(TXTREPEAT_PASSWORD_XPATH));
	}

	public static void clickREPEAT_PASSWORD(WebDriver driver) {
		getREPEAT_PASSWORD(driver).click();
	}

	public static void inputREPEAT_PASSWORD(WebDriver driver, String data) {
		getREPEAT_PASSWORD(driver).sendKeys(data);
	}


	/// FirstName
	public static WebElement getFIRST_NAME(WebDriver driver) {
		return driver.findElement(By.xpath(TXTFIRST_NAME_XPATH));
	}

	public static void clickFIRST_NAME(WebDriver driver) {
		getFIRST_NAME(driver).click();
	}

	public static void inputFIRST_NAME(WebDriver driver, String data) {
		getFIRST_NAME(driver).sendKeys(data);
	}


	
	/// LastName
	public static WebElement getLAST_NAME(WebDriver driver) {
		return driver.findElement(By.xpath(TXTLAST_NAME_XPATH));
	}

	public static void clickLAST_NAME(WebDriver driver) {
		getLAST_NAME(driver).click();
	}

	public static void inputLAST_NAME(WebDriver driver, String data) {
		getLAST_NAME(driver).sendKeys(data);
	}

	
	
	/// Email
	public static WebElement getEMAIL(WebDriver driver) {
		return driver.findElement(By.xpath(TXTEMAIL_XPATH));
	}

	public static void clickEMAIL(WebDriver driver) {
		getEMAIL(driver).click();
	}

	public static void inputEMAIL(WebDriver driver, String data) {
		getEMAIL(driver).sendKeys(data);
	}


	
	/// Phone
	public static WebElement getPHONE(WebDriver driver) {
		return driver.findElement(By.xpath(TXTPHONE_XPATH));
	}

	public static void clickPHONE(WebDriver driver) {
		getPHONE(driver).click();
	}

	public static void inputPHONE(WebDriver driver, String data) {
		getPHONE(driver).sendKeys(data);
	}

	
	
	/// Address1
	public static WebElement getADDRESS1(WebDriver driver) {
		return driver.findElement(By.xpath(TXTADDRESS1_XPATH));
	}

	public static void clickADDRESS1(WebDriver driver) {
		getADDRESS1(driver).click();
	}

	public static void inputADDRESS1(WebDriver driver, String data) {
		getADDRESS1(driver).sendKeys(data);
	}
	

	/// Address2
	public static WebElement getADDRESS2(WebDriver driver) {
		return driver.findElement(By.xpath(TXTADDRESS2_XPATH));
	}

	public static void clickADDRESS2(WebDriver driver) {
		getADDRESS2(driver).click();
	}

	public static void inputADDRESS2(WebDriver driver, String data) {
		getADDRESS2(driver).sendKeys(data);
	}

	
	
	/// City
	public static WebElement getCITY(WebDriver driver) {
		return driver.findElement(By.xpath(TXTCITY_XPATH));
	}

	public static void clickCITY(WebDriver driver) {
		getCITY(driver).click();
	}

	public static void inputCITY(WebDriver driver, String data) {
		getCITY(driver).sendKeys(data);
	}
	
	
	

	/// State
	public static WebElement getSTATE(WebDriver driver) {
		return driver.findElement(By.xpath(TXTSTATE_XPATH));
	}

	public static void clickSTATE(WebDriver driver) {
		getSTATE(driver).click();
	}

	public static void inputSTATE(WebDriver driver, String data) {
		getSTATE(driver).sendKeys(data);
	}

	
	
	/// Zip
	public static WebElement getZIP(WebDriver driver) {
		return driver.findElement(By.xpath(TXTZIP_XPATH));
	}

	public static void clickZIP(WebDriver driver) {
		getZIP(driver).click();
	}

	public static void inputZIP(WebDriver driver, String data) {
		getZIP(driver).sendKeys(data);
	}


	
	/// Country
	public static WebElement getCOUNTRY(WebDriver driver) {
		return driver.findElement(By.xpath(TXTCOUNTRY_XPATH));
	}

	public static void clickCOUNTRY(WebDriver driver) {
		getCOUNTRY(driver).click();
	}

	public static void inputCOUNTRY(WebDriver driver, String data) {
		getCOUNTRY(driver).sendKeys(data);
	}
	
	
	

	/// Language Preferences
	public static Select getLANGUAGE_PREFERENCE(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_LANGUAGE_PREFERENCE_XPATH)));
	}

	public static void inputLANGUAGE_PREFERENCE(WebDriver driver, String data) {
		getLANGUAGE_PREFERENCE(driver).selectByVisibleText(data);
	}
	

	/// Favourite Category

	public static Select getFAVOURITE_CATEGORY(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_FAVORITE_CATEGORY_XPATH)));
	}

	public static void inputFAVOURITE_CATEGORY(WebDriver driver, String data) {
		getFAVOURITE_CATEGORY(driver).selectByVisibleText(data);
	}

	/// Enable MyList

	public static WebElement getMyList(WebDriver driver) {
		return driver.findElement(By.xpath(TXTENABLE_MYLIST));
	}

	public static void clickMyList(WebDriver driver) {
		getMyList(driver).click();
	}
	
	/// Enable MyBanner

	public static WebElement getMyBanner(WebDriver driver) {
		return driver.findElement(By.xpath(TXTENABLE_MYBANNER));
	}

	public static void clickMyBanner(WebDriver driver) {
		getMyBanner(driver).click();
	}
	
	
	

	/// Save Account Information
	public static WebElement getSaveAccountInfo(WebDriver driver) {
		return driver.findElement(By.xpath(BTNSUBMIT_XPATH));
	}

	public static void clickSaveAccountInfo(WebDriver driver) {
		getSaveAccountInfo(driver).click();
	}
	
	//Save Change Account Information
	public static WebElement getChangeAccountInfo(WebDriver driver) {
		return driver.findElement(By.xpath(BTNCHANGE_XPATH));
	}

	public static void clickChangeAccountInfo(WebDriver driver) {
		getChangeAccountInfo(driver).click();
	}
	
	
	//Generates random String
	
	public static String generateS() {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    return generatedString;
	}
	
	//Generates Random int
	public static int generateI() {
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 999 
        int randi = rand.nextInt(100000)+800000;
	 
	    return randi;
	}
}

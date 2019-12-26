package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PetStoreMenu {
	public static final String URLPETSTORE = "https://petstore.octoperf.com/actions/Catalog.action";
	public static final String URLLEFTFISH = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String URLLEFTDOGS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String URLLEFTREPTILES = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String URLLEFTCATS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String URLLEFTBIRDS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String URLTOPFISH = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String URLTOPDOGS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String URLTOPREPTILES = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String URLTOPCATS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String URLTOPBIRDS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String URLMIDDLEFISH = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String URLMIDDLEDOGS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String URLMIDDLEREPTILES = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String URLMIDDLECATS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String URLMIDDLEBIRDS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String URLMIDDLEPARROT = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String URLSIGNIN = "https://petstore.octoperf.com/actions/Account.action?signonForm=";

	private static final String SIGNIN_BUTTON = "//a[contains(text(),'Sign In')]";
	private static final String MYACC_BUTTON = "//a[contains(text(),'My Account')]";
	public static final String SIGNOUT_BUTTON = "//a[contains(text(),'Sign Out')]";
	private static final String CART_BUTTON = "//img[@name='img_cart']";

	public static WebElement getSignInButton(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN_BUTTON));
	}

	public static void clickSignInButton(WebDriver driver) {
		getSignInButton(driver).click();
	}

	public static WebElement getMyAccButton(WebDriver driver) {
		return driver.findElement(By.xpath(MYACC_BUTTON));
	}

	public static void clickMyAccButton(WebDriver driver) {
		getMyAccButton(driver).click();
	}

	public static WebElement getSignOutButton(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT_BUTTON));
	}

	public static void clickSignOutButton(WebDriver driver) {
		getSignOutButton(driver).click();
	}
	
	public static WebElement getCartButton(WebDriver driver) {
		return driver.findElement(By.xpath(CART_BUTTON));
	}

	public static void clickCartButton(WebDriver driver) {
		getCartButton(driver).click();
	}
	
		public static WebElement getLeftFish(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='Content']//a[1]//img[1]"));
	}

	public static void clickLeftFish(WebDriver driver) {
		getLeftFish(driver).click();
	}

	public static WebElement getLeftDogs(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='Content']//a[2]//img[1]"));
	}

	public static void clickLeftDogs(WebDriver driver) {
		getLeftDogs(driver).click();
	}

	public static WebElement getLeftCats(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='Content']//a[3]//img[1]"));
	}

	public static void clickLeftCats(WebDriver driver) {
		getLeftCats(driver).click();
	}

	public static WebElement getLeftReptiles(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='Content']//a[4]//img[1]"));
	}

	public static void clickLeftReptiles(WebDriver driver) {
		getLeftReptiles(driver).click();
	}

	public static WebElement getLeftBirds(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='Content']//a[5]//img[1]"));
	}

	public static void clickLeftBirds(WebDriver driver) {
		getLeftBirds(driver).click();
	}

	public static WebElement getTopFish(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='QuickLinks']//a[1]//img[1]"));
	}

	public static void clickTopFish(WebDriver driver) {
		getTopFish(driver).click();
	}

	public static WebElement getTopDogs(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/a[2]/img[1]"));
	}

	public static void clickTopDogs(WebDriver driver) {
		getTopDogs(driver).click();
	}

	public static WebElement getTopReptiles(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='Header']//a[3]//img[1]"));
	}

	public static void clickTopReptiles(WebDriver driver) {
		getTopReptiles(driver).click();
	}

	public static WebElement getTopCats(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='Header']//a[4]//img[1]"));
	}

	public static void clickTopCats(WebDriver driver) {
		getTopCats(driver).click();
	}

	public static WebElement getTopBirds(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='Header']//a[5]//img[1]"));
	}

	public static void clickTopBirds(WebDriver driver) {
		getTopBirds(driver).click();
	}

	public static WebElement getMiddleFish(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[2]"));
	}

	public static void clickMiddleFish(WebDriver driver) {
		getMiddleFish(driver).click();
	}

	public static WebElement getMiddleDogs(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[3]"));
	}

	public static void clickMiddleDogs(WebDriver driver) {
		getMiddleDogs(driver).click();
	}

	public static WebElement getMiddleReptiles(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[4]"));
	}

	public static void clickMiddleReptiles(WebDriver driver) {
		getMiddleReptiles(driver).click();
	}

	public static WebElement getMiddleCats(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[5]"));
	}

	public static void clickMiddleCats(WebDriver driver) {
		getMiddleCats(driver).click();
	}

	public static WebElement getMiddleBirds(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[6]"));
	}

	public static void clickMiddleBirds(WebDriver driver) {
		getMiddleBirds(driver).click();
	}

	public static WebElement getMiddleParrot(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[1]"));
	}

	public static void clickMiddleParrot(WebDriver driver) {
		getMiddleParrot(driver).click();
	}
}

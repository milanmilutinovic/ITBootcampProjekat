package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cats {

	public static final String URLCATS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";

	private static final String CAT_MANX_XPATH = "//a[contains(text(),'FL-DSH-01')]";
	private static final String CAT_PERSIAN_XPATH = "//a[contains(text(),'FL-DLH-02')]";
	
	public static WebElement getCatManx(WebDriver driver) {
		return driver.findElement(By.xpath(CAT_MANX_XPATH));
	}
	public static void clickCatManx(WebDriver driver) {
		getCatManx(driver).click();
	}


public static WebElement getCatPersian(WebDriver driver) {
	return driver.findElement(By.xpath(CAT_PERSIAN_XPATH));
}
public static void clickCatPersian(WebDriver driver) {
	getCatPersian(driver).click();
}
}


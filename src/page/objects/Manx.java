package page.objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Manx {

	
	public static final String URLMANX = "https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=FL-DSH-01";


	private static final String TAILESS_MANX_XPATH = "//tr[2]//td[5]//a[1]";
	
	public static WebElement getTailessManx(WebDriver driver) {
		return driver.findElement(By.xpath(TAILESS_MANX_XPATH));
	}
	public static void clickTailessManx(WebDriver driver) {
		getTailessManx(driver).click();
	}
	
	
}

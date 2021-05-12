package reusable.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	public static void launchBrows() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static void totype(WebElement element, String value) {
   element.sendKeys(value);
}

	public static void toClick(WebElement element) {
   element.click();
	}
	public static void toPassUrl(String url) {
driver.get(url);
}






}


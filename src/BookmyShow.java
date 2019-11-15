

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookmyShow {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("WebDriver.geckoDriver", "C:\\Users\\avips\\Desktop\\Repo\\SeleniumExamples\\src");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='__top-cities']/ul/li[3]")));
		driver.findElement(By.xpath("//div[@class='__top-cities']/ul/li[3]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-search-box")));
		
		driver.findElement(By.id("input-search-box")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//a[contains(@data-ga-label,'HINDI')]"));
		
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
	}
}

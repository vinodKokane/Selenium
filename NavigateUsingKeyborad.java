package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateUsingKeyborad {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",".\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.linkText("Videos"));
		element.sendKeys(Keys.CONTROL,Keys.RETURN);
	}
}

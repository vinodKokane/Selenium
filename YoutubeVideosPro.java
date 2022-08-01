package auto;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class YoutubeVideosPro {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException ,IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		test();
	}

	public static void test() throws InterruptedException, IOException {
		TakesScreenshot ts =((TakesScreenshot)driver);
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		searchBox.sendKeys("street food");
		Thread.sleep(1000);
		WebElement search_btn = driver.findElement(By.id("search-icon-legacy"));
		search_btn.click();
		Thread.sleep(1000);
		WebElement image = driver.findElement(By.xpath("//img[contains(@src,'https://i.ytimg.com/vi/k')]"));
		image.click();
		Thread.sleep(2000);

		Date d = new Date();

		String fname = d.toString().replace(":", "_");

		File src = image.getScreenshotAs(OutputType.FILE);

		File dest = new File(".\\ScreenShots\\Img001" + fname + ".png");

		FileHandler.copy(src, dest);
	}
}

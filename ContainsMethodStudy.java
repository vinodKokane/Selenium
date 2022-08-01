package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsMethodStudy {
	static WebDriver driver;

	public static void main(String[] args) {
		launch();
		test();
		tearDown();
	}

	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	public static void test() {
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'in your life.')]"));
		String text =element.getText();
		System.out.println("Text : "+text);
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}

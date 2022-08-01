package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static void main(String[] args) {

		/*System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.flipkart.com");
		System.out.println("Firefox Browser");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.google.com/");
		System.out.println("Chrome Browser");*/

		System.setProperty("webdriver.ie.driver", ".\\Driver\\IEDriverServer.exe");
		WebDriver driver3 = new InternetExplorerDriver();
		driver3.get("https://www.Amazon.com/");
		System.out.println("IE Browser");

	}

}
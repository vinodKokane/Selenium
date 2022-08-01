package auto;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowser {
	static WebDriver driver;
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		Scanner sc =new Scanner(System.in);
		System.out.println("On Which Browser You want Test pls Enter : ");
		String browser =sc.next();
		launch(browser);
		WebElement tab1 = driver.findElement(By.xpath("//a[text()='Paytm For Business']"));
		tab1.click();
		String text="";
		do {
			tab1.sendKeys(Keys.ARROW_DOWN);
			text=tab1.getAttribute("value");
			if(text.equals("Consumer Payments ")) {
				tab1.sendKeys(Keys.RETURN);
				break;
			}
		}while(!text.isEmpty());
		
	}

	public static void launch(String text) {
		if (text.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://paytm.com/");
		} else if (text.equals("Mozila")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		} else if (text.equals("edge")) {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
			driver = new InternetExplorerDriver();
			driver.get("https://www.lamborghini.com/en-en");
		}
		driver.manage().window().maximize();
	}
}

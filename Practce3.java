package auto;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practce3 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Dist Name : ");
		String dist_name = sc.next();
		launch();
		test(dist_name);
		tearDown();

	}

	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
	}

	public static void test(String dist) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='select your district']"));
		element.sendKeys(dist);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("argument[0].value='"+dist+"';",element);
		
		
		
		List<WebElement> drplist =driver.findElements(By.xpath("//*[@id=\"mah-district\"]/option"));
		int count=0;
		for(WebElement opt :drplist) {
			String text =opt.getText();
			System.out.println("Text : "+text);
			count++;
		}
		System.out.println("Total Option : "+count);
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}

package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {
	static WebDriver driver;

	public static void main(String[] args) {
		launch();
		test();
		tearDown();
	}
	
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
	}
	public static void test() {
		WebElement element1 = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select[1]"));
		element1.click();
		Select drp1 = new Select(element1);
		List<WebElement> option_list = drp1.getOptions();
		for(WebElement option : option_list) {
			String text =option.getText();
			if(text.equals("India")) {
				option.click();
				break;
			}
		}
	}
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}

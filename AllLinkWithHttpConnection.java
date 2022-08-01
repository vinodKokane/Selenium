package auto;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllLinkWithHttpConnection {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		int brokenUrl =0;
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		for(WebElement element :allLink) {
			String url =element.getAttribute("href");
			if(url==null||url.isEmpty()) {
				System.out.println("Link is Empty");
				continue;
			}
			URL link = new URL(url);
			
			HttpURLConnection con = (HttpURLConnection) link.openConnection();
			con.connect();
			if(con.getResponseCode()>=400) {
				System.out.println("This is Broken link : "+con.getResponseCode()+url);
				brokenUrl++;
			}
			else {
				System.out.println("Valid Link "+con.getResponseCode()+url);
			}
			
		}
	}
}

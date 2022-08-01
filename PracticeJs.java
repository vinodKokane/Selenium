package auto;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeJs {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://vctcpune.com/selenium/practice.html");
//
//		WebElement element = driver.findElement(By.xpath("//input[@placeholder='select your district']"));
////	element.sendKeys(dist);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", element);
//		js.executeScript("arguments[0].value='nashik';", element);

//		List<WebElement> all_links = driver.findElements(By.tagName("a"));

//		for (WebElement link : all_links) {
//			String name = link.getText();
//			System.out.println(name);
//		}
		driver.get("https://www.airtel.in/");

		WebElement links = driver.findElement(By.xpath("(//ul[@class='quick-actions-list'])[3]"));
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		List<WebElement> aLink = links.findElements(By.tagName("a"));

		for (int i = 0; i < aLink.size(); i++) {
			String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			aLink.get(i).sendKeys(tab);
		}
		Set<String> all_ids = driver.getWindowHandles();
		for (String id : all_ids) {
			if (!id.equals(parentId)) {
				driver.switchTo().window(id);
				System.out.println(driver.getTitle() + "\n" + id);
				System.out.println("-----------------------------------------------------------------");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		driver.close();

//	----------------------------------------------------------------------	
//		File excel = new File("excel file path");
//		Workbook workbook = WorkbookFactory.create(excel);
//		Sheet mySheet =workbook.getSheet("Sheet1");
//		int rcount = mySheet.getLastRowNum();
//		int cellCount = mySheet.getRow(rcount).getLastCellNum() -1;
//		Cell row = mySheet.getRow(1).getCell(0);
//		 CellType dataType = row.getCellType();
//		 if(dataType==CellType.STRING) {
//			 String uname = row.getStringCellValue();
//		 }
//		 else if(dataType == CellType.NUMERIC) 
//		 {
//			 double number = row.getNumericCellValue();
//		 }
//		----------------------------------------------------------------------
//		Properties pro = new Properties();
//		FileInputStream fis = new FileInputStream("Path of Properties file");
//		pro.load(fis);
//		String value =pro.getProperty("url");
//		return value;
//		----------------------------------------------------------------------
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("Path to stoare png file");
//		FileHandler.copy(src,dest);
//		-----------------------------------------
//		driver.switchTo().frame("id");
//		driver.manage().window().maximise();
//		driver.navigate().to("url");
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILISECONDS);
//		-----------------------------------------------
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");
//		js.executeScript("arguments[0].scrollIntoView(true)",element);
//		js.executeScript("arguments[0].value='Selenium';",element);
//		js.executeScript("argument[0].click();",element);
//		---------------------------------------------------------
//		WebDriverWait wait =new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOf(element));
//		------------------------------------------------------------------------
//		driver.manage().window().getSize();
//		Dimension d = new Dimension(400,400);
//		driver.manage().window().setSize(d);
//		---------------------------------------------------------------

//		driver.manage().window().getPosition();
//		Point p = new Point(300,100);
//		driver.manage().window().setPosition(p);

//		List<String> all_str = new ArrayList(all_ids);
//		for(int i=0;i<all_str.size();i++) {
//			String uid = all_str.get(i);
//			if(!uid.equals(parentId)) {
//				driver.close();
//			}

	}
}

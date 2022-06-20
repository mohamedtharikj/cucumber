package Helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions s;
	 public static Robot r;

	public static void lanuchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void lanuchUrl(String url) {
		driver.get(url);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static void toGetTitle() {
		String title = driver.getTitle();
		System.out.println("title" + title);

	}

	public static void togeturl() {
		String url = driver.getCurrentUrl();
		System.out.println("url" + url);

	}

	public static void toclose() {
		driver.quit();

	}
	public static void fillTxtBox(WebElement e,String val) {
		e.sendKeys(val);
		
	}
	
	public static  void btnclk(WebElement e) {
		e.click();
		
		
	}
	public static String toGetvalue(WebElement e) {
		String value = e.getAttribute("value");
		System.out.println(value);
		return value;
	}
	public static void toMoveelement(WebElement e) {
		 s=new Actions(driver);
		s.moveToElement(e).perform();
	}
	public static  void rightclk(WebElement e) {
		s=new Actions(driver);
		s.contextClick(e).perform();
	}	

	
	public static void doubleclk(WebElement e) {
		s=new Actions(driver);
		s.doubleClick(e).perform();
}
	public static void tocopy() throws AWTException {
		r=new  Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	public static  void toselect( WebElement ele,String val) {
		Select a=new Select(ele) ;
	a.selectByValue(val);
		

	}
	
	public static void totakesnap(String filename) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mavenclass1\\Screenshot"+filename+"png"); 
		FileUtils.copyFile(src, des);
	}

}

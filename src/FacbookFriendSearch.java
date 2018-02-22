import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FacbookFriendSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.id("email")).sendKeys("raghav_ch_09@yahoo.co.in");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Di@spark@1984");
		
		WebElement element = driver.findElement(By.xpath("//input[starts-with(@id,'u_0_')]"));
		WebDriverWait wait = new WebDriverWait(driver, 5);
		System.out.println(element.isDisplayed());
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		System.out.println(element.isDisplayed());
		
		element.click();
		
		
		
		
		driver.findElement(By.xpath("//*[@id='navItem_1286155331']/a/div")).click();
		

	}

}

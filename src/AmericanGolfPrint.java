import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AmericanGolfPrint {

	public static void main(String[] args) {
		//https://www.americangolf.co.uk/
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.americangolf.co.uk/");
		
		driver.findElement(By.xpath("//*[@id='header-navigation']/div[2]/div[4]/div/div[2]/a/i")).click();

		System.out.println(driver.findElement(By.xpath("//*[@id='cart']/h1")).getText());
	}

}

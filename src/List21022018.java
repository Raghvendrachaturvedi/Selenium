import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class List21022018 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> totalcompanyName = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("Total Companies in today'List are "+totalcompanyName.size());
		

		List<WebElement> companyprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		//To Print all the companies name
		
		for(int i=0;i<totalcompanyName.size();i++){
			System.out.println(totalcompanyName.get(i).getText()+"........."+companyprice.get(i).getText());
		}
		
		
		
		
		
		

	}

}

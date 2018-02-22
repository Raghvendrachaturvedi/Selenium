import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CompanyNameBasedonPrice {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.14.0-win64\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> AllCell = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		getrpownum(169.75);
	}
	
	public static String getrpownum(double price){
		
		
		List<WebElement> Allrow = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[]/td"));
		System.out.println(Allrow.size());
		return null;
		
	}

}

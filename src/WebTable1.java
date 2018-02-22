import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTable1 {

	public static void main(String[] args) {
		
		String WanttedC = "Firstsource Solution";
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> CompanyName = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> CompanyPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		
		
		//Total no of companies
		
		System.out.println("Total no of companies IN Today's list.."+CompanyName.size());
		
		for(int i=0;i<CompanyName.size();i++){
			
			if(CompanyName.get(i).getText().equals(WanttedC)){
				System.out.println(CompanyName.get(i).getText()+"..and Price of this company is.."+ CompanyPrice.get(i).getText());	
				break;
			}
		}
	
	}
}

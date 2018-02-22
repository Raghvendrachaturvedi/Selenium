import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PrintWholeTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> TableList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for(int j=0;j<TableList.size();j++){
			System.out.println(TableList.get(j).getText());
		}
		
//		String company = "Dena Bank";
//		
//		List<WebElement> CompanyName = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
//		List<WebElement> companyPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
//		for(int i =0;i<CompanyName.size();i++){
//			if(CompanyName.get(i).getText().equals(company))
//			
//			{
//				System.out.println(CompanyName.get(i).getText()+"and company price is..."+companyPrice.get(i).getText() );
//				break;
//			}
			
		}
		
		
		
		

	}



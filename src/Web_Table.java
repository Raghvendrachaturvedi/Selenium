
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Table {

	public static void main(String[] args) {
		
		String companyName="V-Guard Ind.Ltd.";
//		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Code\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total company names -> "+companyNames.size());
		System.out.println("Total current prices -> "+currentPrices.size());
	
		for(int i=0;i<companyNames.size();i++){
			if(companyName.equals(companyNames.get(i).getText())){
				System.out.println(companyNames.get(i).getText()+" ----- "+currentPrices.get(i).getText() );
				break;
			}
	
	}
		
		driver.get("http://www.qtpselenium.com/");
		driver.findElement(By.xpath("html/body/main/div[1]/div/div/div[4]/div/button[2]")).click();
		driver.findElement(By.xpath("html/body/main/div[1]/div/div[1]/div[3]/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("raghvendra.qa@gmail.com");
		
		

}}

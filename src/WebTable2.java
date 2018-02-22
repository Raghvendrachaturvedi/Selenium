import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTable2 {

	public static void main(String[] args) {
		String WanttedC = "Firstsource Solution";
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> ComapanyName = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> Rows =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		List<WebElement> Cols =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		
	
		for(int rnum=1;rnum<=Rows.size();rnum++){
			
			
			List<WebElement> cells = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+rnum+"]/td"));
			
			for(int cnum=0;cnum<cells.size();cnum++){
				if(cells.get(cnum).getText().equals(WanttedC))	
				{
					for(int dnum=cnum;dnum<cells.size();dnum++)
					System.out.print(cells.get(dnum).getText());
					System.out.print(cells.size());
					
					
					}
				}
				
				
			}
		
		}
		
	}



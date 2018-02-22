import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTablePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.findElements(By.xpath("//table[@class='dataTable']/tbody"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total no of rows in yoyr table are... "+rows.size());
		List<WebElement> Cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total no of cols in your Table are..."+Cols.size());
		for(int rnum=1;rnum<=rows.size();rnum++){
			
			List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+rnum+"]/td"));
			for(int cell=0;cell<row.size();cell++){
				System.out.println(row.get(cell).getText());
			}
			
		}						
	}

}

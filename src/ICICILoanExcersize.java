import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ICICILoanExcersize {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://loan.icicibank.com/asset-portal/auto-loan/check-eligibility?WT.mc_id=Desk_NLI_AL_Emical_EliCalIndex-CalEli");
	
		System.out.println("Hello");
		
		driver.findElement(By.xpath("//*[@id='check-eligibility-page']/div[4]/div/div/form/div[2]/div[1]/div/div/button/span[1]")).click();
		
	}

}

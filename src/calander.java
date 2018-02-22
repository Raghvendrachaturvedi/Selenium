import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class calander {

	public static void main(String[] args) throws ParseException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Code\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		
		String screenmonthyear = driver.findElement(By.xpath("html/body/div[2]/div[3]/div[3]/div/div[3]/div/div[1]/div/div")).getText();
		//System.out.println("Hello");
		//System.out.println("hello"+screenmonthyear);
		
		String date = "18/03/2018";
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date currentdate = new Date();
		
		Date d = df.parse(date);
		Date d1 = df1.parse(date);
		Date d2 = df2.parse(date);
		
		String month = new SimpleDateFormat("MMMM").format(d);
		 
		String year = new SimpleDateFormat("yyyy").format(d1);
		 
		
		String day = new SimpleDateFormat("d").format(d2);
		
		
//		System.out.println(day);
		
		String enteredmonthyear = month+" "+year;
		System.out.println(enteredmonthyear);
	
		
		if(enteredmonthyear.equalsIgnoreCase(screenmonthyear)){
			
			driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
			
		}else 
			if(d2.after(currentdate)){
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		{
			
		}

		
		
		
	}

}

package calenders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
		 driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
		selectDate("30","February","2023");
		
	}
		
		
		public static void selectDate(String exDay, String exMonth, String exYear)
		{
		String CurMonYear= driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(CurMonYear);
		
		String date[] = CurMonYear.split(" ");
		String month= date[0].trim();
		String year= date[1].trim();
		
		
	while(!((month.equals(exMonth))&&(year.equals(exYear))))
		{driver.findElement(By.xpath("//a[@title='Next']")).click();
		CurMonYear= driver.findElement(By.className("ui-datepicker-title")).getText();
		 
		 month= CurMonYear.split(" ")[0].trim();
		 year= CurMonYear.split(" ")[1].trim();
		}
try{ driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
}
catch(Exception e)
{
	System.out.println("wrong date: "+exMonth +" : "+exDay);
}
}
}


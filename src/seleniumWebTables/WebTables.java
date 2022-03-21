package seleniumWebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/webtables");
		
		//Method 1:
		////*[@id="app"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[2]
		////*[@id="app"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[2]
		////*[@id="app"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div/div[2]
		////*[@id="app"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[2]
		////*[@id="app"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[2]
		////span[@id='edit-record-2']//*[@stroke='currentColor']
		
	/*	String before_xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[";
		String after_xpath = "]/div/div[2]";
		
		for(int i=1; i<=4; i++)
		{
			String name= driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			
			System.out.println(name);
			if(name.contains("Gentry"))
			{ 
				driver.findElement(By.xpath("//span[@id='edit-record-"+i+"']//*[@stroke='currentColor']")).click();
		}
	}
*/  //Method 2:
		driver.findElement(By.xpath("//div[contains(text(),'Compliance')]/parent::div//following-sibling::div//span[@id='edit-record-2']")).click();
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]
}
}

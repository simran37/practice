package scrollInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollWebpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.ca");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");
		//js.executeScript("window.scrollTo(0,2000)");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement element= driver.findElement(By.xpath("//*[contains(text(),'Trending deals')]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		
		

	}

}

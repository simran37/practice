package windowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlingSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		String maint= driver.getWindowHandle();

driver.findElement(By.id("tabButton")).click();
	driver.findElement(By.id("windowButton")).click();
	Set<String> child=driver.getWindowHandles();//set is unordered
	List<String> childlist= new ArrayList<String>(child);
	//driver.switchTo().window(maint);
	for(String e: childlist)
	{
		String Title= driver.switchTo().window(e).getCurrentUrl();
		System.out.println(Title);
	}
	
	
	}

}

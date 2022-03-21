package seleniumFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.guru99.com/test/guru99home/");
			driver.switchTo().frame("a077aa5e");
			System.out.println("Switched to frame");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href = 'http://www.guru99.com/live-selenium-project.html']")).click();
			System.out.println("Clicked on frame image");
			
			String b= driver.getTitle();
			Thread.sleep(3000);
			System.out.println(b);
			
			driver.quit();
			

	}

}

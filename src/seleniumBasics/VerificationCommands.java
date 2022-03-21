package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerificationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
Boolean d= driver.findElement(By.xpath("//*[@id=\"select-class-example\"]/fieldset/legend")).isDisplayed();
System.out.println(d);
driver.findElement(By.xpath("//*[@value='radio1'][@name='radioButton']")).click();
Thread.sleep(2000);
Boolean c= driver.findElement(By.xpath("//*[@value='radio1'][@name='radioButton']")).isSelected();
if(c=true)
{System.out.println("Radio1 is selected-"+c);}
Boolean b= driver.findElement(By.id("openwindow")).isEnabled();
System.out.println("Button enabled-"+b);
Thread.sleep(2000);



driver.quit();
	}

}

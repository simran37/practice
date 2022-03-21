package seleniumLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.ebay.com/");
//driver.findElement
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[starts-with(text(),'register')]")).click();
driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Simran");
driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Jaura");
driver.findElement(By.cssSelector("#Email")).sendKeys("simranjaura7@gmail.com");
driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("mAny123@");
driver.findElement(By.xpath("//button[@name='EMAIL_REG_FORM_SUBMIT']")).click();
	}

}

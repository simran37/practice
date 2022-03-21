package seleniumLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.ebay.com/");
//driver.findElement
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElement(By.linkText("Motors")).click();

Select year = new Select(driver.findElement(By.name("Year")));
year.selectByVisibleText("2019");

Select make = new Select(driver.findElement(By.name("Make")));
make.selectByVisibleText("Blue Bird");

Select model = new Select(driver.findElement(By.name("Model")));
model.selectByVisibleText("All American RE");


Select trim = new Select(driver.findElement(By.name("Trim")));
trim.selectByVisibleText("AAC3109-3400 Bus (School) - Cab Forward");

Select engine = new Select(driver.findElement(By.name("Engine")));
engine.selectByValue("8.9L 8849CC 540Cu. In. l6 CNG");

driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(1000);
Boolean b= driver.findElement(By.xpath("//h2[text()='2019 Blue Bird All American RE']")).isDisplayed();
System.out.println(b);

driver.quit();

	}

}

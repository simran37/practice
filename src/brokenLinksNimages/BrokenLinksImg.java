package brokenLinksNimages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinksImg {
	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
		 driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com");
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of total links and images-->"+linkslist.size());
        ArrayList<WebElement> activeLinks = new ArrayList<WebElement>();
		for(int i=0; i<linkslist.size();i++)
		{
			if(linkslist.get(i).getAttribute("href")!= null)
			{
				activeLinks.add(linkslist.get(i));
			}
		}
		System.out.println("Size of active links and images-->"+activeLinks.size());
	for(int j=0; j<activeLinks.size(); j++)
	{
	HttpURLConnection connection	=(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
	connection.connect();
	String response= connection.getResponseMessage();
	connection.disconnect();
	System.out.println(activeLinks.get(j).getAttribute("href")+"-->"+response);
	}
	
	}

}

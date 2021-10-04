package generalPrograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentDemo 
{
	WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ALL Files\\ChromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void FluentScript() throws Exception
	{
		driver.get("https://localhost:44354/WebForm1.aspx");
		
		driver.findElement(By.id("txtName")).sendKeys("learning-guide");
		
		driver.findElement(By.id("btnSubmit")).click();
		
		
		//WebElement output = driver.findElement(By.id("lblOutput"));
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(20))
		       .pollingEvery(Duration.ofSeconds(15))
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() 
		   {
			   int i=1;
		     public WebElement apply(WebDriver driver) 
		     {
		    	 WebElement op = driver.findElement(By.id("lblOutput"));
		    	 if (op.isDisplayed())
		    	 {
		    		 System.out.println("Displayed");
		    		 return op;
		    	 }
		    	 else
		    	 {
		    		 System.out.println("Not Displayed :"+i);
		    		 i++;
		    		 return null;
		    	 }
		    	 
		     }
		   });
		   
		   System.out.println("Element is displayed :"+element);

	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}

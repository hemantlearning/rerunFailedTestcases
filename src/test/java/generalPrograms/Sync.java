package generalPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sync 
{
	WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ALL Files\\ChromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void Synchronization() throws Exception
	{
		driver.get("https://localhost:44354/WebForm1.aspx");
		driver.findElement(By.id("txtName")).sendKeys("learning-guide");
		driver.findElement(By.id("btnSubmit")).click();
		
		WebElement output = driver.findElement(By.id("lblOutput"));
		Thread.sleep(20000);
		Assert.assertTrue(output.isDisplayed());
		
		
		
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
	
	


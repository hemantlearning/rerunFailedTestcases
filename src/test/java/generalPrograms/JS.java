package generalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JS 
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
	public void testJS() throws Exception
	{
		driver.get("https://localhost:44354/Index.aspx");
		
		driver.findElement(By.id("txtName")).sendKeys("xyzabc");
		
		WebElement ButtonSubmit = driver.findElement(By.id("btnSubmit"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();", ButtonSubmit);
		
		Thread.sleep(5000);
		
		
	}

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}

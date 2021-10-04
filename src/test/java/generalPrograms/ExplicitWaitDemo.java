package generalPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWaitDemo 
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
	public void Synchronization() throws Exception
	{
		driver.get("https://localhost:44354/WebForm1.aspx");
		
		driver.findElement(By.id("txtName")).sendKeys("learning-guide");
		
		driver.findElement(By.id("btnSubmit")).click();
		
		WebElement output = driver.findElement(By.id("lblOutput"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOf(output));
		
		
		
		boolean status=output.isDisplayed();
		if(status)
		{
			System.out.println("Displayed");	
		}
		else {
			System.out.println("Not Displayed");
		}
		
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}

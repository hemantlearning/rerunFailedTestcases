package generalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadAutoIt 
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
	public void autoITDemo() throws Exception
	{
		driver.get("https://localhost:44354/Index.aspx");
		
		WebElement chooseFile = driver.findElement(By.id("inputUploadFile"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", chooseFile);
		
		Thread.sleep(10000);
		
		Runtime.getRuntime().exec("C:\\Users\\Hemant Rathod\\OneDrive\\Desktop\\AutoIT\\SelectFile.exe");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("FileUpload2")).click();
		
		String ExpectedResult = "File Uploaded successfully!!";
		
		Thread.sleep(4000);
		
		WebElement ActualResult = driver.findElement(By.id("lblMessage"));
		
		Assert.assertEquals(ActualResult.getText(), ExpectedResult)	;	
		
		
	}
	

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}

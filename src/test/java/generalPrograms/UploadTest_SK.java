package generalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadTest_SK 
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
	public void uploadTest() throws Exception {
		
		driver.get("https://localhost:44354/Index.aspx");
		//Thread.sleep(2000);
		WebElement choosefile = driver.findElement(By.xpath("//input[@name='FileUpload']"));
		//choosefile.click();
		JavascriptExecutor	js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", choosefile);
		Thread.sleep(10000);
		
		Runtime.getRuntime().exec("C:\\Users\\Hemant Rathod\\OneDrive\\Desktop\\AutoIT\\ChooseFile.exe");
		
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
package generalPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertDemo 
{

	WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ALL Files\\CD\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void AlertTest() throws Exception 
	{
		driver.get("https://demoqa.com/alerts");
		
//		//accept()
//		
//		driver.findElement(By.id("confirmButton")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		
//		alert.accept();
//		
//		WebElement Result = driver.findElement(By.id("confirmResult"));
//		
//		String actualResult = Result.getText();
//		
//		String ExpectedResult = "You selected Ok";
//		
//		Assert.assertEquals(actualResult, ExpectedResult);
//		
//		Thread.sleep(3000);
//		
		//dismiss()
//		driver.findElement(By.id("confirmButton")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		
//		alert.dismiss();
//		
//		WebElement Result = driver.findElement(By.id("confirmResult"));
//		
//		String actualResult = Result.getText();
//		
//		String ExpectedResult = "You selected Cancel";
//		
//		Assert.assertEquals(actualResult, ExpectedResult);
//		
//		Thread.sleep(3000);
		
		//sendkeys()
		driver.findElement(By.id("promtButton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = alert.getText();
		
		System.out.println(alertMessage);
		
		alert.sendKeys("Hemant");
		
		alert.accept();
		
		
		WebElement Result = driver.findElement(By.id("promptResult"));
		
		String actualResult = Result.getText();
		
		String ExpectedResult = "You entered Hemant";
		
		Assert.assertEquals(actualResult, ExpectedResult);
		
		Thread.sleep(6000);

	}
	

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}

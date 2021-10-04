package generalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExec 
{
	@Test
	public void JavaScriptDemo() throws Exception 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\ALL Files\\ChromeDriver\\chromedriver.exe");
	
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://localhost:44354/WebForm1.aspx");
		
		driver.findElement(By.id("txtName")).sendKeys("learning-guide");
		
		Thread.sleep(5000);
		
		WebElement eleSubmit = driver.findElement(By.id("btnSubmit"));
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();",eleSubmit);

	}
 
}

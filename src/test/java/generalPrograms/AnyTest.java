package generalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnyTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ALL Files\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://automationpractice.com/index.php");
		
		//driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
	
		driver.navigate().to("http://automationpractice.com/index.php");
				
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
				
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}

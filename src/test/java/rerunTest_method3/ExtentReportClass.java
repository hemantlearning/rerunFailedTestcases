package rerunTest_method3;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportClass 
{
	@Test
	public void MyFirstReport() 
	{
		//It will create an object of ExtentReport class
		ExtentReports extent = new ExtentReports();
		//It will create an object if ExtentSparkReporter class
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");//path where your html file will be generated, it will be created under project folder
		extent.attachReporter(spark);//attach the spark object to this method
		
		spark.config(
				  ExtentSparkReporterConfig.builder()
				    .theme(Theme.DARK)
				    .documentTitle("DocTitle")
				    .build()
				);
		spark.config().setReportName("RepoName");
		
		ExtentTest test = extent.createTest("LoginTest");// this will create a test node in the report
		test.pass("Login test started successfully");// this will create a test step node in the report
		test.info("url is loaded");
		test.info("A is loaded");
		test.info("B is loaded");
		test.fail("Login test failed");
		
		ExtentTest test1 = extent.createTest("OtherPage");// this will create a test node in the report
		test1.pass("Login test started successfully");// this will create a test step node in the report
		test1.info("url is loaded");
		test1.info("A is loaded");
		test1.info("B is loaded");
		test1.pass("Login test Passed");
		
		extent.flush();

	}
}

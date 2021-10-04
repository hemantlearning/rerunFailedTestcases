package rerunTest_method3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{
  
	int count =0;
	int retryChances = 2;
	@Override
	public boolean retry(ITestResult result) {
		if(count < retryChances) {
			count++;
			return true;
		}
		return false;
	}
}

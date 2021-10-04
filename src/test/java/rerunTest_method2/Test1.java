package rerunTest_method2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
  @Test(retryAnalyzer = rerunTest_method2.RetryLogic.class)
  public void TestMethod1() {
	  System.out.println("Failed : 1");
	  Assert.assertTrue(false);
  }
  @Test(retryAnalyzer = rerunTest_method2.RetryLogic.class)
  public void TestMethod2() {
	  System.out.println("Passed : 2");
  }
}

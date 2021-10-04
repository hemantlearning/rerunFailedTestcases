package rerunTest_method2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
  @Test(retryAnalyzer = rerunTest_method2.RetryLogic.class)
  public void TestMethod5() {
	  System.out.println("Passed : 5");
  }
  @Test(retryAnalyzer = rerunTest_method2.RetryLogic.class)
  public void TestMethod6() {
	  System.out.println("Failed : 6");
	  Assert.assertTrue(false);
  }
}

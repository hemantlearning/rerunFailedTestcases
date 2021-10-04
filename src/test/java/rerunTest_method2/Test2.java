package rerunTest_method2;

import org.testng.annotations.Test;

public class Test2 {
  @Test(retryAnalyzer = rerunTest_method2.RetryLogic.class)
  public void TestMethod3() {
	  System.out.println("Passed : 3");
  }
  @Test(retryAnalyzer = rerunTest_method2.RetryLogic.class)
  public void TestMethod4() {
	  System.out.println("Passed : 4");
  }
}

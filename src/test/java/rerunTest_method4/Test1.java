package rerunTest_method4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void TestMethod1() {
	  System.out.println("Failed : 1");
	  Assert.assertTrue(false);
  }
  @Test
  public void TestMethod2() {
	  System.out.println("Passed : 2");
  }
}

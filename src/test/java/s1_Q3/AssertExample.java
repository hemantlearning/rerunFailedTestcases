package s1_Q3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample {
  @Test
  public void TestMethod1() {
	  //HardAssert
	  System.out.println("HARD Assert");
	  Assert.assertEquals(1, 1);
	  System.out.println("Passed : 1");
	  Assert.assertEquals(2, 2);
	  System.out.println("Passed : 2");
	  Assert.assertEquals(3, 3);
	  System.out.println("Passed : 3");
	  Assert.assertEquals(5, 4);
	  System.out.println("Failed : 4");
	  Assert.assertEquals(5, 5);
	  System.out.println("Passed : 5");
	  Assert.assertEquals(6, 6);
	  System.out.println("Passed : 6");
	  
  }
  @Test
  public void TestMethod2() {
	  //SoftAssert
	  System.out.println("Soft Assert");
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(1, 1);
	  System.out.println("Passed : 1");
	  sa.assertEquals(2, 2);
	  System.out.println("Passed : 2");
	  sa.assertEquals(3, 3);
	  System.out.println("Passed : 3");
	  sa.assertEquals(5, 4);
	  System.out.println("Failed : 4");
	  sa.assertEquals(5, 5);
	  System.out.println("Passed : 5");
	  sa.assertEquals(6, 6);
	  System.out.println("Passed : 6");
	  
	  sa.assertAll();
	  
	  
  }
}

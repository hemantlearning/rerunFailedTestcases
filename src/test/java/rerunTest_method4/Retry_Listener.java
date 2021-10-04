package rerunTest_method4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Retry_Listener implements IAnnotationTransformer{
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(rerunTest_method3.RetryLogic.class);
	}
 
}

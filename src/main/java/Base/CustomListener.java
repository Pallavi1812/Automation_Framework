package Base;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentTest;

public class CustomListener extends TestBase{

   public ExtentTest extentTest;

   public CustomListener() throws IOException {
      super();
      // TODO Auto-generated constructor stub
   }

   public void onTestStart(ITestResult result) {
      // TODO Auto-generated method stub
      
   }

   public void onTestSuccess(ITestResult result) {
	   System.out.println("Test Pass");
      
   }

   public void onTestFailure(ITestResult result) {
      System.out.println("Test Failed");
   }

   
   public void onTestSkipped(ITestResult result) {
      // TODO Auto-generated method stub
      
   }

   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
      // TODO Auto-generated method stub
      
   }

   public void onStart(ITestContext context) {
      // TODO Auto-generated method stub
      
   }

   public void onFinish(ITestContext context) {
      // TODO Auto-generated method stub
      
   }
   
   
   
}

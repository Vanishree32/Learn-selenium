

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListernerImplementation extends Screenshot implements ITestListener {

    private WebDriver driver;
   
	
		@Override
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }	
    
    
    @Override		
    public void onTestFailure(ITestResult result) {	
    	System.out.println("Screenshot is not capturing");
    	Reporter.log("Hello",true);
    	
    	try {
    		
    		screenShottake();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	/*
    	test.fail(result.getThrowable());
    	String filePath=null;
    	try {
			 filePath=screenShottake(result.getMethod().getMethodName());
			test.addScreenCaptureFromPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(filePath,result.getMethod().getMethodName());
		}
    	 
    	*/
    	
    	
    	/*
    	try {
    getScreenshot(result.getName());
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
		
		}
			
    */
    	
    	
    	
    	
    }
    
  		
}

	



package TestNG_ListenerTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
	@Override		
    public void onFinish(ITestContext arg0) {					
        System.out.println("OnFinish method is invoked after " +arg0.getName());				
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
    	System.out.println("OnStart method is invoked before "+arg0.getName());					
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
    	System.out.println("OnTestFailed method is invoked");					
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
    	System.out.println("OnTestFailure method is invoked after "+arg0.getName()+" method");					
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
    	System.out.println("OnTestSkiped method is invoked when"+arg0.getName()+"method is skipped");					
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
    	System.out.println("OnTestStart method is invoked before calling"+arg0.getName());			
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
    	System.out.println("OnTestSuccess method is invoked when "+arg0.getName()+" method is passed");				
        		
    }		

}

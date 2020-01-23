package TestNGUtils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Retry implements IRetryAnalyzer {
	int retryCount = 0;
	int maxRetyCount = 2;

	
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetyCount) {
			
			System.out.println("Retrying test " + result.getName() + " with status "
                    + getResultStatusName(result.getStatus()) + " for the " + (retryCount+1) + " time(s).");
			retryCount++;
            return true;
			
			
		}	

		return false;
	}
	
	public String getResultStatusName(int status) {
    	String resultName = null;
    	if(status==1)
    		resultName = "SUCCESS";
    	if(status==2)
    		resultName = "FAILURE";
    	if(status==3)
    		resultName = "SKIP";
		return resultName;
    }

}

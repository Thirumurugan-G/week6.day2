package retry_Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAgain implements IRetryAnalyzer
{


	public boolean retry(ITestResult result) {
		int count=0;
		if(count<1)
		{
			count++;
			return true;
		}
		return false;
	}
	
}

package Section18;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
		@Override
		public void onTestSuccess(ITestResult result)
		{
			System.out.println("I am successfully executed Listner Pass Code!");
		}
		
		@Override
		public void onTestFailure(ITestResult result)
		{
			System.out.println("I am failed Listner Pass Code!"+result.getName());
		}

}

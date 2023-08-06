package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
/*ITestListener 
 *     bultin interface
 *     onstart, finish, testsucess, testfailure, ontestskip
 *     class> interface=> class definition=> implements ITestListener 
 *     right click=> source=> override/implement methods
 *   * */
public class l1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("sucess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finished");
	}
	
	

}

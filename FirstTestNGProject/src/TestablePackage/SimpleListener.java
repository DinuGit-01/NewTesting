package TestablePackage;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class SimpleListener extends TestListenerAdapter {

	public void onTestStart(ITestResult tr) {
		System.out.println("test start.....");
	}

	
	public void onTestSuccess(ITestResult tr) {

		System.out.println("test Success.....");
	}
	
	
	public void onTesFailure(ITestResult tr) {
		System.out.println("test Failed....");

	}

	public void onTestSkipped(ITestResult tr) {

		System.out.println("test Skipped.....");
	}
}

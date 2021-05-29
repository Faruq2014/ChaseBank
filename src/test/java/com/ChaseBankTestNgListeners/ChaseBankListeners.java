package com.ChaseBankTestNgListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ChaseBankListeners implements ITestListener{

	// if eclipse do not bring options to import then 
	// right click>> source>> override/implements methods.
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case start>>>>   " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case pass>>>>   " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case fail>>>>   " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped>>>>   " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on test  "+ context.getName()+" starts >>>>   " );
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on test  "+ context.getName()+" finish >>>>   " );
	}

}

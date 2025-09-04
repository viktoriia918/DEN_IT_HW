package aqa_hw_7.task_2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Start of test:" + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test was successful:" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The test failed:" + result.getName());
        System.out.println("Cause:" + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test missed: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Running the test:" + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test completion: " + context.getName());
    }
}
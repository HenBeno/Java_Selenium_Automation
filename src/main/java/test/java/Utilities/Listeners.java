package test.java.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends CommonOps implements ITestListener {
    public void onFinish(ITestContext contextFinish) {
        try {
            ScreenRecorderUtil.stopRecord();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("onFinish method finished");

    }

    public void onStart(ITestContext contextStart) {
        System.out.println("onStart method started");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test: " + result.getName() + " failed with certain success of " + result.getName() + " percentage");

    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test: " + result.getName() + " fail");

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Method skipped " + result.getName());

    }

    public void onTestStart(ITestResult result) {
        try {
            ScreenRecorderUtil.startRecord(result.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test: " + result.getName() + " started");

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test: " + result.getName() + " passed");

    }
}

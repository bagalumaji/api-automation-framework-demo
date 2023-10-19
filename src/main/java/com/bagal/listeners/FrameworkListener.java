package com.bagal.listeners;

import com.bagal.report.ExtentReport;
import com.bagal.report.ExtentReportLogger;
import org.testng.*;
import org.testng.annotations.Test;

public class FrameworkListener implements ITestListener, ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReport();
    }

    @Override
    public void onFinish(ISuite suite) {
        ExtentReport.flushReport();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).description());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReportLogger.pass(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).description()+ " is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentReportLogger.pass(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).description()+" is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentReportLogger.pass(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).description()+" is skipped");
    }
}

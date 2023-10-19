package com.coforge.report;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.coforge.constants.FrameworkConstants;
import com.coforge.utils.EnvironmentUtil;


import java.util.Objects;

public final class ExtentReport {
    private ExtentReport(){}
    private static ExtentReports extentReports;
    public static void initReport(){
        if(Objects.isNull(extentReports)) {
            extentReports = new ExtentReports();
            ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(FrameworkConstants.getExtentReportPath());
            extentSparkReporter.config().setReportName("Api Automation Report");
            extentSparkReporter.config().setDocumentTitle("Test Fire Api Report");
            extentSparkReporter.config().setTheme(Theme.DARK);
            extentSparkReporter.config().setEncoding("uft-8");
            extentReports.attachReporter(extentSparkReporter);
            extentReports.setSystemInfo("Environment", EnvironmentUtil.getCurrentEnvironment());
            extentReports.setSystemInfo("Automation Engineer","Umaji Bagal");
        }
    }

    public static void flushReport(){
        if(Objects.nonNull(extentReports)){
            extentReports.flush();
            ExtentManager.unload();
        }
    }
    public static void createTest(String testCaseName){
        ExtentManager.setExtentTest(extentReports.createTest(testCaseName));
    }
}
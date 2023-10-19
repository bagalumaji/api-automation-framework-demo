package com.bagal.constants;

import lombok.Getter;

public class FrameworkConstants {
    private @Getter static final String projectBasePath=System.getProperty("user.dir");
    private @Getter static final String loginTestDataFile=projectBasePath+"\\src\\test\\resources\\testdata\\LoginData.json";
    private @Getter static final String extentReportPath="";
}

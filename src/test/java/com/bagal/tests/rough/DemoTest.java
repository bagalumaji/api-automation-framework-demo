package com.bagal.tests.rough;

import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void demoTest(){
       String baseProjectPath =  System.getProperty("user.dir");
        System.out.println("baseProjectPath = " + baseProjectPath);
    }
}

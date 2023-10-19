package com.bagal.restutils;

import org.testng.Assert;

public final class VerifyStatusCodeUtil {
    private VerifyStatusCodeUtil(){}

    private static void verifyStatusCode(int actual,int expected){
        Assert.assertEquals(actual,expected);
    }

    public static void verify200StatusCode(int actual){
        verifyStatusCode(actual,200);
    }
    public static void verify201StatusCode(int actual){
        verifyStatusCode(actual,201);
    }
    public static void verify204StatusCode(int actual){
        verifyStatusCode(actual,204);
    }

}

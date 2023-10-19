package com.bagal.tests.login;

import com.bagal.api.LoginApi;
import com.bagal.constants.ApiConstants;
import com.bagal.restutils.VerifyStatusCodeUtil;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginTests {

    @Test(priority = 1,description = "verify user is able to login to application")
    public void performLoginTest() {

        // arrange
        Map<String,String> map = new HashMap<>();
        map.put("username","jsmith");
        map.put("password","demo1234");

        // act
        Response response = LoginApi.loginUser(map);

        String authorization = response.jsonPath().getString("Authorization");
        ApiConstants.setAuthorizationToken(authorization);

        //assert
        VerifyStatusCodeUtil.verify200StatusCode(response.getStatusCode());
    }

    @Test(priority = 2,description = "verify user is logged in to application")
    public void verifyUserIsLoggedInTest() {
        Response response = LoginApi.checkUserLoggedIn();
        VerifyStatusCodeUtil.verify200StatusCode(response.getStatusCode());
    }

}

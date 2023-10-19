package com.bagal.specs;

import com.bagal.constants.ApiConstants;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RequestSepc {
    public static RequestSpecification getRequestSpecification(){
         return given().baseUri(ApiConstants.getBaseUri())
                .header("Authorization",ApiConstants.getAuthorizationToken())
                .log()
                .all();
    }
    public static RequestSpecification getRequestSpecification(Object body){
        return given().baseUri(ApiConstants.getBaseUri())
                .contentType(ApiConstants.getContentType())
                .body(body)
                .log()
                .all();
    }

}

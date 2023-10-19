package com.bagal.api;

import com.bagal.endpoints.EndPoints;
import com.bagal.specs.RequestSepc;
import io.restassured.response.Response;

public class LoginApi {

    public static Response loginUser(Object body){
       return  RequestSepc.getRequestSpecification(body)
                .when()
                .post(EndPoints.getLoginEndPoint());
    }
    public static Response checkUserLoggedIn(){
        return RequestSepc
                .getRequestSpecification()
                . when()
                .get(EndPoints.getLoginEndPoint());
    }

}

package com.bagal.constants;

import lombok.Getter;
import lombok.Setter;

public class ApiConstants {
    private @Getter static final String baseUri ="https://demo.testfire.net/api";
    private @Getter @Setter
    static String authorizationToken;

    private @Getter static final String contentType= "application/json";

}

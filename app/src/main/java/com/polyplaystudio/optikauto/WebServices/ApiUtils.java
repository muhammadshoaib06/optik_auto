package com.polyplaystudio.optikauto.WebServices;

public class ApiUtils {
    private static final String BASE_URL = "https://inveoa.com/api/";

    // public static final String URL_REGISTER = BASE_URL + "/signup";
    // public static final String URL_LOGIN = BASE_URL + "/login";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}

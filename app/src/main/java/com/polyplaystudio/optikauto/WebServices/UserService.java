package com.polyplaystudio.optikauto.WebServices;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public abstract class UserService {

    @GET("login/{username}/{password}")
    public abstract Call login(@Path("username") String username, @Path("password") String password);

}

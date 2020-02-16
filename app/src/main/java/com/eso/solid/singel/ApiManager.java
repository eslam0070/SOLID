package com.eso.solid.singel;

import retrofit2.Retrofit;

/*A class should have only one job to do*/
public class ApiManager {

    // only one job
    public final String BASE_URL = "";
    private static Retrofit retrofit = null;

    public static Interface getRetrofit(){

        return retrofit.create(Interface.class);
    }
}

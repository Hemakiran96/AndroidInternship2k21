package com.example.covid19;

import retrofit2.call;
import retrofit2.http.GET;
import retrofit2.http.path;
public interface Myinterface {
    @GET("dayone/country/{input}")
    Call<String> getValue(@Path("input") String i);

}

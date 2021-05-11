package com.edouardondo.moneyklap.retrofitClient

import com.edouardondo.moneyklap.model.User
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface Api {

    @POST("register.php")
    @FormUrlEncoded
    fun register(
        @Field("userFirstName") userFirstName : String,
        @Field("userLastName") userLastName: String,
        @Field("userEmail") userEmail: String,
        @Field("userPassword") userPassword: String) : Call<User>

    @POST("login.php")
    @FormUrlEncoded
    fun login(
        @Field("userEmail") userEmail : String,
        @Field("userPassword") userPassword : String
    ) : Call<User>
}
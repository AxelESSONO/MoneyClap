package com.edouardondo.moneyklap.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User(
    @SerializedName("userId")
    var userId: Int,

    @SerializedName("userFirstName")
    var userFirstName: String,

    @SerializedName("userLastName")
    var userLastName: String,

    @SerializedName("userEmail")
    var userEmail: String,

    @SerializedName("userPassword")
    var userPassword: String,

    @SerializedName("isSuccess")
    var isSuccess: Int,

    @SerializedName("message")
    var message: String
) : Serializable

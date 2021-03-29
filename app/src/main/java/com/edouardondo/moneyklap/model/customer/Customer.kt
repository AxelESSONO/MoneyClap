package com.edouardondo.moneyklap.model.customer

import com.edouardondo.moneyklap.R
import java.io.Serializable

data class Customer(
    var id: String,
    var image : Int = R.drawable.axel,
    var customerType : String,
    var customerCountry: String,
    var customerCity: String,
    var customerPhoneNumber : String="",
    var firstName: String = "Axel",
    var lastName: String = "ESSONO") : Serializable

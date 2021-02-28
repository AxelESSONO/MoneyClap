package com.edouardondo.moneyclap.model.customer

data class Customer(
    var id: String,
    var customerType : String,
    var customerCountry: String,
    var customerCity: String,
    var customerPhoneNumber : String="",
    var firstName: String = "",
    var lastName: String = "")

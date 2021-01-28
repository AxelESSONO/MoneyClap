package com.edouardondo.moneyclap.model.customer

data class Customer(
    var customerId: String,
    var firstName: String,
    var lastName: String,
    var customerPhoneNumber : String,
    var customerCity: String,
    var customerCountry: String)

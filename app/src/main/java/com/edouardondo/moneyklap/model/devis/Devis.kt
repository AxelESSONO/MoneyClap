package com.edouardondo.moneyklap.model.devis

import com.edouardondo.moneyklap.model.customer.Customer

data class Devis(
    var ref: String,
    var sender: Customer,
    var receiverId: String,
    var countryFrom: String,
    var to: String,
    var amountSent: Float,
    var amountReceived: Float,
    var date: String,
    var time: String,
    var transactionFees: Float)

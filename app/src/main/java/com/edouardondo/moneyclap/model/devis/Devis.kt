package com.edouardondo.moneyclap.model.devis

import com.edouardondo.moneyclap.model.customer.Customer

data class Devis(
    var devisId: String,
    var customer: Customer,
    var recipient: Customer,
    var from: String,
    var to: String,
    var amountSent: Float,
    var amountReceived: Float,
    var date: String,
    var time: String,
    var transactionFees: String)

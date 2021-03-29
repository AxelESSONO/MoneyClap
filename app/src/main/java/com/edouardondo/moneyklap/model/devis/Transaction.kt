package com.edouardondo.moneyklap.model.devis

import com.edouardondo.moneyklap.model.customer.Customer
import java.io.Serializable

data class Transaction(
    var transactionId: String,
    var date: String,
    var sender: Customer,
    var receiver: Customer,
    var operationDir: String,
    var amountSent: String,
    var amountReceived: String,
    var fee: String,
    var feeIntern: String,
    var comment: String = ""
) : Serializable
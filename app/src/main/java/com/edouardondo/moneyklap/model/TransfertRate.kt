package com.edouardondo.moneyklap.model

data class TransfertRate(
    var from: String,
    var min: Float,
    var max: Float,
    var ft: Float,
    var fam: Float,
    var isSelected: Boolean
)
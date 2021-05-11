package com.edouardondo.moneyklap.myInterfaces

import com.edouardondo.moneyklap.model.devis.DataDevis

interface DataManager {

    fun onPassingData(
        dataDevis: DataDevis?
    )

    fun onReceivingData():DataDevis?
}
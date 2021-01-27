package com.edouardondo.moneyclap.database

import com.edouardondo.moneyclap.model.Feature

abstract class SourceData {
    companion object{
        val featureList = mutableListOf<Feature>(

        )
    }
}
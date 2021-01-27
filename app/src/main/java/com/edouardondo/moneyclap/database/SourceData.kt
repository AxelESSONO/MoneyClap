package com.edouardondo.moneyclap.database

import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.model.devis.DevisFeature
import com.edouardondo.moneyclap.model.devis.Feature

abstract class SourceData {
    companion object{
        val featureList = mutableListOf<Feature>(

        )

        val devisFeatureList = mutableListOf<DevisFeature>(
            DevisFeature(R.drawable.ic_devis_edit,"Faire un devis"),
            DevisFeature(R.drawable.ic_find_devis,"Rechercher un devis"),
            DevisFeature(R.drawable.ic_modify_devis,"Modifier un devis"),
            DevisFeature(R.drawable.ic_all_devis,"Voir tous les devis"),
        )
    }
}
package com.edouardondo.moneyclap.database

import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.model.devis.DevisFeature
import com.edouardondo.moneyclap.model.devis.Feature
import com.edouardondo.moneyclap.model.devis.Transaction

abstract class SourceData
{
    companion object
    {
        val featureList = mutableListOf<Feature>()

        val devisFeatureList = mutableListOf<DevisFeature>(
            DevisFeature(R.drawable.ic_devis_edit,"Faire un devis".toUpperCase()),
            DevisFeature(R.drawable.ic_find_devis,"Rechercher un devis".toUpperCase()),
            DevisFeature(R.drawable.ic_modify_devis,"Modifier un devis".toUpperCase()),
            DevisFeature(R.drawable.ic_all_devis,"Voir tous les devis".toUpperCase()),
        )

        val transactionList = mutableListOf<Transaction>(
            Transaction(1,"Toutes les transactions", R.drawable.ic_all_transfert),
            Transaction(2,"Valider une transaction", R.drawable.ic_validate_transfert),
            Transaction(3,"Transactions en cours", R.drawable.ic_ongoing),
            Transaction(4,"Transactions effectuées", R.drawable.ic_done),
            Transaction(5,"Transactions annulées", R.drawable.ic_baseline_cancel_24), //
            Transaction(6,"Annuler une transaction", R.drawable.ic_cancel_transaction),
        )
    }
}
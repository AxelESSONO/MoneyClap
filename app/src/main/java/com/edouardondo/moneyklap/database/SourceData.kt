package com.edouardondo.moneyklap.database

import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.common.Util
import com.edouardondo.moneyklap.model.TransfertRate
import com.edouardondo.moneyklap.model.customer.Customer
import com.edouardondo.moneyklap.model.devis.Devis
import com.edouardondo.moneyklap.model.devis.DevisFeature
import com.edouardondo.moneyklap.model.devis.IntervalleDevis
import com.edouardondo.moneyklap.model.devis.Transaction

abstract class SourceData {
    companion object {

        val accountFeatureList = mutableListOf<String>(
            Util.SOMME_TRANS_GA_FR,
            Util.SOMME_TRANS_FR_GA,
            Util.SOMME_FT_FR_GA,
            Util.SOMME_FT_GA_FR,
            Util.COMPTEUR_TRANS
        )

        val devisFeatureList = mutableListOf<DevisFeature>(
            DevisFeature(R.drawable.ic_devis_edit, "Faire un devis".toUpperCase()),
            DevisFeature(R.drawable.ic_find_devis, "Rechercher un devis".toUpperCase()),
            DevisFeature(R.drawable.ic_modify_devis, "Modifier un devis".toUpperCase()),
            DevisFeature(R.drawable.ic_all_devis, "Voir tous les devis".toUpperCase()),
        )

        val transactionList = mutableListOf<Transaction>(
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1",R.drawable.axel ,"sender", "Gabon", "Libreville", "060606060"),
                Customer("CUSTOMER_2", R.drawable.axel,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),
            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

            Transaction(
                "TRAN_ID_8585", "07 03 2021",
                Customer("CUSTOMER_1", R.drawable.axel ,"sender", "Gabon", "Libreville"),
                Customer("CUSTOMER_2", R.drawable.axel ,"receiver", "Gabon", "Libreville"),
                "FRAGA",
                "8000",
                "7500",
                "100",
                "20"
            ),

        )

        val devisId = mutableListOf<String>(
            "REDIKDKF645",
            "DEYUI8596",
            "RTOUY4856",
            "REDGB86932"
        )
        //Devis(var ref: String, var customer: Customer, var recipient: Customer, var countryFrom: String, var to: String,
        //  var amountSent: Float, var amountReceived: Float, var date: String, var time: String, var transactionFees: String)

        //Customer( var id: String, var customerType : String, var customerCountry: String, var customerCity: String,
        //var customerPhoneNumber : String="", var firstName: String = "", var lastName: String = "")

        var devisList = mutableListOf<Devis>(
            Devis(
                "FRGA00000000",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "9999",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            Devis(
                "GAFR85285285",
                Customer(
                    "userId", R.drawable.axel ,"Sender", "France", "Paris",
                    "", "Edouard", "Ondo"
                ),
                "receiverId2020", "France", "Gabon", 8000F,
                5_000_000F, "24 02 2021", "15h45min", 100F
            ),

            )

        val intervalleDevisAMList = mutableListOf<IntervalleDevis>(
            IntervalleDevis(100f, 1_000f, 200f),
            IntervalleDevis(1_000f, 2_000f, 400f),
            IntervalleDevis(2_000f, 3_000f, 600f),
            IntervalleDevis(3_000f, 4_000f, 800f),
            IntervalleDevis(4_000f, 5_000f, 1000f),
            IntervalleDevis(5_000f, 6_000f, 1200f),
            IntervalleDevis(6_000f, 7_000f, 1400f),
            IntervalleDevis(7_000f, 15_000f, 1600f),
            IntervalleDevis(15_000f, 25_000f, 1800f),
            IntervalleDevis(25_000f, 40_000f, 2000f),
            IntervalleDevis(40_000f, 100_000f, 2200f),
            IntervalleDevis(100_000f, 150_000f, 2400f),
            IntervalleDevis(150_000f, 250_000f, 2600f),
            IntervalleDevis(250_000f, 350_000f, 2600f),
            IntervalleDevis(350_000f, 450_000f, 2600f),
            IntervalleDevis(450_000f, 650_000f, 2600f),
            IntervalleDevis(650000f, 1_000_000f, 2600f),
            IntervalleDevis(1_000_000f, 2_000_000f, 2600f)
        )

        val transfertRateList = mutableListOf<TransfertRate>(
           TransfertRate("Gabon", 1000f, 2000f, 200f, 500f, false),
           TransfertRate("Gabon", 2000.1f, 3000f, 400f, 600f, false),
           TransfertRate("Gabon", 3000.1f, 4000f, 600f, 700f, false),
           TransfertRate("Gabon", 4000.1f, 5000f, 800f, 800f, false),
           TransfertRate("Gabon", 5000.1f, 6000f, 1000f, 900f, false),
           TransfertRate("Gabon", 6000.1f, 7000f, 1200f, 1000f, false),
           TransfertRate("Gabon", 7000.1f, 8000f, 1300f, 1100f, false),
           TransfertRate("Gabon", 8000.1f, 9000f, 1400f, 1200f, false),
           TransfertRate("Gabon", 9000.1f, 10000f, 1500f, 1300f, false),
           TransfertRate("Gabon", 10000.1f, 11000f, 1600f, 1400f, false),
           TransfertRate("Gabon", 11000.1f, 12000f, 1700f, 1500f, false),
           TransfertRate("Gabon", 12000.1f, 13000f, 1800f, 1600f, false),
           TransfertRate("Gabon", 13000.1f, 14000f, 2000f, 1700f, false),
           TransfertRate("Gabon", 14000.1f, 15000f, 2400f, 1800f, false),
           TransfertRate("Gabon", 15000.1f, 16000f, 2500f, 1900f, false),
           TransfertRate("Gabon", 16000.1f, 17000f, 2600f, 2000f, false),
           TransfertRate("Gabon", 17000.1f, 18000f, 2700f, 2500f, false),
           TransfertRate("Gabon", 18000.1f, 19000f, 2700f, 2500f, false),
           TransfertRate("Gabon", 19000.1f, 20000f, 2800f, 3000f, false),
           TransfertRate("Gabon", 20000.1f, 21000f, 2800f, 3000f, false),
        )
    }
}
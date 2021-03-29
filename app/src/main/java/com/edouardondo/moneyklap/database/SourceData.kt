package com.edouardondo.moneyklap.database

import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.common.Util
import com.edouardondo.moneyklap.model.customer.Customer
import com.edouardondo.moneyklap.model.devis.Devis
import com.edouardondo.moneyklap.model.devis.DevisFeature
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
    }
}
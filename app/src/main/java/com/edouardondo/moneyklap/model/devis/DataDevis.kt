package com.edouardondo.moneyklap.model.devis

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class DataDevis (
    var directionStart: String,
    var directionEnd: String,
    var paymentWay: String,
    var amountToSend: Float,
    var amountToReceive: Float,
    var totalAmount: Float,
    var feeAmount: Float,
    var retraitAmount: Float
): Parcelable{

    var SAP: Float = 0.0f //(Somme à Payer): c’est la somme que le client dépose sur le airtel money au Gabon ou par virement bancaire en France.
    var SRB : Float = 0.0f //(Somme reçue par le bénéficiaire): c’est la somme que le bénéficiaire doit recevoir.
    var FT : Float = 0.0f //(Frais de transfert):
    var FAM : Float = 0.0f //(Frais de retrait AM) :
    var SD : Float = 0.0f //(Somme déposer) :
    var TOTAL : Float = 0.0f //(Total à payer) :

    companion object{
        const val TAUX_CFA_EURO: Float = 0.0015f // TCVE
        const val TAUX_EURO_CFA: Float = 655.95f // TEVC
    }

}

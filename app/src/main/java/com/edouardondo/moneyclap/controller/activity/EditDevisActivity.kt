package com.edouardondo.moneyclap.controller.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import butterknife.BindView
import butterknife.ButterKnife
import com.edouardondo.moneyclap.R
import com.rilixtech.widget.countrycodepicker.CountryCodePicker

class EditDevisActivity : AppCompatActivity() {

    @BindView(R.id.ccp_from) lateinit var from : CountryCodePicker
    @BindView(R.id.ccp_to) lateinit var to : CountryCodePicker

    @BindView(R.id.amount_to_pay_edt) lateinit var amountToPayEdt : EditText
    @BindView(R.id.received_amount_edt) lateinit var amountReceivedEdt : EditText
    @BindView(R.id.coupon_edt) lateinit var couponEdt : EditText

    @BindView(R.id.currency_from) lateinit var currencyFrom : TextView
    @BindView(R.id.currency_to) lateinit var currencyTo : TextView

    @BindView(R.id.radio_yes) lateinit var radioYes : RadioButton
    @BindView(R.id.radio_no) lateinit var radioNo : RadioButton

    /** ================= Payment way ====================*/
    // From Gabon
    @BindView(R.id.payment_from_gabon) lateinit var linearFromGabon : LinearLayout
    lateinit var airtelImg : ImageView
    lateinit var mobicashImg : ImageView

    // From France
    @BindView(R.id.payment_from_france) lateinit var linearFromFrance : LinearLayout
    lateinit var paypalImg : ImageView
    lateinit var creditCartImg : ImageView

    /** ================ Estimation ==================== */
    @BindView(R.id.withdrawal_fee) lateinit var withdrawalFee : TextView
    @BindView(R.id.commission) lateinit var commission : TextView
    @BindView(R.id.total_account) lateinit var totalAccount : TextView
    @BindView(R.id.total_account_received) lateinit var totalAccountReceived : TextView


    @BindView(R.id.new_devis_btn) lateinit var newDevisBtn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_devis)

        /**
         * SAP (Somme à Payer): c’est la somme que le client dépose sur le airtel money au Gabon ou par virement bancaire en France.
         * SRB (Somme reçue par le bénéficiaire): c’est la somme que le bénéficiaire doit recevoir.
         * FT (Frais de transfert):
         * FAM (Frais de retrait AM) :
         * SD (Somme déposer) :
         * [TCVE]: Taux CFA Vers Euro, c'est le coefficient multiplicateur pour convertir les CFA en Euros il est de XXXXXX
         * [TEVC]: Taux Euro Vers CFA, c'est le coefficient multiplicateur pour convertir les Euros en CFA il est de XXXXXX
         * */

        ButterKnife.bind(this)

     /*   if (this.from.defaultCountryNameCode == "fr"){
            this.to.defaultCountryNameCode == "ga"
        } else if (this.from.defaultCountryNameCode == "ga"){
            this.to.defaultCountryNameCode == "fr"
        }*/

    }

    companion object{

        /**
         * [TCVE]: Taux CFA Vers Euro, c'est le coefficient multiplicateur pour convertir le CFA =====> Euros il est de
         * [TEVC]: Taux Euro Vers CFA, c'est le coefficient multiplicateur pour convertir les Euros en CFA il est de XXXXXX
         *
         * */
        const val TEVC = 655.957F
        const val TCVE = 0.00152449F
    }

}
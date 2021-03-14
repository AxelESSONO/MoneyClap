package com.edouardondo.moneyclap.controller.activity

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import com.edouardondo.moneyclap.R
import com.rilixtech.widget.countrycodepicker.Country
import com.rilixtech.widget.countrycodepicker.CountryCodePicker
import kotlinx.android.synthetic.main.activity_edit_devis.*

class EditDevisActivity : AppCompatActivity() {


    lateinit var amountToPayEdt: EditText
    lateinit var amountReceivedEdt: EditText
    lateinit var couponEdt: EditText

    /** =================== Currency ===================*/
    lateinit var currencyFrom: TextView
    lateinit var currencyTo: TextView

    /** =================== Radio Button ===================*/
    lateinit var radioYes : RadioButton
    lateinit var radioNo : RadioButton

    /** ================= Payment way ====================*/
    // From Gabon
    lateinit var linearFromGabon: LinearLayout
    lateinit var airtelImg: ImageView
    lateinit var mobicashImg: ImageView

    // From France
    lateinit var linearFromFrance: LinearLayout
    lateinit var paypalImg: ImageView
    lateinit var creditCartImg: ImageView

    /** ================ Estimation ==================== */
    lateinit var withdrawalFee: TextView
    lateinit var commission: TextView
    lateinit var totalAccount: TextView
    lateinit var totalAccountReceived: TextView
    lateinit var newDevisBtn: TextView

    // Amount
    var SAP: Float = 0.0f
    var SRB: Float = 0.0f
    var FT: Float = 0.0f
    var FAM: Float = 0.0f
    var FMC: Float = 0.0f
    var SD: Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_devis)
        ButterKnife.bind(this)

        /** Bind View */
        bindView()

        back.setOnClickListener {
            onBackPressed()
        }

        setFeeChoice()
        //linkAmount()

        ccp_from.setOnCountryChangeListener(object : CountryCodePicker.OnCountryChangeListener {

            override fun onCountrySelected(selectedCountry: Country?) {

                if (selectedCountry?.phoneCode.equals("33")) {

                    /** Payment fromFrance **/
                    upDateUI(currencyList[1], currencyList[0], countryForNameCodeList[1],
                        View.GONE, View.VISIBLE)

                } else if (selectedCountry?.phoneCode.equals("241")) {

                    /** Payment from Gabon **/
                    upDateUI(currencyList[0], currencyList[1], countryForNameCodeList[0],
                        View.VISIBLE, View.GONE)
                }
            }
        })
    }

    private fun bindView() {
        linearFromGabon = findViewById(R.id.payment_from_gabon)
        linearFromFrance = findViewById(R.id.payment_from_france)

        amountToPayEdt = findViewById(R.id.amount_to_pay_edt)
        amountReceivedEdt = findViewById(R.id.received_amount_edt)

        couponEdt = findViewById(R.id.coupon_edt)

        currencyFrom = findViewById(R.id.currency_from)
        currencyTo = findViewById(R.id.currency_to)

        radioYes = findViewById(R.id.radio_yes)
        radioNo = findViewById(R.id.radio_no)

        withdrawalFee = findViewById(R.id.withdrawal_fee)
        commission = findViewById(R.id.commission)
        totalAccount = findViewById(R.id.total_account)
        totalAccountReceived = findViewById(R.id.total_account_received)
        newDevisBtn = findViewById(R.id.new_devis_btn)
    }

    private fun linkAmount() {
        var amountToPay = amountToPayEdt.text.toString().trim()
        var amountReceived = amountReceivedEdt.text.toString().trim()

        SAP = amountToPay.toFloat()
        SRB = amountReceived.toFloat()


        FAM
        FMC

        SD

        SRB = (SD - FT)*TCVE
        SRB= SD*TCVE
        SAP = SD+FT
        SAP= SRB*TEVC + FT
        //SRB= (SD-FT)*[TEVC ]

        FT = 205.0f /** Frais internes : Commission*/

    }

    private fun upDateUI(currencyFrom: String, currenyTo: String,
                         countryForNameCode: String, visibleFrom: Int, visibleTo: Int) {

        currency_from.text = currencyFrom
        currency_to.text = currenyTo
        ccp_to.setCountryForNameCode(countryForNameCode)
        linearFromGabon.visibility = visibleFrom
        linearFromFrance.visibility = visibleTo

    }

    private fun setFeeChoice() {
        radio_yes.setOnClickListener {
            radio_yes.isChecked = !radio_no.isChecked
            radio_no.isChecked = !radio_yes.isChecked
        }
        radio_no.setOnClickListener {
            radio_yes.isChecked = !radio_no.isChecked
            radio_no.isChecked = !radio_yes.isChecked
        }
    }

    companion object {
        const val TEVC = 655.957f
        const val TCVE = 0.00152449f
        val currencyList = listOf<String>("FCFA", "EUROS")
        val countryForNameCodeList = listOf<String>("fr", "ga")
    }
}
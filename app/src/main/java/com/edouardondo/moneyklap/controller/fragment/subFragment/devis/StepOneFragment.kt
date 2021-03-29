package com.edouardondo.moneyklap.controller.fragment.subFragment.devis

import android.animation.ObjectAnimator
import android.animation.TimeInterpolator
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Property
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.edouardondo.moneyklap.R
import com.google.android.material.snackbar.Snackbar
import com.rilixtech.widget.countrycodepicker.Country
import com.rilixtech.widget.countrycodepicker.CountryCodePicker
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError


class StepOneFragment : Fragment(), Step {

    lateinit var sendDataToStepTwo: SendDataToStepTwo

    lateinit var from: CardView
    lateinit var to: CardView

    /** =================== Radio Button ===================*/
    lateinit var radioYes: RadioButton
    lateinit var radioNo: RadioButton

    /**  ================ Fee RadioButton =========== */
    lateinit var feeYes: RadioButton
    lateinit var feeNo: RadioButton

    /**  ================ CountryCodePicker =========== */
    lateinit var ccpFrom: CountryCodePicker
    lateinit var ccpTo: CountryCodePicker

    /**  ================ Amount EditText and currency =========== */
    lateinit var amountToPayEdt: EditText
    lateinit var receivedAmountEdt: EditText

    lateinit var currencyFrom: TextView
    lateinit var currencyTo: TextView
    lateinit var logo: ImageView

    /** ================== Direction =====================*/
    var directionTransaction: String = "FRAGA"

    /** FRANCE ==> GABON*/
    var startCalcul: String = "from"

    /**  ================ Fee included =========== */
    var withFee: Boolean = true

    /**  ================ AMOUNT =========== */
    var amountToSend: Float = 0.0f
    var amountToReceive: Float = 0.0f

    var fraisTransfert: Float = 0.0f
    var fraisRetraitAM: Float = 0.0f
    var fraisRetraitMC: Float = 0.0f
    var totalAmount: Float = 0.0f

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_step_one, container, false)

        /** ========= BindView ======== */
        bindView(rootView)

        logo.setOnClickListener {
            ccpFrom.setCountryForNameCode("fr")
        }

        radioYes.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                animate(
                    from, View.TRANSLATION_Y, from.translationY,
                    from.translationY + TRANSLATE_Y, DURATION_ANIMATION, BounceInterpolator()
                )

                animate(
                    to, View.TRANSLATION_Y, to.translationY, to.translationY - TRANSLATE_Y,
                    DURATION_ANIMATION, BounceInterpolator()
                )
                startCalcul = "to"

            } else {
                animate(
                    to, View.TRANSLATION_Y, to.translationY,
                    to.translationY + TRANSLATE_Y, DURATION_ANIMATION, BounceInterpolator()
                )

                animate(
                    from, View.TRANSLATION_Y, from.translationY,
                    from.translationY - TRANSLATE_Y, DURATION_ANIMATION, BounceInterpolator()
                )
                startCalcul = "from"
            }
        }

        ccpFrom.setOnCountryChangeListener { selectedCountry ->
            when (selectedCountry?.name) {
                "France" -> {
                    showCountrySelected(rootView, selectedCountry?.name, Color.BLACK)
                    ccpTo.setCountryForNameCode("ga")
                    directionTransaction = "FRAGA"

                }
                "Gabon" -> {
                    showCountrySelected(rootView, selectedCountry?.name, Color.BLACK)
                    ccpTo.setCountryForNameCode("fr")
                    directionTransaction = "GAFRA"
                }
                else -> {
                    showCountrySelected(
                        rootView,
                        "Transfert non disponible depuis ${selectedCountry?.name}",
                        Color.RED
                    )
                    ccpFrom.setCountryForNameCode("fr")
                    ccpTo.setCountryForNameCode("ga")
                }
            }
            /** ================ SHOW CURRENCY ============  */
            showCurrency(rootView, selectedCountry)
        }

        ccpTo.setOnCountryChangeListener { selectedCountry ->
            val countryTo = selectedCountry?.name
            Toast.makeText(context, countryTo, Toast.LENGTH_SHORT).show()
        }

        return rootView
    }

    private fun showCurrency(rootView: View, selectedCountry: Country) {
        when (selectedCountry.iso) {
            "ga" -> {
                currencyFrom.text = getString(R.string.cfa)
                currencyTo.text = getString(R.string.euros)
            }
            "fr" -> {
                currencyFrom.text = getString(R.string.euros)
                currencyTo.text = getString(R.string.cfa)
            }
            else -> {
                showCountrySelected(
                    rootView,
                    "Transfert non disponible depuis ${selectedCountry.name}",
                    Color.RED
                )
                currencyFrom.text = getString(R.string.euros)
                currencyTo.text = getString(R.string.cfa)
            }
        }
    }

    private fun showCountrySelected(rootView: View, countryName: String?, colorSnackBar: Int) {
        val snackBar = Snackbar.make(rootView, countryName!!, Snackbar.LENGTH_SHORT)
            .setAction("Action", null)
        snackBar.setActionTextColor(colorSnackBar)

        val snackBarView = snackBar.view
        snackBarView.setBackgroundColor(colorSnackBar)
        val textView =
            snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
        textView.setTextColor(Color.WHITE)
        textView.gravity = Gravity.CENTER
        snackBar.show()
    }


    override fun verifyStep(): VerificationError? {
        val verificationError: VerificationError?
        if (feeYes.isChecked == feeNo.isChecked) {
            verificationError = VerificationError("Avec ou sans frais ?")

            val dialogView = layoutInflater.inflate(R.layout.with_fee_alert, null)
            val customDialog = context?.let {
                AlertDialog.Builder(it).setView(dialogView).show()
            }

            customDialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val withFee = dialogView.findViewById<Button>(R.id.with_fee)
            val noFee = dialogView.findViewById<Button>(R.id.no_fee)

            withFee.setOnClickListener {
                feeYes.isChecked = true
                feeNo.isChecked = false
                customDialog?.dismiss()
            }

            noFee.setOnClickListener {
                feeYes.isChecked = false
                feeNo.isChecked = true
                customDialog?.dismiss()
            }

        } else {
            verificationError = null
            sendDataToStepTwo.onSendDataToStepTwo(
                directionTransaction,
                80000.0f,
                80000.0f,
                80000.0f,
                80000.0f,
                800.0f
            )
        }
        return verificationError
    }

    override fun onSelected() {}

    override fun onError(error: VerificationError) {}

    private fun animate(
        target: View, myProperty: Property<View, Float>, from: Float, to: Float, myDuration: Long,
        interpolator: TimeInterpolator
    ) {
        val tY = ObjectAnimator.ofFloat(target, myProperty, from, to)
        tY.duration = myDuration
        tY.interpolator = interpolator
        tY.start()
    }

    private fun bindView(rootView: View) {
        radioYes = rootView.findViewById(R.id.received_yes)
        radioNo = rootView.findViewById(R.id.received_no)

        from = rootView.findViewById(R.id.from)
        to = rootView.findViewById(R.id.to)

        feeYes = from.findViewById(R.id.radio_yes)
        feeNo = from.findViewById(R.id.radio_no)
        ccpFrom = from.findViewById(R.id.ccp_from)
        amountToPayEdt = from.findViewById(R.id.amount_to_pay_edt)
        currencyFrom = from.findViewById(R.id.currency_from)

        ccpTo = to.findViewById(R.id.ccp_to)
        receivedAmountEdt = to.findViewById(R.id.received_amount_edt)
        currencyTo = to.findViewById(R.id.currency_to)
        logo = rootView.findViewById(R.id.logo)

        ccpFrom.setCustomMasterCountries(null)
        val customMasterCountriesList : List<Country>

        //ccpFrom.setCustomMasterCountriesList()

    }

    companion object {
        const val DURATION_ANIMATION: Long = 1000
        const val TRANSLATE_Y: Float = 420.0f

        const val TAUX_CFA_EURO: Float = 0.0015f
        const val TAUX_EURO_CFA: Float = 655.95f
    }

    interface SendDataToStepTwo {
        fun onSendDataToStepTwo(
            directionTransaction: String,
            amountToSend: Float,
            amountToReceive: Float,
            totalAmount: Float,
            feeAmount: Float,
            retraitAmount: Float
        )
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        try {
            sendDataToStepTwo = context as SendDataToStepTwo
        } catch (e: ClassCastException) {
            throw RuntimeException("$context must implement SendDataToStepTwo")
        }
    }
}
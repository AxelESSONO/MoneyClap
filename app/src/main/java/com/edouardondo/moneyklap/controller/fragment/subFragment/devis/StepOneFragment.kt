package com.edouardondo.moneyklap.controller.fragment.subFragment.devis

import android.animation.ObjectAnimator
import android.animation.TimeInterpolator
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Property
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import android.widget.*
import androidx.annotation.UiThread
import androidx.cardview.widget.CardView
import androidx.core.content.res.ResourcesCompat
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.myInterfaces.DataManager

import com.edouardondo.moneyklap.common.Util
import com.edouardondo.moneyklap.controller.activity.EditDevisActivity
import com.edouardondo.moneyklap.controller.fragment.ButterKnifeFragment
import com.edouardondo.moneyklap.model.devis.DataDevis
import com.google.android.material.snackbar.Snackbar
import com.rilixtech.widget.countrycodepicker.Country
import com.rilixtech.widget.countrycodepicker.CountryCodePicker
import com.stepstone.stepper.BlockingStep
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError
import kotlinx.android.synthetic.main.from_layout.*


internal class StepOneFragment : ButterKnifeFragment(), BlockingStep {

    /** ================ CardView ==================*/
    lateinit var cardviewFrom: CardView
    lateinit var cardviewTo: CardView
    lateinit var paypalCardView: CardView
    lateinit var cbCardView: CardView
    lateinit var airtelCardView: CardView
    lateinit var mobicashCardView: CardView
    lateinit var relativeChoice: LinearLayout
    lateinit var dataManager: DataManager
    lateinit var dataDevis: DataDevis
    lateinit var gabon_linear: LinearLayout
    lateinit var france_linear: LinearLayout

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
    lateinit var title: TextView
    lateinit var sendTo: TextView
    lateinit var comeFrom: TextView

    /** ================== Direction =====================*/
    private var directionStart: String = "FRANCE"
    private var directionEnd: String = "GABON"
    private lateinit var paymentWAY: String
    private lateinit var paymentBy: List<String>

    /** FRANCE ==> GABON*/
    //var startCalcul: String = "from"

    /**  ================ Fee included =========== */
    var withFee: Boolean = true

    /**  ================ AMOUNT =========== */
    var amountToSend: Float = 0.0f
    var amountToReceive: Float = 0.0f

    var fraisTransfert: Float = 0.0f
    var fraisRetraitAM: Float = 0.0f
    var fraisRetraitMC: Float = 0.0f
    var totalAmount: Float = 0.0f
    private var paymentChoosen: Boolean = false
    var isFinish: Boolean = false
    var ccpFromFocus: Boolean = false
    var ccpToFocus: Boolean = false


    lateinit var focusTxt: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView: View = inflater.inflate(R.layout.fragment_step_one, container, false)

        /** ========= BindView ======== */
        title = (activity as EditDevisActivity).findViewById(R.id.title)
        bindView(rootView)
     /*   focusTxt = rootView.findViewById(R.id.focusTxt)

        radioYes.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                feeYes.isChecked = isChecked
                feeNo.isChecked = !isChecked

                comeFrom.setText(R.string.envoyer_vers)
                sendTo.setText(R.string.envoyer_depuis)

                amountToPayEdt.hint = context?.getString(R.string.somme_envoyer)
                receivedAmountEdt.hint = context?.getString(R.string.somme_recue)

            }else{
                comeFrom.setText(R.string.envoyer_depuis)
                sendTo.setText(R.string.envoyer_vers)

                amountToPayEdt.hint = context?.getString(R.string.somme_envoyer)
                receivedAmountEdt.hint = context?.getString(R.string.somme_recue)
            }
            radioNo.isChecked = !radioYes.isChecked
        }

        ccpFrom.setOnCountryChangeListener(object : CountryCodePicker.OnCountryChangeListener{
            override fun onCountrySelected(selectedCountry: Country?) {
                if (ccpFromFocus) {

                    setCountryFromAndCountryTo(selectedCountry, ccpTo)
                    */
        /** ================ SHOW CURRENCY ============  *//*
                    showCurrency(selectedCountry)
                }
            }

        })

        ccpTo.setOnCountryChangeListener { selectedCountry ->
            if (ccpToFocus) {
                setCountryFromAndCountryTo(selectedCountry, ccpFrom)
                *//** ================ SHOW CURRENCY ============  *//*
                showCurrency(selectedCountry)
            }
        }

        ccpFrom.setOnFocusChangeListener { _, hasFocus ->
            ccpFromFocus = hasFocus
            if (hasFocus){
                focusTxt.text = "ccpFrom"
            }

        }
        ccpTo.setOnFocusChangeListener { _, hasFocus ->
            ccpToFocus = hasFocus
            //focusTxt.text = "ccpTo"
            //ccpFromFocus = !hasFocus
        }*/


        paymentBy = mutableListOf("CARTE BANCAIRE", "PAYPAL", "MOBICASH", "AIRTEL MONEY")
        paymentWAY = paymentBy[0]

        title = (activity as EditDevisActivity).findViewById(R.id.title)

        radioYes.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                animate(
                    cardviewFrom,
                    View.TRANSLATION_Y,
                    cardviewFrom.translationY,
                    cardviewFrom.translationY + TRANSLATE_Y,
                    DURATION_ANIMATION,
                    BounceInterpolator()
                )

                animate(
                    cardviewTo,
                    View.TRANSLATION_Y,
                    cardviewTo.translationY,
                    cardviewTo.translationY - TRANSLATE_Y,
                    DURATION_ANIMATION,
                    BounceInterpolator()
                )


            } else {
                animate(
                    cardviewTo, View.TRANSLATION_Y, cardviewTo.translationY,
                    cardviewTo.translationY + TRANSLATE_Y, DURATION_ANIMATION, BounceInterpolator()
                )

                animate(
                    cardviewFrom,
                    View.TRANSLATION_Y,
                    cardviewFrom.translationY,
                    cardviewFrom.translationY - TRANSLATE_Y,
                    DURATION_ANIMATION,
                    BounceInterpolator()
                )
            }
        }

        ccpFrom.setOnCountryChangeListener { selectedCountry ->
            setCountryFromAndCountryTo(selectedCountry, rootView)
            /** ================ SHOW CURRENCY ============  */
            showCurrency(rootView, selectedCountry)
        }

        ccpTo.setOnCountryChangeListener { selectedCountry ->
            /** ================ SHOW CURRENCY ============  */
            showCurrency(rootView, selectedCountry)
        }

        cbCardView.setOnClickListener {
            paypalCardView.background =
                ResourcesCompat.getDrawable(resources, R.drawable.normal_background, null)
            cbCardView.background =
                ResourcesCompat.getDrawable(resources, R.drawable.selected_backgroung, null)
            paymentChoosen = true
            paymentWAY = paymentBy[0]
        }

        paypalCardView.setOnClickListener {
            paypalCardView.background =
                ResourcesCompat.getDrawable(resources, R.drawable.selected_backgroung, null)
            cbCardView.background =
                ResourcesCompat.getDrawable(resources, R.drawable.normal_background, null)
            paymentChoosen = true
            paymentWAY = paymentBy[1]
        }

        mobicashCardView.setOnClickListener {
            airtelCardView.background =
                ResourcesCompat.getDrawable(resources, R.drawable.normal_background, null)
            mobicashCardView.background =
                ResourcesCompat.getDrawable(resources, R.drawable.selected_backgroung, null)
            paymentChoosen = true
            paymentWAY = paymentBy[2]
        }

        airtelCardView.setOnClickListener {
            airtelCardView.background =
                ResourcesCompat.getDrawable(resources, R.drawable.selected_backgroung, null)
            mobicashCardView.background =
                ResourcesCompat.getDrawable(resources, R.drawable.normal_background, null)
            paymentChoosen = true
            paymentWAY = paymentBy[3]
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

    private fun animate(target: View, myProperty: Property<View, Float>, from: Float, to: Float, myDuration: Long, interpolator: TimeInterpolator) {
        val tY = ObjectAnimator.ofFloat(target, myProperty, from, to)
        tY.duration = myDuration
        tY.interpolator = interpolator
        tY.start()
    }

    private fun setCountryFromAndCountryTo(selectedCountry: Country, rootView: View) {
        when (selectedCountry.name) {
            "France" -> {
                showCountrySelected(rootView, selectedCountry.name, Color.BLACK)
                ccpTo.setCountryForNameCode("ga")
                directionStart = "FRANCE"
                directionEnd = "GABON"
                gabon_linear.visibility = View.GONE
                france_linear.visibility = View.VISIBLE
            }
            "Gabon" -> {
                showCountrySelected(rootView, selectedCountry.name, Color.BLACK)
                ccpTo.setCountryForNameCode("fr")
                directionStart = "GABON"
                directionEnd = "FRANCE"
                gabon_linear.visibility = View.VISIBLE
                france_linear.visibility = View.GONE
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
    }


    override fun verifyStep(): VerificationError? {

        val verificationError: VerificationError? = null


        return verificationError
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is DataManager) {
            dataManager = context
        } else {
            throw IllegalStateException("Activity must implement DataManager interface!")
        }
    }

    override fun onSelected() {
        title.text = Util.TITLE_LIST[0]
    }

    override fun onError(error: VerificationError) {}

    private fun bindView(rootView: View) {
        radioYes = rootView.findViewById(R.id.received_yes)
        radioNo = rootView.findViewById(R.id.received_no)

        feeYes = rootView.findViewById(R.id.radio_yes)
        feeNo = rootView.findViewById(R.id.radio_no)


        cardviewFrom = rootView.findViewById(R.id.from)
        cardviewTo = rootView.findViewById(R.id.to)
        ccpFrom = cardviewFrom.findViewById(R.id.ccp_from)
        comeFrom = cardviewFrom.findViewById(R.id.comeFrom)

        amountToPayEdt = cardviewFrom.findViewById(R.id.amount_to_pay_edt)
        currencyFrom = cardviewFrom.findViewById(R.id.currency_from)

        ccpTo = cardviewTo.findViewById(R.id.ccp_to)
        sendTo = cardviewTo.findViewById(R.id.sendTo)

        receivedAmountEdt = cardviewTo.findViewById(R.id.received_amount_edt)
        currencyTo = cardviewTo.findViewById(R.id.currency_to)
        gabon_linear = rootView.findViewById(R.id.payment_from_gabon)
        france_linear = rootView.findViewById(R.id.payment_from_france)
        paypalCardView = france_linear.findViewById(R.id.paypal_card)
        cbCardView = france_linear.findViewById(R.id.cb_card)
        airtelCardView = gabon_linear.findViewById(R.id.airtel_card)
        mobicashCardView = gabon_linear.findViewById(R.id.mobicash_card)
        relativeChoice = rootView.findViewById(R.id.relative_choice)
    }

    @UiThread
    override fun onNextClicked(callback: StepperLayout.OnNextClickedCallback?) {
        dataManager.onPassingData(
            DataDevis(
                directionStart,
                directionEnd,
                paymentWAY,
                amountToPayEdt.text.toString().trim().toFloat(),
                receivedAmountEdt.text.toString().trim().toFloat(),
                amountToPayEdt.text.toString().trim().toFloat() + receivedAmountEdt.text.toString().trim().toFloat(),
                900f, 5000f
            )
        )
        callback?.goToNextStep()
    }

    @UiThread
    override fun onCompleteClicked(callback: StepperLayout.OnCompleteClickedCallback) {
        callback.complete()
    }

    override fun onBackClicked(callback: StepperLayout.OnBackClickedCallback) {
        callback.goToPrevStep()
    }

    override val layoutResId: Int
        get() = R.layout.fragment_step_one

    @UiThread
    companion object {
        const val DURATION_ANIMATION: Long = 1000
        const val TRANSLATE_Y: Float = 420.0f

        fun newInstance(): StepOneFragment {
            return StepOneFragment()
        }
    }

}
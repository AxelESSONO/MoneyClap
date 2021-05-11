package com.edouardondo.moneyklap.controller.fragment.subFragment.devis

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.myInterfaces.DataManager
import com.edouardondo.moneyklap.common.Util
import com.edouardondo.moneyklap.controller.activity.EditDevisActivity
import com.edouardondo.moneyklap.controller.fragment.ButterKnifeFragment
import com.edouardondo.moneyklap.model.devis.DataDevis
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError

internal class StepTwoFragment() : ButterKnifeFragment(), Step {

    private lateinit var withdrawal_fee: TextView
    private lateinit var commission: TextView
    private lateinit var total_account: TextView
    private lateinit var total_account_received: TextView
    private lateinit var amount_send_txt: TextView
    private lateinit var from_txt: TextView
    private lateinit var to_txt: TextView
    private lateinit var payment_way: TextView
    private lateinit var title: TextView
    var currentCurrencyFrom: String = ""
    var currentCurrencyTo: String = ""

    lateinit var dataManager: DataManager
    var dataDevis: DataDevis? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_step_two, container, false)

        title = (activity as EditDevisActivity).findViewById(R.id.title)
        withdrawal_fee = rootView.findViewById(R.id.withdrawal_fee)
        commission = rootView.findViewById(R.id.commission)
        total_account = rootView.findViewById(R.id.total_account)
        total_account_received = rootView.findViewById(R.id.total_account_received)
        amount_send_txt = rootView.findViewById(R.id.amount_send_txt)
        from_txt = rootView.findViewById(R.id.from_txt)
        to_txt = rootView.findViewById(R.id.to_txt)
        payment_way = rootView.findViewById(R.id.payment_way)

        return rootView
    }

    companion object {
        fun newInstance(): StepTwoFragment {
            return StepTwoFragment()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is DataManager) {
            dataManager = context
        } else {
            throw IllegalStateException("Activity must implement DataManager interface!")
        }
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {
        title.text = Util.TITLE_LIST[1]

        dataDevis = dataManager.onReceivingData()

        if (dataDevis?.directionStart.equals("FRANCE")){
            currentCurrencyFrom = "EUROS"
            currentCurrencyTo = "FCFA"
        }
        if (dataDevis?.directionStart.equals("GABON")){
            currentCurrencyFrom = "FCFA"
            currentCurrencyTo = "EUROS"
        }

        "${dataDevis?.retraitAmount} $currentCurrencyTo".also { withdrawal_fee.text = it }
        "${dataDevis?.feeAmount} $currentCurrencyFrom".also { commission.text = it }
        "${dataDevis?.totalAmount} $currentCurrencyFrom".also { total_account.text = it }
        "${dataDevis?.amountToReceive} $currentCurrencyTo".also { total_account_received.text = it }
        "${dataDevis?.amountToSend} $currentCurrencyFrom".also { amount_send_txt.text = it }
        from_txt.text = "${dataDevis?.directionStart}"
        to_txt.text = "${dataDevis?.directionEnd}"
        payment_way.text = "${dataDevis?.paymentWay}"
    }

    override fun onError(error: VerificationError) {}

    override val layoutResId: Int
        get() = R.layout.fragment_step_two
}
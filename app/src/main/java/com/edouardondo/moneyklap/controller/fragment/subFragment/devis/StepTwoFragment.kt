package com.edouardondo.moneyklap.controller.fragment.subFragment.devis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.edouardondo.moneyklap.R
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError


class StepTwoFragment : Fragment(), Step {

    lateinit var gabon_linear : LinearLayout
    lateinit var france_linear : LinearLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val rootView: View = inflater.inflate(R.layout.fragment_step_two,
            container, false)

        gabon_linear = rootView.findViewById(R.id.payment_from_gabon)
        france_linear = rootView.findViewById(R.id.payment_from_france)

        return rootView
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {}

    override fun onError(error: VerificationError) {}

    companion object {}

    fun onReceiveData(directionTransaction: String, amountToSend: Float,
        amountToReceive: Float, totalAmount: Float, feeAmount: Float,
        retraitAmount: Float){

        if (directionTransaction.equals("FRAGA")){
            france_linear.visibility = View.VISIBLE
            gabon_linear.visibility = View.GONE

        }else if (directionTransaction.equals("GAFRA")){
            france_linear.visibility = View.GONE
            gabon_linear.visibility = View.VISIBLE
        }
    }

}
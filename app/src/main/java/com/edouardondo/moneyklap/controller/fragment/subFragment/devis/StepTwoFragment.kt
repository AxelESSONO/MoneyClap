package com.edouardondo.moneyklap.controller.fragment.subFragment.devis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.controller.activity.EditDevisActivity
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError


class StepTwoFragment : Fragment() {

    lateinit var gabon_linear: LinearLayout
    lateinit var france_linear: LinearLayout

    lateinit var nextStep : LinearLayout
    lateinit var previousStep : LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(
            R.layout.fragment_step_two,
            container, false
        )

        gabon_linear = rootView.findViewById(R.id.payment_from_gabon)
        france_linear = rootView.findViewById(R.id.payment_from_france)

        nextStep = (activity as EditDevisActivity).findViewById(R.id.next_frag)
        previousStep = (activity as EditDevisActivity).findViewById(R.id.back_frag)

        val directionTransaction = arguments?.getString(StepOneFragment.DIRECTION, "FRANCE")!!
        val amountToSend = arguments?.getFloat(StepOneFragment.AMOUNT_SEND, 0.0f)
        val amountToReceive = arguments?.getFloat(StepOneFragment.AMOUNT_RECEIVE, 0.0f)
        val totalAmount = arguments?.getFloat(StepOneFragment.TOTAL_AMOUNT, 0.0f)
        val feeAmount = arguments?.getFloat(StepOneFragment.FEE_AMOUNT, 0.0f)
        val retraitAmount = arguments?.getFloat(StepOneFragment.RETRAIT_AMOUNT, 0.0f)

        if (directionTransaction == "FRANCE") {
            france_linear.visibility = View.VISIBLE
            gabon_linear.visibility = View.GONE

        } else if (directionTransaction == "GABON") {
            france_linear.visibility = View.GONE
            gabon_linear.visibility = View.VISIBLE
        }

        gabon_linear.setOnClickListener {
            it.isClickable = true
            Toast.makeText(context, "$amountToSend", Toast.LENGTH_SHORT).show()
        }

        france_linear.setOnClickListener {
            it.isClickable = true
            Toast.makeText(context, "$amountToSend", Toast.LENGTH_SHORT).show()
        }

        return rootView
    }

    companion object {}
}
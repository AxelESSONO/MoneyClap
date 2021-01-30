package com.edouardondo.moneyclap.controller.fragment.subFragment.devis.devis_step

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edouardondo.moneyclap.R
import com.stepstone.stepper.BlockingStep
import com.stepstone.stepper.Step
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError

class SenderInformationFragment() : Fragment(), Step, BlockingStep{


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView:View = inflater.inflate(R.layout.fragment_sender_information, container, false)
        return rootView
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {}

    override fun onError(error: VerificationError) {}

    override fun onNextClicked(callback: StepperLayout.OnNextClickedCallback?) {
        callback?.goToNextStep()
    }

    override fun onCompleteClicked(callback: StepperLayout.OnCompleteClickedCallback?) {}

    override fun onBackClicked(callback: StepperLayout.OnBackClickedCallback?) {
    }

}
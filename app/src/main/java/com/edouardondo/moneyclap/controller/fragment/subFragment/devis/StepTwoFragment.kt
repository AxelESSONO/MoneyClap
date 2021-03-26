package com.edouardondo.moneyclap.controller.fragment.subFragment.devis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.edouardondo.moneyclap.R
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError


class StepTwoFragment : Fragment(), Step {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val rootView: View = inflater.inflate(R.layout.fragment_step_two, container, false)
        return rootView
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {}

    override fun onError(error: VerificationError) {}

    companion object {}
}
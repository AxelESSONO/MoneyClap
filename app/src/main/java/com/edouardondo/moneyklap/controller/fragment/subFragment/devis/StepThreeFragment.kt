package com.edouardondo.moneyklap.controller.fragment.subFragment.devis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edouardondo.moneyklap.R
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError

class StepThreeFragment : Fragment() , Step {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView : View = inflater.inflate(R.layout.fragment_step_three, container, false)

        return rootView
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {

    }

    override fun onError(error: VerificationError) {

    }
}
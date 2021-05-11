package com.edouardondo.moneyklap.adapter

import android.content.Context
import androidx.annotation.IntRange
import androidx.fragment.app.FragmentManager
import com.edouardondo.moneyklap.controller.fragment.subFragment.devis.StepOneFragment
import com.edouardondo.moneyklap.controller.fragment.subFragment.devis.StepTwoFragment
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel


class DevisStepperAdapter(fm: FragmentManager, var context: Context) :
    AbstractFragmentStepAdapter(fm, context) {

    override fun createStep(position: Int): Step {
        return when (position) {
            0 -> StepOneFragment.newInstance()
            1 -> StepTwoFragment.newInstance()
            else -> throw IllegalArgumentException("Unsupported position: $position")
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getViewModel(@IntRange(from = 0) position: Int): StepViewModel {

        val builder: StepViewModel.Builder = StepViewModel.Builder(context)
        when (position) {
            0 -> builder
                .setEndButtonLabel("Resultat")
                .setBackButtonLabel("Accueil")
            1 -> builder
                .setBackButtonLabel("Retour")
                .setEndButtonLabel("Fin")
            else -> throw java.lang.IllegalArgumentException("Unsupported position: $position")
        }
        return builder.create()
    }
}
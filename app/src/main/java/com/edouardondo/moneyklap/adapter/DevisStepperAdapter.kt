package com.edouardondo.moneyklap.adapter

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.edouardondo.moneyklap.controller.fragment.subFragment.devis.StepOneFragment
import com.edouardondo.moneyklap.controller.fragment.subFragment.devis.StepThreeFragment
import com.edouardondo.moneyklap.controller.fragment.subFragment.devis.StepTwoFragment
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel

class DevisStepperAdapter(var fm: FragmentManager, var context: Context) :
    AbstractFragmentStepAdapter(fm, context) {

    override fun getCount(): Int = titleList.size

    override fun createStep(position: Int): Step {

        val step = when(position){
            0 -> StepOneFragment()
            1 -> StepTwoFragment()
            2 -> StepThreeFragment()
            else -> StepOneFragment()
        }

        val b = Bundle()
        b.putInt(CURRENT_STEP_POSITION_KEY, position)
        step.arguments = b
        return step
    }

    override fun getViewModel(position: Int): StepViewModel {

        val builder: StepViewModel.Builder = StepViewModel.Builder(context)
            .setTitle(titleList[position])
        when (position) {
            0 -> builder
                .setEndButtonLabel("Suivant")
                .setBackButtonLabel("Retour")
                .setBackButtonStartDrawableResId(StepViewModel.NULL_DRAWABLE)
            1 -> builder
                .setEndButtonLabel("Devis")
                .setBackButtonLabel("Retour")
            2 -> builder
                .setEndButtonLabel("Devis")
                .setBackButtonLabel("Retour")

            else -> throw IllegalArgumentException("Unsupported position: $position")
        }
        return builder.create()

    }

    companion object{
        const val CURRENT_STEP_POSITION_KEY = "CURRENT_STEP_POSITION_KEY"
        val titleList : List<String> = mutableListOf("Step 0", "Step 1", "Step 3")
    }
}
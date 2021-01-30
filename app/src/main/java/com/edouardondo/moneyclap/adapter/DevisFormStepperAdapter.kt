package com.edouardondo.moneyclap.adapter

import android.content.Context
import android.os.Bundle
import androidx.annotation.IntRange
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.edouardondo.moneyclap.controller.fragment.subFragment.devis.devis_step.FinalDevisStepFragment
import com.edouardondo.moneyclap.controller.fragment.subFragment.devis.devis_step.RecipientInformationFragment
import com.edouardondo.moneyclap.controller.fragment.subFragment.devis.devis_step.SenderInformationFragment
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel

class DevisFormStepperAdapter(@NonNull var fm: FragmentManager, @NonNull var context: Context)
    : AbstractFragmentStepAdapter(fm, context)
{

    private val CURRENT_STEP_POSITION_KEY = "CURRENT_STEP_POSITION_KEY"

    override fun getCount(): Int = 3

    override fun createStep(position: Int): Step? {

        //final StepFragmentSample step = new StepFragmentSample();
        val b = Bundle()
        b.putInt(CURRENT_STEP_POSITION_KEY, position)

        val steps = ArrayList<Fragment>()
        steps.add(SenderInformationFragment()) // Step 1
        steps.add(RecipientInformationFragment()) // Step 2
        steps.add(FinalDevisStepFragment()) // Step 3

        steps[position].arguments = b

        return steps.get(position) as Step

    }

    override fun getViewModel(@IntRange(from = 0) position: Int): StepViewModel {

        //Override this method to set Step title for the Tabs, not necessary for other stepper types
        val stepsTitles = arrayOf(
            "Informations de l'expéditeur",
            "Informations du bénéficiaire",
            "Montant"
        )
        return StepViewModel.Builder(context)
            .setTitle(stepsTitles[position]) //can be a CharSequence instead
            .create()
    }

}
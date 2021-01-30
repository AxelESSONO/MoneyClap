package com.edouardondo.moneyclap.controller.fragment.subFragment.devis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.adapter.DevisFormStepperAdapter
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError

class EditDevisFragment : Fragment(), StepperLayout.StepperListener {

    lateinit var mStepperLayout: StepperLayout
    lateinit var devisFormStepperAdapter: DevisFormStepperAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_edit_devis, container, false)

        mStepperLayout = rootView.findViewById(R.id.stepperLayout)
        devisFormStepperAdapter = DevisFormStepperAdapter(fragmentManager!!, context!!)
        mStepperLayout.adapter = devisFormStepperAdapter

        return rootView
    }

    override fun onCompleted(completeButton: View?) {
        completeButton?.setOnClickListener {
            Toast.makeText(completeButton.context, "onCompleted!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onError(verificationError: VerificationError?) {
        Toast.makeText(context, "onError! -> " + verificationError?.getErrorMessage(), Toast.LENGTH_SHORT).show()
    }

    override fun onStepSelected(newStepPosition: Int) {
        Toast.makeText(context, "onStepSelected! -> $newStepPosition", Toast.LENGTH_SHORT).show()
    }

    override fun onReturn() {
        requireActivity().finish()
    }

}
package com.edouardondo.moneyklap.controller.fragment.subFragment.devis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edouardondo.moneyklap.R

class DevisFirstStepFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_devis_first_step, container, false)
        return rootView
    }

    companion object {

        @JvmStatic
        fun newInstance() = DevisFirstStepFragment()
    }
}
package com.edouardondo.moneyklap.controller.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edouardondo.moneyklap.R

class AccountingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // 1 - Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_accounting, container, false)

        return rootView
    }
}
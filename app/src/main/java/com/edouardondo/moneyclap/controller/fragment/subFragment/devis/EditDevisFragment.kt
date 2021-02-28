package com.edouardondo.moneyclap.controller.fragment.subFragment.devis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.edouardondo.moneyclap.R

class EditDevisFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_edit_devis, container, false)

        Toast.makeText(context, "EDIT FRAGMENT", Toast.LENGTH_SHORT).show()

        return rootView
    }

}
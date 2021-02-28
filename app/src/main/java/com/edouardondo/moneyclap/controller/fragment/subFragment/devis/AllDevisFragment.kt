package com.edouardondo.moneyclap.controller.fragment.subFragment.devis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.adapter.AllDevisAdapter
import com.edouardondo.moneyclap.adapter.DevisFeatureAdapter
import com.edouardondo.moneyclap.database.SourceData

class AllDevisFragment : Fragment() {

    lateinit var all_devis : RecyclerView
    lateinit var layoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView : View = inflater.inflate(R.layout.fragment_all_devis, container, false)

        all_devis = rootView.findViewById(R.id.all_devis)
        layoutManager = GridLayoutManager(context, 2)
        all_devis.layoutManager = layoutManager
        all_devis.adapter = AllDevisAdapter(SourceData.devisId.toTypedArray()){}
        Toast.makeText(context, "ICI", Toast.LENGTH_SHORT).show()

        return rootView
    }

}
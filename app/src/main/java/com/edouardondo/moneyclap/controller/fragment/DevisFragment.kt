package com.edouardondo.moneyclap.controller.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.adapter.DevisFeatureAdapter
import com.edouardondo.moneyclap.controller.activity.DevisActivity
import com.edouardondo.moneyclap.database.SourceData
import com.edouardondo.moneyclap.model.devis.DevisFeature


class DevisFragment : Fragment() {

    // Bind View
    lateinit var recyclerView : RecyclerView
    lateinit var layoutManager: GridLayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_devis, container, false)

        recyclerView = rootView.findViewById(R.id.recycler_devis)

        layoutManager = GridLayoutManager(context, 2)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()

        recyclerView.adapter = DevisFeatureAdapter(SourceData.devisFeatureList.toTypedArray()){
            gotoDevisActivity(it)
        }

        return rootView
    }

    private fun gotoDevisActivity(it: DevisFeature) {
        val intent : Intent = Intent(requireActivity(), DevisActivity::class.java)
        intent.putExtra("DEVIS_FEATURE", it.name)
        context?.startActivity(intent)
    }

}
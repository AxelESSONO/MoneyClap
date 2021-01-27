package com.edouardondo.moneyclap.controller.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager

import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.adapter.DevisFeatureAdapter
import com.edouardondo.moneyclap.database.SourceData


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
            Toast.makeText(context, it.name, Toast.LENGTH_SHORT).show()
        }

        return rootView
    }
}
package com.edouardondo.moneyclap.controller.fragment.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.adapter.DevisAdapter
import com.edouardondo.moneyclap.controller.activity.EditDevisActivity
import com.edouardondo.moneyclap.controller.fragment.subFragment.devis.EditDevisFragment
import com.edouardondo.moneyclap.database.SourceData


@Suppress("DEPRECATION")
class DevisFragment : Fragment() {

    // Bind View
    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: LinearLayoutManager
    lateinit var linearLayout : LinearLayout
    lateinit var editDevisButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {

        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_devis, container, false)

        recyclerView = rootView.findViewById(R.id.recycler_devis)
        linearLayout = rootView.findViewById(R.id.linear_data_empty)
        editDevisButton = rootView.findViewById(R.id.edit_devis_btn)

        var allDevis = SourceData.devisList

        if (allDevis.size == 0){
            linearLayout.visibility = View.VISIBLE
        }else{
            linearLayout.visibility = View.GONE
            layoutManager = LinearLayoutManager(context)
            layoutManager.orientation = LinearLayoutManager.VERTICAL
            recyclerView.layoutManager = layoutManager
            recyclerView.itemAnimator = DefaultItemAnimator()
            recyclerView.adapter = DevisAdapter(context!!, SourceData.devisList.toTypedArray()) {}
        }

        editDevisButton.setOnClickListener {
            val intent = Intent(activity, EditDevisActivity::class.java)
            activity?.startActivity(intent)
        }

        return rootView
    }
}
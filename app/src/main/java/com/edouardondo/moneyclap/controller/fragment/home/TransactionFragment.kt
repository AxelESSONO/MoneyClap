package com.edouardondo.moneyclap.controller.fragment.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.adapter.TransactionAdapter
import com.edouardondo.moneyclap.controller.activity.TransactionDetailActivity
import com.edouardondo.moneyclap.database.SourceData

class TransactionFragment : Fragment() {

    // Bind View
    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: LinearLayoutManager


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(
            R.layout.fragment_transaction,
            container, false
        )

        recyclerView = rootView.findViewById(R.id.recycler_transaction)

        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()

        recyclerView.adapter = TransactionAdapter(SourceData.transactionList.toTypedArray()) {

            val intent = Intent(requireActivity(), TransactionDetailActivity::class.java)
            intent.putExtra(transactionKey, it)
            requireActivity().startActivity(intent)
        }

        return rootView
    }

    companion object{
        val transactionKey = "TRANSACTION"
    }

}
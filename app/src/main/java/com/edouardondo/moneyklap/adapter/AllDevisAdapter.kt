package com.edouardondo.moneyklap.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyklap.R


class AllDevisAdapter(val devisList: Array<String>,
                      val listener: (String) -> Unit): RecyclerView.Adapter<AllDevisAdapter.AllDevisAdapterHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllDevisAdapterHolder {


        val allDevisIdView: View = LayoutInflater.from(parent.context).inflate(R.layout.devis_item, parent, false)
        return AllDevisAdapterHolder(allDevisIdView)

    }

    override fun onBindViewHolder(holder: AllDevisAdapterHolder, position: Int) {
        holder.bindAllDevisId(devisList[position], listener)
    }

    override fun getItemCount(): Int {
        return devisList.size
    }



    inner class AllDevisAdapterHolder(devisItem: View) : RecyclerView.ViewHolder(devisItem)  {

        fun bindAllDevisId(devisFeature: String, listener: (String) -> Unit) =
            with(itemView) {

                itemView.setOnClickListener { this@AllDevisAdapter.listener(devisFeature) }
            }

    }


}
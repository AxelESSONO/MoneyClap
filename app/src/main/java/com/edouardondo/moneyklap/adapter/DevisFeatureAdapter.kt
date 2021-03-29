package com.edouardondo.moneyklap.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.model.devis.DevisFeature
import kotlinx.android.synthetic.main.devis_feature_item.view.*

class DevisFeatureAdapter(val devisFeatureList: Array<DevisFeature>, val listener: (DevisFeature) -> Unit) :
    RecyclerView.Adapter<DevisFeatureAdapter.DevisFeatureAdapterHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DevisFeatureAdapterHolder {
        val allDevisFeatureView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.devis_feature_item, parent, false)
        return DevisFeatureAdapterHolder(allDevisFeatureView)
    }

    override fun onBindViewHolder(holder: DevisFeatureAdapterHolder, position: Int) {
        holder.bindAllFeature(devisFeatureList[position], listener)
    }

    override fun getItemCount(): Int = devisFeatureList.size

    inner class DevisFeatureAdapterHolder(devisFeatureItem: View) :
        RecyclerView.ViewHolder(devisFeatureItem) {
        fun bindAllFeature(devisFeature: DevisFeature, listener: (DevisFeature) -> Unit) =
            with(itemView) {
                itemView.devis_btn.text = devisFeature.name
                itemView.devis_img.setImageResource(devisFeature.image)
                setOnClickListener { listener(devisFeature) }
            }
    }
}
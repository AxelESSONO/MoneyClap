package com.edouardondo.moneyclap.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.model.devis.Feature
import kotlinx.android.synthetic.main.feature_item.view.*

class FeatureAdapter(var featureList : Array<Feature>, val listener: (Feature) -> Unit)
    : RecyclerView.Adapter<FeatureAdapter.FeatureHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeatureHolder {
        val featureView : View = LayoutInflater.from(parent.context).inflate(R.layout.feature_item, parent, false)
        return FeatureHolder(featureView)
    }

    override fun onBindViewHolder(holder: FeatureHolder, position: Int) {
        holder.bindFeature(featureList[position], listener)
    }

    override fun getItemCount(): Int = featureList.size

    inner class FeatureHolder(featureItem : View) : RecyclerView.ViewHolder(featureItem) {

        //Charger les éléments du RecyclerView
        fun bindFeature(feature : Feature, listener: (Feature) -> Unit) = with(itemView)
        {
            itemView.feature_img.setImageResource(feature.featureImage!!)
            itemView.feature_name.text = feature.featureName!!
            itemView.feature_name.setOnClickListener { listener(feature) }
            setOnClickListener { listener(feature) }
        }
    }
}
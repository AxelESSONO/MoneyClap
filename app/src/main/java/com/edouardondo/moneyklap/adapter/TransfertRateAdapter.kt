package com.edouardondo.moneyklap.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.Color.parseColor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.model.TransfertRate
import kotlinx.android.synthetic.main.rate_layout.view.*

class TransfertRateAdapter(
    val context: Context, val transfertRateList: Array<TransfertRate>,
    val listener: (TransfertRate) -> Unit
): RecyclerView.Adapter<TransfertRateAdapter.TransfertRateHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransfertRateHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.rate_layout, parent, false)
        return TransfertRateHolder(rootView)
    }

    override fun onBindViewHolder(holder: TransfertRateHolder, position: Int) {
        holder.bindAllTransfertRate(transfertRateList[position], listener)
    }

    override fun getItemCount(): Int = transfertRateList.size

    inner class  TransfertRateHolder(transfertRate: View) : RecyclerView.ViewHolder(transfertRate) {

        fun bindAllTransfertRate(transfertRate: TransfertRate, listener: (TransfertRate) -> Unit) = with(itemView){
            itemView.fromTxt.text = transfertRate.from
            itemView.minTxt.text = "${transfertRate.min}"
            itemView.maxTxt.text = "${transfertRate.max}"
            itemView.ftTxt.text = "${transfertRate.ft}"
            itemView.famTxt.text = "${transfertRate.fam}"
            if (transfertRate.isSelected){
                itemView.background = ContextCompat.getDrawable(context, R.drawable.selected_range)
                //itemView.fromTxt.textColors = parseColor("#FFFFFFFF")
                itemView.minTxt.text = "${transfertRate.min}"
                itemView.maxTxt.text = "${transfertRate.max}"
                itemView.ftTxt.text = "${transfertRate.ft}"
                itemView.famTxt.text = "${transfertRate.fam}"
            }
        }
    }
}
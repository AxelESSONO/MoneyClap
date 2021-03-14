package com.edouardondo.moneyclap.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.model.devis.Devis
import kotlinx.android.synthetic.main.devis_layout.view.*

class DevisAdapter(
    val context: Context, val devisList: Array<Devis>,
    val listener: (Devis) -> Unit
) : RecyclerView.Adapter<DevisAdapter.DevisHolder>() {

  /*  lateinit var devisListFull: Array<Devis>

    init {
        devisListFull = devisList
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DevisHolder {
        val rootView =
            LayoutInflater.from(parent.context).inflate(R.layout.devis_layout, parent, false)
        return DevisHolder(rootView)
    }

    override fun onBindViewHolder(holder: DevisHolder, position: Int) {
        holder.bindAllDevis(devisList.get(position), listener)
    }

    override fun getItemCount(): Int = devisList.size


    inner class DevisHolder(devisView: View) : RecyclerView.ViewHolder(devisView) {
        @SuppressLint("SetTextI18n")
        fun bindAllDevis(devis: Devis, listener: (Devis) -> Unit) = with(itemView)
        {

            val change = listOf<String>("FCfa", "Euro")
            if (devis.countryFrom == "France") {
                itemView.account_send.text = "${devis.amountSent} ${change[1]}"
                itemView.account_received.text = "${devis.amountReceived} ${change[1]}"
                itemView.fee_account.text = "${devis.transactionFees} ${change[1]}"
            } else if (devis.countryFrom == "Gabon") {
                itemView.account_send.text = "${devis.amountSent} ${change[0]}"
                itemView.account_received.text = "${devis.amountReceived} ${change[0]}"
                itemView.fee_account.text = "${devis.transactionFees} ${change[0]}"
            }

            itemView.reference.text = devis.ref
            itemView.name.text = devis.sender.lastName
            itemView.firstname.text = devis.sender.firstName
            itemView.setOnClickListener { this@DevisAdapter.listener(devis) }
        }
    }

}
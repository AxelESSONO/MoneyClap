package com.edouardondo.moneyclap.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.model.devis.Transaction
import kotlinx.android.synthetic.main.transaction_item.view.*

class TransactionAdapter(val transactionList : Array<Transaction>, val listener: (Transaction) -> Unit):
RecyclerView.Adapter<TransactionAdapter.TransactionAdapterHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionAdapterHolder
    {
        val transactionView : View = LayoutInflater.from(parent.context).inflate(R.layout.transaction_item, parent, false)
        return TransactionAdapterHolder(transactionView)
    }

    override fun onBindViewHolder(holder: TransactionAdapterHolder, position: Int)
    {
        holder.bindAllTransaction(transactionList[position], listener)
    }

    override fun getItemCount(): Int = transactionList.size

    inner class TransactionAdapterHolder(transactionItem: View) : RecyclerView.ViewHolder(transactionItem)
    {
        fun bindAllTransaction(transaction : Transaction, listener: (Transaction) -> Unit) =
            with(itemView){
                itemView.transactionId.text = transaction.transactionId

                itemView.profile_img.setImageResource(transaction.sender.image)

                itemView.name.text = transaction.sender.lastName
                itemView.firstname.text = transaction.sender.firstName

                itemView.receiver_firstname.text = transaction.receiver.firstName
                itemView.receiver_name.text = transaction.receiver.lastName

                itemView.date_value.text = transaction.date
                itemView.account_send.text = transaction.amountSent
                itemView.account_received.text = transaction.amountReceived

                itemView.fee_account_intern.text = transaction.feeIntern
                itemView.fee_account.text = transaction.fee

                setOnClickListener { listener(transaction) }
            }
    }
}
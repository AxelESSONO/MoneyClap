package com.edouardondo.moneyklap.controller.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.controller.fragment.home.TransactionFragment
import com.edouardondo.moneyklap.model.devis.Transaction
import kotlinx.android.synthetic.main.activity_transaction_detail.*

class TransactionDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_detail)

        back.setOnClickListener {
            onBackPressed()
        }

        val transaction = intent?.getSerializableExtra(TransactionFragment.transactionKey) as? Transaction

        transactionId.text = transaction?.transactionId
        transaction?.sender?.image?.let { profile_img.setImageResource(it) }
        name.text = transaction?.sender?.lastName
        firstname.text = transaction?.sender?.firstName

        receiver_firstname.text = transaction?.receiver?.firstName
        receiver_name.text = transaction?.receiver?.lastName

        date_value.text = transaction?.date
        account_send.text = transaction?.amountSent
        account_received.text = transaction?.amountReceived

        fee_account_intern.text = transaction?.feeIntern
        fee_account.text = transaction?.fee
    }
}
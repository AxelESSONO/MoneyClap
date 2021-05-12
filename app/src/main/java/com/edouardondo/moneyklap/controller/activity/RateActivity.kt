package com.edouardondo.moneyklap.controller.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.adapter.DevisAdapter
import com.edouardondo.moneyklap.adapter.TransfertRateAdapter
import com.edouardondo.moneyklap.database.SourceData
import com.edouardondo.moneyklap.model.TransfertRate

class RateActivity : AppCompatActivity() {

    private lateinit var rateFromGabon: Button
    private lateinit var rateFromFrance: Button
    private lateinit var recyclerRate: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var linearDataEmpty: LinearLayout
    private lateinit var amountEdt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate)

        //Bind View
        bindView()

        rateFromGabon.isEnabled = true
        rateFromFrance.isEnabled = false

        val transfertRateList = SourceData.transfertRateList

        if (transfertRateList.size == 0){
            linearDataEmpty.visibility = View.VISIBLE
        }else{
            linearDataEmpty.visibility = View.GONE
            layoutManager = LinearLayoutManager(applicationContext)
            layoutManager.orientation = LinearLayoutManager.VERTICAL

            recyclerRate.layoutManager = layoutManager
            recyclerRate.itemAnimator = DefaultItemAnimator()
            recyclerRate.adapter = TransfertRateAdapter(applicationContext, transfertRateList.toTypedArray()) {}

            amountEdt.addTextChangedListener(object : TextWatcher{

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    val amount : Float = s.toString().toFloat()
                    for (transfert in transfertRateList){
                        //if ()
                    }
                }

                override fun afterTextChanged(s: Editable?) {}
            })
        }
    }

    private fun bindView() {
        rateFromFrance = findViewById(R.id.rateFromFrance)
        rateFromGabon = findViewById(R.id.rateFromGabon)
        recyclerRate = findViewById(R.id.recyclerRate)
        linearDataEmpty = findViewById(R.id.linearDataEmpty)
        amountEdt = findViewById(R.id.amountEdt)
    }
}
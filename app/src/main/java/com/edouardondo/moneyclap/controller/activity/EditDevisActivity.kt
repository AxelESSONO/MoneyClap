package com.edouardondo.moneyclap.controller.activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.adapter.DevisStepperAdapter
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError

class EditDevisActivity : AppCompatActivity(), StepperLayout.StepperListener {

    lateinit var stepperLayoutDevis : StepperLayout
    lateinit var back : ImageView
    lateinit var title : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_devis)

        /** 2- Changer le titre de cette page */
        val actionBar = supportActionBar

        /** ============= Bind View ============*/
        stepperLayoutDevis = findViewById(R.id.stepperLayoutDevis)
        back = findViewById(R.id.back)
        title = findViewById(R.id.title)

        stepperLayoutDevis.adapter = DevisStepperAdapter(supportFragmentManager, this)

        title.text = DevisStepperAdapter.titleList[0]


        stepperLayoutDevis.setListener(this)
        back.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onCompleted(completeButton: View?) {
        Toast.makeText(this, "onCompleted!", Toast.LENGTH_SHORT).show()
    }

    override fun onError(verificationError: VerificationError?) {
        Toast.makeText(this, "onError! -> " + verificationError!!.errorMessage, Toast.LENGTH_SHORT).show()
    }

    override fun onStepSelected(newStepPosition: Int) {
        Toast.makeText(this, "onStepSelected! -> $newStepPosition", Toast.LENGTH_SHORT).show()
        title.text = DevisStepperAdapter.titleList[newStepPosition]
    }

    override fun onReturn() {
        finish()
    }
}

package com.edouardondo.moneyklap.controller.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.myInterfaces.DataManager
import com.edouardondo.moneyklap.adapter.DevisStepperAdapter
import com.edouardondo.moneyklap.model.devis.DataDevis
import com.stepstone.stepper.StepperLayout

   class EditDevisActivity : AppCompatActivity(), DataManager{

    lateinit var back: ImageView
    lateinit var title: TextView
    lateinit var mStepperLayout : StepperLayout

   var dataDevis: DataDevis? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_devis)

        /** 2- Changer le titre de cette page */
        val actionBar = supportActionBar

            /** ============= Bind View ============*/
        back = findViewById(R.id.back)
        title = findViewById(R.id.title)
        mStepperLayout = findViewById(R.id.stepperLayoutDevis)
        val startingStepPosition = savedInstanceState?.getInt(CURRENT_STEP_POSITION_KEY) ?: 0
        dataDevis = savedInstanceState?.getParcelable(DATA)
        mStepperLayout.setAdapter(DevisStepperAdapter(supportFragmentManager, this), startingStepPosition)

        back.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(CURRENT_STEP_POSITION_KEY, mStepperLayout.currentStepPosition)
        outState.putParcelable(DATA, dataDevis)
        super.onSaveInstanceState(outState)
    }

    override fun onBackPressed() {
        val currentStepPosition = mStepperLayout.currentStepPosition
        if (currentStepPosition > 0) {
            mStepperLayout.onBackClicked()
        } else {
            finish()
        }
    }

    override fun onPassingData(dataDevis: DataDevis?) {
        this.dataDevis = dataDevis
    }

    override fun onReceivingData(): DataDevis? {
        return dataDevis
    }

    companion object {
        private const val CURRENT_STEP_POSITION_KEY = "position"
        private const val DATA = "data"
    }
}
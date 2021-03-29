package com.edouardondo.moneyklap.controller.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.adapter.DevisStepperAdapter
import com.edouardondo.moneyklap.controller.fragment.subFragment.devis.StepOneFragment
import com.edouardondo.moneyklap.controller.fragment.subFragment.devis.StepTwoFragment

class EditDevisActivity : AppCompatActivity(),
    StepOneFragment.CommunicatorFragmentOneToFragmentTwo {

    lateinit var back: ImageView
    lateinit var title: TextView
    lateinit var stepOneFragment: StepOneFragment
    lateinit var currentFragment : Fragment
    lateinit var backFrag: LinearLayout
    lateinit var nextFrag: LinearLayout
    lateinit var simpleProgressBar: ProgressBar
    var initialPosition: Int = 0
    var fragmentPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_devis)

        /** 2- Changer le titre de cette page */
        val actionBar = supportActionBar

        /** ============= Bind View ============*/
        //stepperLayoutDevis = findViewById(R.id.stepperLayoutDevis)
        back = findViewById(R.id.back)
        title = findViewById(R.id.title)
        backFrag = findViewById(R.id.back_frag)
        nextFrag = findViewById(R.id.next_frag)
        simpleProgressBar = findViewById(R.id.simpleProgressBar)
        initialPosition = simpleProgressBar.progress
        title.text = DevisStepperAdapter.titleList[0]
        stepOneFragment = StepOneFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.content_id, stepOneFragment)
            .commit()

        back.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onPassingData(
        directionTransaction: String,
        amountToSend: Float,
        amountToReceive: Float,
        totalAmount: Float,
        feeAmount: Float,
        retraitAmount: Float,
        position: Int,
        stepTwoFragment: StepTwoFragment?
    ) {

        fragmentPosition = position
        currentFragment = stepOneFragment

        if (fragmentPosition == 0) {
            val intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
        } else if (position == 2) {
            val bundle = Bundle().also {
                it.putString(StepOneFragment.DIRECTION, directionTransaction)
                it.putFloat(StepOneFragment.AMOUNT_SEND, amountToSend)
                it.putFloat(StepOneFragment.AMOUNT_RECEIVE, amountToReceive)
                it.putFloat(StepOneFragment.TOTAL_AMOUNT, totalAmount)
                it.putFloat(StepOneFragment.FEE_AMOUNT, feeAmount)
                it.putFloat(StepOneFragment.RETRAIT_AMOUNT, retraitAmount)
                it.putInt(StepOneFragment.FRAGMENT_POSITION, position + 1)
            }

            val transaction = this.supportFragmentManager.beginTransaction()

            stepTwoFragment?.arguments = bundle
            transaction.replace(R.id.content_id, stepTwoFragment!!)
            transaction.addToBackStack(null)
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            transaction.commit()
            simpleProgressBar.progress = initialPosition * position
        }
    }
}
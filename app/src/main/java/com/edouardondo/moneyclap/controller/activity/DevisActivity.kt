package com.edouardondo.moneyclap.controller.activity

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.controller.fragment.DevisFragment
import com.edouardondo.moneyclap.controller.fragment.subFragment.devis.AllDevisFragment
import com.edouardondo.moneyclap.controller.fragment.subFragment.devis.EditDevisFragment
import com.edouardondo.moneyclap.controller.fragment.subFragment.devis.ModifyDevisFragment
import com.edouardondo.moneyclap.controller.fragment.subFragment.devis.ResearchDevisFragment

class DevisActivity : AppCompatActivity() {

    lateinit var back : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devis)

        back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener {
            onBackPressed()
        }

        val data = intent.getStringExtra("DEVIS_FEATURE")
    }

    private fun replaceFragment(devisFeatureName: String, id: Int) {

        val fragment = when(devisFeatureName){

            "Faire un devis".toUpperCase() -> EditDevisFragment()
            "Rechercher un devis".toUpperCase() -> ResearchDevisFragment()
            "Modifier un devis".toUpperCase() -> ModifyDevisFragment()
            "Voir tous les devis".toUpperCase() -> AllDevisFragment()

            else -> DevisFragment()
        }

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(id, fragment)
        transaction.commit()
    }

}
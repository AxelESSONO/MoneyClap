package com.edouardondo.moneyclap.controller.activity

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.edouardondo.moneyclap.R

class HomeActivity : AppCompatActivity() {

    var toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        toolbar!!.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.colorTextBackgroundSecondary)))

        supportActionBar?.title = getString(R.string.app_name)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.toolbar_menu, menu)

        // Toolbar items
        val itemNotification = menu!!.findItem(R.id.ic_notifications)

        itemNotification.setVisible(true)

        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        return super.onPrepareOptionsMenu(menu)
    }

}
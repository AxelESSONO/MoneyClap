package com.edouardondo.moneyclap.controller.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.SearchView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.adapter.ViewPagerAdapter
import com.edouardondo.moneyclap.database.SourceData
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {


    lateinit var tablayout: TabLayout
    lateinit var viewPager: ViewPager
    lateinit var adapter: ViewPagerAdapter
    lateinit var researchFilter: SearchView
    lateinit var title: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        /** ------------Bind viewPager, tablayout and other view -----------------**/
        viewPager = findViewById(R.id.view_pager)
        tablayout = findViewById(R.id.tablayout)
        researchFilter = findViewById(R.id.research_filter)
        title = findViewById(R.id.title)

        /** -------------- Named tabs ------------------**/
        tablayout.addTab(tablayout.newTab().setText("Devis"))
        tablayout.addTab(tablayout.newTab().setText("Transfert"))
        tablayout.addTab(tablayout.newTab().setText("Compta."))
        tablayout.addTab(tablayout.newTab().setText("Clients"))

        /** --------------- Center gravity ----------- **/
        tablayout.tabGravity = TabLayout.GRAVITY_FILL

        /** --------------- Init viewpager adapter ----------- **/
        adapter = ViewPagerAdapter(this, supportFragmentManager, tablayout.tabCount)
        viewPager.adapter = adapter
        viewPager.currentItem = 0

        /** -------------- **/
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout))

        tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

  /*  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        val menuItem = menu!!.findItem(R.id.action_search)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }*/


}
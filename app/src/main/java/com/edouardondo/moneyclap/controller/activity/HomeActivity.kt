package com.edouardondo.moneyclap.controller.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.edouardondo.moneyclap.R
import com.edouardondo.moneyclap.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var tablayout: TabLayout
    lateinit var adapter: ViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        /** ------------Bind viewPager and tablayout -----------------**/
        viewPager = findViewById(R.id.view_pager)
        tablayout = findViewById(R.id.tablayout)

        /** -------------- Named tabs ------------------**/
        tablayout.addTab(tablayout.newTab().setText("Devis"))
        tablayout.addTab(tablayout.newTab().setText("Transaction"))
        tablayout.addTab(tablayout.newTab().setText("Comptabilité"))
        tablayout.addTab(tablayout.newTab().setText("Clients"))

        /** --------------- Center gravity ----------- **/
        tablayout.tabGravity = TabLayout.GRAVITY_FILL

        /** --------------- Init viewpager adapter ----------- **/
        adapter = ViewPagerAdapter(this, supportFragmentManager, tablayout.tabCount)
        viewPager.adapter = adapter

        /** -------------- **/
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout))
        tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

}
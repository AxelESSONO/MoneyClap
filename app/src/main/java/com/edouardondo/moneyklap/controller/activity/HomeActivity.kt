package com.edouardondo.moneyklap.controller.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.SessionManager
import com.edouardondo.moneyklap.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {

    lateinit var tablayout: TabLayout
    lateinit var viewPager: ViewPager
    lateinit var adapter: ViewPagerAdapter
    lateinit var researchFilter: SearchView
    lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        /** ------------Bind viewPager, tablayout and other view -----------------**/
        viewPager = findViewById(R.id.view_pager)
        tablayout = findViewById(R.id.tablayout)
        researchFilter = findViewById(R.id.research_filter)


        sessionManager = SessionManager(this)

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

        researchFilter.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(query: String?): Boolean {
                Toast.makeText(applicationContext, "$query", Toast.LENGTH_SHORT).show()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })

        if (sessionManager.isLogged()){
            val userEmail = sessionManager.getEmail()
            val userId = sessionManager.getUserId()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.logout -> {
                sessionManager.logout()
                val intent = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        return true
    }
}
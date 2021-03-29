package com.edouardondo.moneyklap.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.edouardondo.moneyklap.controller.fragment.home.AccountingFragment
import com.edouardondo.moneyklap.controller.fragment.home.TransactionFragment
import com.edouardondo.moneyklap.controller.fragment.home.CustomerProfileFragment
import com.edouardondo.moneyklap.controller.fragment.home.DevisFragment

class ViewPagerAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int = totalTabs


    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> DevisFragment()
            1 -> TransactionFragment()
            2 -> AccountingFragment()
            3 -> CustomerProfileFragment()
            else -> getItem(position)
        }
    }
}
package com.edouardondo.moneyclap.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.edouardondo.moneyclap.controller.fragment.AccountingFragment
import com.edouardondo.moneyclap.controller.fragment.DevisFragment
import com.edouardondo.moneyclap.controller.fragment.TransactionFragment
import com.edouardondo.moneyclap.controller.fragment.subFragment.devis.HandleCustomerFragment

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
            3 -> HandleCustomerFragment()
            else -> getItem(position)
        }
    }
}
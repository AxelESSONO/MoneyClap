package com.edouardondo.moneyclap.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.edouardondo.moneyclap.controller.fragment.DevisFragment
import com.edouardondo.moneyclap.controller.fragment.TransactionFragment

class ViewPagerAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> DevisFragment()
            1 -> TransactionFragment()
            else -> getItem(position)
        }
    }
}
package com.edouardondo.moneyklap.controller.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

import butterknife.ButterKnife

internal abstract class ButterKnifeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater!!.inflate(layoutResId, container, false)
        ButterKnife.bind(this, view)
        return view
    }

    @get:LayoutRes
    protected abstract val layoutResId: Int

}

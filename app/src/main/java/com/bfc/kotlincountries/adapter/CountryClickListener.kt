package com.bfc.kotlincountries.adapter

import android.view.View

interface CountryClickListener {
    fun onCoutryClicked(v: View,uuid: Int)
}
package com.hi.dhl.hilt.di

import android.util.Log
import javax.inject.Inject

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/6/24
 *     desc  :
 * </pre>
 */
class HiltSimple @Inject constructor() {
    fun doSomething() {
        Log.e(TAG, "----doSomething----${this.hashCode()}")
    }

    companion object {
        private val TAG = "HiltSimple"
    }
}
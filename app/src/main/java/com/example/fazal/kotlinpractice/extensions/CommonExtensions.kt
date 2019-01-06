package com.example.fazal.kotlinpractice.extensions

import android.app.Activity
import android.content.Context
import android.widget.Toast

    /**
     * Extension Function
     *
     * Extension function is used to modify the internal android class which is the part of
     * android SDK i.e Activity, Context, etc
     */
    fun Context.toast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

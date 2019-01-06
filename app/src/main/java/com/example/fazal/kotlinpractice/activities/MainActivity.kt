package com.example.fazal.kotlinpractice.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fazal.kotlinpractice.R
import com.example.fazal.kotlinpractice.Utils.*
import com.example.fazal.kotlinpractice.extensions.isNotEmpty
import com.example.fazal.kotlinpractice.extensions.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, Context.MODE_PRIVATE)
    }

    fun saveUser(view: View) {
        val isValid = userNameEt.isNotEmpty(inputLayout)

        if (isValid) {
            val editor = sharedPreferences.edit()
            editor.putString(Keys.USER_NAME, userNameEt.text.toString())
            editor.apply()
            tvUserName.text = sharedPreferences.getString(Keys.USER_NAME, "")
        }

    }

    fun nextClick(view: View) {
        //kotlin reflection
        var cls: Class<DisplayActivity> = DisplayActivity::class.java
        var intent = Intent(this, cls)
        startActivity(intent)
        toast("Starting display activity")

    }


}

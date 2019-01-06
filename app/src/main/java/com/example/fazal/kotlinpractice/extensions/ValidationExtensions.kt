package com.example.fazal.kotlinpractice.extensions

import android.support.design.widget.TextInputLayout
import android.widget.EditText

/**
 *
 * Extension Function
 *
 * The power of extension function is to used through out the application which can be inject in
 * the android internal class which is included in android sdk.
 *
 */


/**
 *
 * Check for edit text is empty if it is show the error.
 *
 * @return True if the edit text is not empty other wise return false.
 */
fun EditText.isNotEmpty(textInputLayout: TextInputLayout) : Boolean {
        return if (text.toString().isEmpty()){
            textInputLayout.error = "Can not be blank !"
            false
        } else {
            textInputLayout.isErrorEnabled = false
            true
        }
    }
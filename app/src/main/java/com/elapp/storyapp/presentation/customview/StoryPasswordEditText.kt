package com.elapp.storyapp.presentation.customview

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import com.elapp.storyapp.R.string

class StoryPasswordEditText : AppCompatEditText {


    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }
    constructor(context: Context) : super(context) {
        init()
    }




    private fun init() {
        addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val password = s.toString()
                when {
                    password.isBlank() -> error = context.getString(string.error_empty_password)
                    password.length < 8 -> error = context.getString(string.error_password_more_8)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
    }
}
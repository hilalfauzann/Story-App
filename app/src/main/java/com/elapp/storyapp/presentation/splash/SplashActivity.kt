package com.elapp.storyapp.presentation.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.elapp.storyapp.MainActivity
import com.elapp.storyapp.R
import com.elapp.storyapp.presentation.login.LoginActivity
import com.elapp.storyapp.utils.SessionManager
import com.elapp.storyapp.utils.UiConstValue

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var preference: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        preference = SessionManager(this)
        val isLogin = preference.isLogin
        Handler(Looper.getMainLooper()).postDelayed({
            when {
                isLogin -> {
                    MainActivity.start(this)
                    finish()
                }
                else -> {
                    LoginActivity.start(this)
                    finish()
                }
            }
        }, UiConstValue.LOADING_TIME)
    }
}
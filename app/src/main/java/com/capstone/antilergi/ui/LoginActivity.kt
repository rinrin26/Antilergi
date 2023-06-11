package com.capstone.antilergi.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.antilergi.MainActivity
import com.capstone.antilergi.R
import com.capstone.antilergi.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var loginBinding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        onAction()
    }

    private fun onAction() {
        val moveToHome = Intent(this,MainActivity::class.java)
        val moveToRegister = Intent(this,RegisterActivity::class.java)
        loginBinding.apply {
            btnLogin.setOnClickListener{
                startActivity(moveToHome)
            }
            btnRegister.setOnClickListener {
                startActivity(moveToRegister)
            }
        }
    }
}
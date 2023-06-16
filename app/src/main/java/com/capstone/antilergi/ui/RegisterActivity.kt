package com.capstone.antilergi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.capstone.antilergi.MainActivity
import com.capstone.antilergi.R
import com.capstone.antilergi.databinding.ActivityRegisterBinding

class RegisterActivity  : AppCompatActivity() {
    private lateinit var registerBinding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(registerBinding.root)

        onAction()
    }

    private fun onAction() {
        val moveToLogin = Intent(this, LoginActivity::class.java)

        registerBinding.apply {
            btnCloseRegister.setOnClickListener{
                finish()
            }

            btnRegister.setOnClickListener {
                Toast.makeText(it.context, "success register", Toast.LENGTH_SHORT).show()
                startActivity(moveToLogin)
            }
        }
    }
}
package com.capstone.antilergi.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.capstone.antilergi.MainActivity
import com.capstone.antilergi.R
import com.capstone.antilergi.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var resultBinding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resultBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(resultBinding.root)

        val btn: Button = resultBinding.btnResultBackToHome
        btn.setOnClickListener{
            val intent = Intent (it.context, MainActivity::class.java)
            it.context?.startActivity(intent)
        }

    }
}
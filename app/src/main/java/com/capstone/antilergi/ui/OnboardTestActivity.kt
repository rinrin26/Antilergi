package com.capstone.antilergi.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.capstone.antilergi.databinding.ActivityOnboardTestActivityBinding

class OnboardTestActivity:AppCompatActivity() {
    private lateinit var onboardTestActivityBinding: ActivityOnboardTestActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onboardTestActivityBinding = ActivityOnboardTestActivityBinding.inflate(layoutInflater)
        setContentView(onboardTestActivityBinding.root)

        val btnStartTest: Button = onboardTestActivityBinding.btnStartTest//root.findViewById(R.id.btn_test)
        btnStartTest.setOnClickListener{
            val intent = Intent (this, TestActivity::class.java)
            this?.startActivity(intent)
        }

        onActionBtn()
    }

    private fun onActionBtn() {
        onboardTestActivityBinding.apply {
            btnCloseOnboard.setOnClickListener{
                finish()
            }
        }
    }
}
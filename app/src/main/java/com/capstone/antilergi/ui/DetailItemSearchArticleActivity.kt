package com.capstone.antilergi.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.antilergi.databinding.ActivityDetailItemArticleBinding


class DetailItemSearchArticleActivity  : AppCompatActivity() {
    private lateinit var detailItemArticleBinding: ActivityDetailItemArticleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailItemArticleBinding = ActivityDetailItemArticleBinding.inflate(layoutInflater)
        setContentView(detailItemArticleBinding.root)
    }
}

package com.capstone.antilergi.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.capstone.antilergi.adapter.SearchListAdapter
import com.capstone.antilergi.databinding.ActivitySearchBinding
import com.capstone.antilergi.model.ArticleResponse
import com.capstone.antilergi.model.SearchViewModel

class SearchActivity: AppCompatActivity() {
    private lateinit var searchBinding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        searchBinding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(searchBinding.root)

        onActionButton()
    }

    private fun onActionButton() {
        searchBinding.apply {
            btnCloseSearch.setOnClickListener {
                finish()
            }
        }
    }

    private fun searchText(){
        val searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)

        val searchVArticle = searchBinding.searchViewIdsArticle
        searchVArticle.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget   .SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let { searchViewModel.searchDataArticle(it) }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
    }


    private fun viewListArticle(users : ArrayList<ArticleResponse>){
        val listArticle = ArrayList<ArticleResponse>()
        for(data in users)
            listArticle.add(
                ArticleResponse(
                    judul =  "${data.judul}",
                    alergi = null,
                    deskripsi = "${data.deskripsi}",
                    gambar = null,
                    gejala = " ${data.gejala}",
                    penyebab = null,
                    solusi = null
                )
            )

        searchBinding.rvListArticle.layoutManager = LinearLayoutManager(this)
        val adapter = SearchListAdapter(listArticle)
        searchBinding.rvListArticle.adapter = adapter

        adapter.setOnItemClickCallback(object: SearchListAdapter.OnItemClickCallback{
            override fun onItemClicked(data: ArticleResponse) {
                selectedItemArticleMovedToDetailArticle(data)
            }
        })
    }


    private fun selectedItemArticleMovedToDetailArticle(article: ArticleResponse){
        val goToDetailArticle = Intent(this@SearchActivity, DetailItemSearchArticleActivity::class.java)
        Log.e("main ", "user login ${article.gejala}")

        startActivity(goToDetailArticle)

    }
}
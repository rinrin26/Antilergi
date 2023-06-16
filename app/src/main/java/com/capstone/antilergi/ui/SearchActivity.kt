package com.capstone.antilergi.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.capstone.antilergi.R
import com.capstone.antilergi.adapter.SearchAdapter2
import com.capstone.antilergi.adapter.SearchListAdapter
import com.capstone.antilergi.databinding.ActivitySearchBinding
import com.capstone.antilergi.model.ArticleResponse
import com.capstone.antilergi.model.SearchViewModel

class SearchActivity: AppCompatActivity() {
    private lateinit var searchBinding: ActivitySearchBinding
    private lateinit var searchListAdapter: SearchListAdapter
    private lateinit var allergyList: ArrayList<ArticleResponse>
    private var filteredlist: ArrayList<ArticleResponse> = ArrayList()


    lateinit var alergyListRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        searchBinding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(searchBinding.root)

        alergyListRV = searchBinding.rvListArticle

        allergyList = ArrayList()
//        searchListAdapter = SearchListAdapter(allergyList)
//
//        alergyListRV.adapter = searchListAdapter
//
//        searchBinding.rvListArticle.layoutManager = LinearLayoutManager(this)

        allergyList.add(ArticleResponse(
            "Hewan",
            "Hewan",
            "Gejala Hewan",
            "Penyebab Hewan",
            "Penanganan Hewan",
            "",
            ""
        ),)
        allergyList.add( ArticleResponse(
            "Debu/Tungau",
            "Debu",
            "Gejala Debu/Tungau",
            "Penyebab Debu/Tungau",
            "Penanganan Debu/Tungau",
            "",
            ""
        ),)
        allergyList.add( ArticleResponse(
            "Makanan",
            "Makanan",
            "Gejala Makanan",
            "Penyebab Makanan",
            "Penanganan Makanan",
            "",
            ""
        ))
        onActionButton()
//        viewListArticle(filteredlist)
        onSearch()

    }


     fun onSearch(){
        val searchView = searchBinding.searchViewIdsArticle

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(msg: String?): Boolean {
                if (msg != null) {
                    filter(msg)
                }
                return false
            }

            override fun onQueryTextChange(msg: String): Boolean {

                return false
            }
        })
    }

    private fun filter(text: String) {
        for (item in allergyList) {
            if (item.alergi!!.toLowerCase().contains(text.toLowerCase())) {
                filteredlist.add(item)

                println("data filter $filteredlist")
            }
        }
        if (filteredlist.isEmpty()) {
            Toast.makeText(this, "No Data Found..", Toast.LENGTH_SHORT).show()
        }else{
            viewListArticle(filteredlist)
        }
    }

    private fun viewListArticle(msg: ArrayList<ArticleResponse>){
        val listArticle =  ArrayList<ArticleResponse>()
        for(data in msg )

            listArticle.add(
                ArticleResponse(
                    judul =  "${data.judul}",
                    alergi = "${data.alergi}",
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

    //
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        searchBinding = ActivitySearchBinding.inflate(layoutInflater)
//        setContentView(searchBinding.root)
//
//        // Inisialisasi data alergi dari string resources
//        allergyList = createMockData()
////            resources.getStringArray(R.array.resultTestNameAlergyList).toList()
//
//        // Buat adapter dan set pada RecyclerView
//        searchListAdapter = SearchListAdapter(filteredAllergyList)
//        searchBinding.rvListArticle.adapter = searchListAdapter
//        searchBinding.rvListArticle.layoutManager = LinearLayoutManager(this)
//
//        // Set listener untuk searchView
//        searchBinding.searchViewIdsArticle.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                filterAllergies(newText)
//                return true
//            }
//        })
//
//        filteredAllergyList.addAll(allergyList)
//    }
//
//    private fun filterAllergies(query: String?) {
//        filteredAllergyList.clear()
//        if (query.isNullOrEmpty()) {
//            filteredAllergyList.addAll(allergyList)
//        } else {
//            val filteredList = allergyList.filter { it.alergi!!.contains(query, ignoreCase = true) }
//            filteredAllergyList.addAll(filteredList)
//        }
//
//        searchListAdapter.notifyDataSetChanged()
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        searchBinding = ActivitySearchBinding.inflate(layoutInflater)
//        setContentView(searchBinding.root)
//
//        var listDataALergy= ArrayList<ArticleResponse>()
//        listDataALergy = createMockData()
//        searchBinding.rvListArticle.layoutManager = LinearLayoutManager(this)
//        searchListAdapter = SearchListAdapter(listDataALergy)
//        searchBinding.rvListArticle.adapter = searchListAdapter
//
//
//        searchText2()
////        getListSearchData()
//
//        onActionButton()
//    }
//
    private fun onActionButton() {
        searchBinding.apply {
            btnCloseSearch.setOnClickListener {
                finish()
            }
        }
    }
//
//    private fun searchText2(){
////        val searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
//
//        val searchVArticle = searchBinding.searchViewIdsArticle
//        searchVArticle.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
//            androidx.appcompat.widget   .SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                query?.let {search(it) }
//                return true
//            }
//            override fun onQueryTextChange(newText: String?): Boolean {
//                return false
//            }
//        })
//    }
//
//    private fun search(keyword: String) {
//        val dataNameAlergy = resources.getStringArray(R.array.resultTestNameAlergyList)
//        val dataDescription = resources.getStringArray(R.array.resultTestDescriptionAlergy)
//
//        // Cari data alergi yang sesuai dengan keyword
//        var listDataALergy= ArrayList<ArticleResponse>()
//        val filteredData = listDataALergy.filter { it.alergi!!.contains(keyword, ignoreCase = true)   }
////        for (i in filteredData.indices) {
////            val alergy = ArticleResponse("",dataNameAlergy[i], dataDescription[i],"","","","")
////            listDataALergy.add(alergy)
////        }
//
//        filteredData as ArrayList<ArticleResponse>
//        searchListAdapter = SearchListAdapter(filteredData)
////        // Update data pada adapter
////        searchBinding.rvListArticle.layoutManager = LinearLayoutManager(this)
////        searchListAdapter = SearchListAdapter(listDataALergy)
////        searchBinding.rvListArticle.adapter = searchListAdapter
////
////        searchListAdapter.setOnItemClickCallback(object: SearchListAdapter.OnItemClickCallback{
////            override fun onItemClicked(data: ArticleResponse) {
////                selectedItemArticleMovedToDetailArticle(data)
////            }
////        })
//    }
//
//
//
//    private fun getListSearchData(keyword: String): ArrayList<ArticleResponse> {
//
//        val dataNameAlergy = resources.getStringArray(R.array.resultTestNameAlergyList)
//        val dataDescription = resources.getStringArray(R.array.resultTestDescriptionAlergy)
//        var listDataALergy= ArrayList<ArticleResponse>()
//
//        for (i in dataNameAlergy.indices) {
//            val alergy = ArticleResponse("",dataNameAlergy[i], dataDescription[i],"","","","")
//            listDataALergy.add(alergy)
//        }
//        searchBinding.rvListArticle.layoutManager = LinearLayoutManager(this)
//        val adapter = SearchListAdapter(listDataALergy)
//        searchBinding.rvListArticle.adapter = adapter
//
//        adapter.setOnItemClickCallback(object: SearchListAdapter.OnItemClickCallback{
//            override fun onItemClicked(data: ArticleResponse) {
//                selectedItemArticleMovedToDetailArticle(data)
//            }
//        })
//
//        return listDataALergy
//    }
    private fun createMockData(): ArrayList<ArticleResponse> {
        // TODO: Buat mock data alergi menggunakan model Alergi
        return arrayListOf(
            ArticleResponse(
                "Hewan",
                "Hewan",
                "Gejala Hewan",
                "Penyebab Hewan",
                "Penanganan Hewan",
                "",
                ""
            ),
            ArticleResponse(
                "Debu/Tungau",
                "Debu",
                "Gejala Debu/Tungau",
                "Penyebab Debu/Tungau",
                "Penanganan Debu/Tungau",
                "",
                ""
            ),
            ArticleResponse(
                "Makanan",
                "Makanan",
                "Gejala Makanan",
                "Penyebab Makanan",
                "Penanganan Makanan",
                "",
                ""
            ),
            ArticleResponse(
                "Obat",
                "Obat",
                "Gejala Obat",
                "Penyebab Obat",
                "Penanganan Obat",
                "",
                ""
            ),
            ArticleResponse(
                "Serbuk Sari",
                "Serbuk Sari",
                "Gejala Serbuk Sari",
                "Penyebab Serbuk Sari",
                "Penanganan Serbuk Sari",
                "",
                ""
            ),
            ArticleResponse(
                "Suhu Udara (dingin/panas)",
                "Deskripsi Suhu Udara",
                "Gejala Suhu Udara",
                "",
                "",
                "",
                ""
            )
        )
    }
//
//    fun searchText(){
//        val searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
//
//        val searchVArticle = searchBinding.searchViewIdsArticle
//        searchVArticle.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
//            androidx.appcompat.widget   .SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                query?.let { searchViewModel.searchDataArticle(it) }
//                return true
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                return false
//            }
//        })
//    }
//
//

    private fun selectedItemArticleMovedToDetailArticle(article: ArticleResponse){
        val goToDetailArticle = Intent(this@SearchActivity, DetailItemSearchArticleActivity::class.java)
        Log.e("main ", "article ${article.gejala}")

        startActivity(goToDetailArticle)
    }
}
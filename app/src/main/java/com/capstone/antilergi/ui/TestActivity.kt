package com.capstone.antilergi.ui

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.capstone.antilergi.Constants
import com.capstone.antilergi.databinding.ActivityTestBinding
import com.capstone.antilergi.model.TestQuetions
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TestActivity: AppCompatActivity() {
    private lateinit var testBinding: ActivityTestBinding
    lateinit var sharedPreferences: SharedPreferences
    private lateinit var gson: Gson
    private lateinit var answerTestList: ArrayList<Int>
    private val questionsTestList: ArrayList<TestQuetions> = Constants.getTestQuetion()
    private var currentTestQuestionIndex = 0

    private var tvTestQuestion: TextView? = null
    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var btnOptionAnswer: ArrayList<Button>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        testBinding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(testBinding.root)

        onActionBtn()

        tvTestQuestion = testBinding.tvQuestion
        progressBar = testBinding.progressBarTest
        tvProgress = testBinding.tvProgress
        btnOptionAnswer = arrayListOf(testBinding.btnOption1,testBinding.btnOption2)
        sharedPreferences = getSharedPreferences("TestQuestionPreferences", Context.MODE_PRIVATE)
        gson = Gson()

        val savedAnswerListJson = sharedPreferences.getString("answer_list", null)

        // Mengkonversi string JSON menjadi ArrayList
        answerTestList = if (savedAnswerListJson != null) {
            gson.fromJson(savedAnswerListJson, object : TypeToken<ArrayList<Int>>() {}.type)
        } else {
            ArrayList()
        }

        btnOptionAnswer?.let {
            for (optionIndex in it.indices) {
                it[optionIndex].let {
                    it.setOnClickListener{
                        if (it == testBinding.btnOption1 ){
                            val answerTrue = 1
                            println("ini true nilainya ${answerTrue}")
                            answerTestList.add(answerTrue)
                            val answerListJson = gson.toJson(answerTestList)

                            // Menyimpan string JSON ke SharedPreferences
                            sharedPreferences.edit().putString("answer_list", answerListJson).apply()
                            answerTestList.clear()

                        }else{

                            val answerFalse = 0
                            println("ini true nilainya ${answerFalse}")
                            answerTestList.add(answerFalse)
                            val answerListJson = gson.toJson(answerTestList)

                            // Menyimpan string JSON ke SharedPreferences
                            sharedPreferences.edit().putString("answer_list", answerListJson).apply()
                            answerTestList.clear()

                        }

                        if (currentTestQuestionIndex < questionsTestList.size - 1) {
                            currentTestQuestionIndex++
                            updateTestQuestion()
                        }else{
                                val intent = Intent (this, ResultActivity::class.java)
                                this?.startActivity(intent)

                        }
                    }
                }
            }
        }

// Menggunakan data dari SharedPreferences
//        answerTestList.forEach { answer ->
//            // Lakukan sesuatu dengan setiap jawaban
//            println("Jawaban: $answer")
//        }
        println("Jawaban: $answerTestList")
    }


    private fun updateTestQuestion() {
        tvTestQuestion?.text = questionsTestList[currentTestQuestionIndex].questionText

        progressBar?.progress = currentTestQuestionIndex + 1

        tvProgress?.text = "${currentTestQuestionIndex + 1}/${questionsTestList.size}"

        for (optionIndex in questionsTestList[currentTestQuestionIndex].optionAnswer.indices) {
            btnOptionAnswer!![optionIndex].text = questionsTestList[currentTestQuestionIndex].optionAnswer[optionIndex]
        }
    }


    private fun onActionBtn() {
        testBinding.apply {
            backButton.setOnClickListener{
                finish()
            }

        }
    }
}
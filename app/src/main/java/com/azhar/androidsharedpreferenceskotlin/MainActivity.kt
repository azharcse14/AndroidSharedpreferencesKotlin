 package com.azhar.androidsharedpreferenceskotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clearBtnId.setOnClickListener {
            clearData()
        }

        loadBtnId.setOnClickListener {
            loadData()
        }

        saveBtnId.setOnClickListener{
            saveData()
        }
    }

     private fun clearData() {

     }

     private fun loadData() {

     }

     private fun saveData() {

         val sharedPreferences = getSharedPreferences("sharedPreps", Context.MODE_PRIVATE)
         val editor = sharedPreferences.edit()

         editor.putInt("id_key", id)
         editor.putString("name_key", name)
         editor.apply()

     }
 }
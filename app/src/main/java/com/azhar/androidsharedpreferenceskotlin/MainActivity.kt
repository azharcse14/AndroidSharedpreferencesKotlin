 package com.azhar.androidsharedpreferenceskotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {


     val sharedPreferences = getSharedPreferences("sharedPreps", Context.MODE_PRIVATE)

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
         val editor = sharedPreferences.edit()
         editor.clear()
         editor.apply()

     }

     private fun loadData() {
//         val sharedPreferences = getSharedPreferences("sharedPreps", Context.MODE_PRIVATE)

         val id = sharedPreferences.getInt("id_key", 0)
         val name = sharedPreferences.getString("name_key", null)

         idEtId.setText(id.toString())
         nameEtId.setText(name)

     }

     private fun saveData() {

//         val sharedPreferences = getSharedPreferences("sharedPreps", Context.MODE_PRIVATE)
         val editor = sharedPreferences.edit()

         val id = Integer.parseInt(idEtId.text.toString())
         val name = nameEtId.text.toString()
         editor.putInt("id_key", id)
         editor.putString("name_key", name)
         editor.apply()

     }
 }
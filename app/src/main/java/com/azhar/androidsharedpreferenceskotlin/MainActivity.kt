 package com.azhar.androidsharedpreferenceskotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
         val sharedPreferences = getSharedPreferences("sharedPreps", Context.MODE_PRIVATE)
         val editor = sharedPreferences.edit()
         editor.clear()
         editor.apply()
     }

     private fun loadData() {
         val sharedPreferences = getSharedPreferences("sharedPreps", Context.MODE_PRIVATE)

         val id = sharedPreferences.getInt("id_key", 0)
         val name = sharedPreferences.getString("name_key", null)
         val switch = sharedPreferences.getBoolean("boolean_key", false)

         idEtId.setText(id.toString())
         nameEtId.setText(name)
         switchId.isChecked = switch

     }

     private fun saveData() {

         val id = Integer.parseInt(idEtId.text.toString())
         val name = nameEtId.text.toString()

         val sharedPreferences = getSharedPreferences("sharedPreps", Context.MODE_PRIVATE)
         val editor = sharedPreferences.edit()

         editor.apply{
             putInt("id_key", id)
             putString("name_key", name)
             putBoolean("boolean_key", switchId.isChecked)
         }.apply()

         Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show()


//         editor.putInt("id_key", id)
//         editor.putString("name_key", name)
//         editor.apply()

     }
 }
 package com.azhar.androidsharedpreferenceskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        id = Integer.parseInt(idEtId.text.toString())
        name = nameEtId.text.toString()

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
}
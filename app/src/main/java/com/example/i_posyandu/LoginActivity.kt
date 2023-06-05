package com.example.i_posyandu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnStart : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val type = resources.getStringArray(R.array.type)
        val autocomplete : AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)
        val arrayAddapter = ArrayAdapter(this, R.layout.dropdown_item, type)
        autocomplete.setAdapter(arrayAddapter)
        autocomplete.onItemClickListener = AdapterView.OnItemClickListener{
            adapterView, view, i, l ->
        }

        btnStart = findViewById(R.id.btn_login)
        btnStart.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if(v != null){
            when(v.id){
                R.id.btn_login -> {
                    val normalIntent = Intent(this@LoginActivity, HomeFragment::class.java)
                    startActivity(normalIntent)
                }

            }
        }
    }


}
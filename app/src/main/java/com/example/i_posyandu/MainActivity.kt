package com.example.i_posyandu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnStart : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        btnStart = findViewById(R.id.btn_start)
        btnStart.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if(v != null){
            when(v.id){
                R.id.btn_start -> {
                    val normalIntent = Intent(this@MainActivity, LoginActivity::class.java)
                    startActivity(normalIntent)
                }

            }
        }
    }


}
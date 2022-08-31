package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Myhome : AppCompatActivity() {
    lateinit var ordernow:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myhome)

        supportActionBar?.hide()
        ordernow = findViewById(R.id.mBtnOrdernow)
        ordernow.setOnClickListener {
            intent = Intent(this, shop::class.java)
            startActivity(intent)
        }

    }
}
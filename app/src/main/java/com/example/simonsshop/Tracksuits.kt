package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Tracksuits : AppCompatActivity() {
    lateinit var pay: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracksuits)
        pay=findViewById(R.id.mBtnbuynow)
        pay=findViewById(R.id.mBtnbuynow)
        pay.setOnClickListener {
            val intent = Intent(this,Modeofpayment::class.java)
            startActivity(intent)
            Toast.makeText(this@Tracksuits,"Success", Toast.LENGTH_LONG).show()
        }
    }
}
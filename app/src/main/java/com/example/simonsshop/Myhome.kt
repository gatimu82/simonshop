package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class Myhome : AppCompatActivity() {
    lateinit var ordernow:Button
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var logout:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myhome)

        supportActionBar?.hide()

        firebaseAuth = FirebaseAuth.getInstance()
        logout = findViewById(R.id.logoutbtn)
        ordernow = findViewById(R.id.mBtnOrdernow)
        ordernow.setOnClickListener {
            intent = Intent(this, shop::class.java)
            startActivity(intent)
        }

        logout.setOnClickListener {
            firebaseAuth.signOut()
            startActivity(Intent(this, MainActivity::class.java))

        }

    }
}
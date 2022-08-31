package com.example.simonsshop

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import com.example.simonsshop.R.id.sign_up_btn
import com.example.simonsshop.R.id.signup_btn
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class MainActivity : AppCompatActivity() {
    lateinit var login:Button
    lateinit var signup:Button

    private lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        firebaseAuth =FirebaseAuth.getInstance()

        login = findViewById(R.id.login_btn)
             login.setOnClickListener {
             checkuser()
              val intent=Intent(this,Login::class.java)
              startActivity(intent)

            }
        signup = findViewById(signup_btn)
        signup.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)}
}

    private fun checkuser() {
            val firebaseUser = firebaseAuth.currentUser
            if (firebaseUser !=null){
                startActivity(Intent(this, Myhome::class.java))
                finish()
            }else{
                val intent = Intent(this, Register::class.java)
                startActivity(intent)
            }
    }
        }








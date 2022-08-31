package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    lateinit var loginbutton: Button
    lateinit var pass2: EditText
    lateinit var enteremail: EditText
    lateinit var username: EditText
    //firebase auth

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        loginbutton = findViewById(R.id.log_in_button)
        pass2 = findViewById(R.id.pass2)
        enteremail = findViewById(R.id.enter_email)
//        username = findViewById(R.id.enter_username)

        loginbutton.setOnClickListener {

            val intent = Intent(this, shop::class.java)
            startActivity(intent)
        }

        loginbutton.setOnClickListener {
            val go = Intent(applicationContext, Myhome::class.java)
            startActivity(go)
//            login()
////            updateUserName()
//        }
////            private fun updateUserName() {
////        val username = username.text.toString()
////        if (username.isEmpty()){
////            Toast.makeText(this, "input username", Toast.LENGTH_SHORT).show()
////        }else{
////            firebaseAuth.signInWithCredential(username)
////        }
    }

    }
    private fun login() {
        val email = enteremail.text.toString()
        val pass = pass2.text.toString()
//         calling signInWithEmailAndPassword(email, pass)
//         function using Firebase auth object
//         On successful response Display a Toast
        firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "login succsessful", Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
        }

    }


}

//private fun FirebaseAuth.signInWithCredential(username: String) {

//}


package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.simonsshop.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class Email_signup : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivitySignupBinding


    lateinit var pass: EditText
    lateinit var email: EditText
    lateinit var confirmpass: EditText

    lateinit var signup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_signup)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        auth = FirebaseAuth.getInstance()

        pass = findViewById(R.id.pass_edt)
        confirmpass = findViewById(R.id.passconfirm_edt)
        email = findViewById(R.id.email_edt)
        signup = findViewById(R.id.sign_up_btn2)


        signup.setOnClickListener {
            signUpUser()

        }

        //signup area

    }

    private fun signUpUser() {
        val email = email.text.toString()
        val pass = pass.text.toString()
        val confirmPassword = confirmpass.text.toString()

        // check pass
        if (email.isBlank() || pass.isBlank() || confirmPassword.isBlank()) {
            Toast.makeText(this, "Email and Password can't be blank", Toast.LENGTH_SHORT).show()
            return
        }

        if (pass != confirmPassword) {
            Toast.makeText(
                this,
                "Password and Confirm Password do not match",
                Toast.LENGTH_SHORT
            )
                .show()
            return
        }
        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully Signed Up", Toast.LENGTH_SHORT).show()
                finish()
                val intent = Intent(this, Myhome::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Sign Up Failed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


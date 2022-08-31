package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class Jordan4 : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView
    lateinit var imagefour:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_jordan4)
        imageone = findViewById(R.id.miguel1)
        imagetwo = findViewById(R.id.miguel2)
        imagethree =findViewById(R.id.miguel3)
        imagefour =findViewById(R.id.miguel4)


        imageone=findViewById(R.id.miguel1)
        imageone.setOnClickListener{
            val intent=Intent(this,offwhite::class.java )
            startActivity(intent)
            Toast.makeText(this@Jordan4,"Offwhite",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.miguel2)
        imagetwo.setOnClickListener{
            val intent=Intent(this,millitaryblack::class.java )
            startActivity(intent)
            Toast.makeText(this@Jordan4,"Millitary Black",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.miguel3)
        imagethree.setOnClickListener{
            val intent=Intent(this,blackcart::class.java )
            startActivity(intent)
            Toast.makeText(this@Jordan4,"BlackCart",Toast.LENGTH_LONG).show()
        }
        imagefour=findViewById(R.id.miguel4)
        imagefour.setOnClickListener{
            val intent=Intent(this,redfire::class.java )
            startActivity(intent)
            Toast.makeText(this@Jordan4,"Redfire",Toast.LENGTH_LONG).show()
        }

    }
}

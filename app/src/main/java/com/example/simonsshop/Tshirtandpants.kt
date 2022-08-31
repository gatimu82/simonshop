package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class Tshirtandpants : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_tshirtandpants)
        imageone = findViewById(R.id.shirt1)
        imagetwo = findViewById(R.id.pants2)

        imageone=findViewById(R.id.shirt1)
        imageone.setOnClickListener{
            val intent=Intent(this,shirt::class.java )
            startActivity(intent)
            Toast.makeText(this@Tshirtandpants,"black cargo pants",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.pants2)
        imagetwo.setOnClickListener{
            val intent=Intent(this,pant::class.java )
            startActivity(intent)
            Toast.makeText(this@Tshirtandpants,"white cargo pants",Toast.LENGTH_LONG).show()
        }


    }
}


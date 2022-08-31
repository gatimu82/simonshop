package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class vercityjacket : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_vercityjacket)
        imageone = findViewById(R.id.vercity1)
        imagetwo = findViewById(R.id.vercity2)
        imagethree =findViewById(R.id.vercity3)


        imageone=findViewById(R.id.vercity1)
        imageone.setOnClickListener{
            val intent=Intent(this,nyjacket::class.java )
            startActivity(intent)
            Toast.makeText(this@vercityjacket,"New York Vercity",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.vercity2)
        imagetwo.setOnClickListener{
            val intent=Intent(this,nojacket::class.java )
            startActivity(intent)
            Toast.makeText(this@vercityjacket,"New Orlean Versity",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.vercity3)
        imagethree.setOnClickListener{
            val intent=Intent(this,chicago::class.java )
            startActivity(intent)
            Toast.makeText(this@vercityjacket,"Chicago Vercity",Toast.LENGTH_LONG).show()
        }

    }
}


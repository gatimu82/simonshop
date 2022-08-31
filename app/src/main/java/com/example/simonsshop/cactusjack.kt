package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class cactusjack : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView
    lateinit var imagefour:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_cactusjack)
        imageone = findViewById(R.id.bluecj)
        imagetwo = findViewById(R.id.sbdunk)
        imagethree =findViewById(R.id.mwangi1)
        imagefour =findViewById(R.id.ndege)

        imageone=findViewById(R.id.bluecj)
        imageone.setOnClickListener{
            val intent=Intent(this,j4cactusj::class.java )
            startActivity(intent)
            Toast.makeText(this@cactusjack,"Air Jordan 4 Cactus Jack",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.sbdunk)
        imagetwo.setOnClickListener{
            val intent=Intent(this,SBlowDunk::class.java )
            startActivity(intent)
            Toast.makeText(this@cactusjack,"SB Dunk",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.mwangi1)
        imagethree.setOnClickListener{
            val intent=Intent(this,trainer1sp::class.java )
            startActivity(intent)
            Toast.makeText(this@cactusjack,"Trainer 1 sp",Toast.LENGTH_LONG).show()
        }
        imagefour=findViewById(R.id.ndege)
        imagefour.setOnClickListener{
            val intent=Intent(this,airforcecj::class.java )
            startActivity(intent)
            Toast.makeText(this@cactusjack,"Air Force 1 cj",Toast.LENGTH_LONG).show()
        }

    }
}



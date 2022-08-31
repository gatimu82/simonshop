package com.example.simonsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class cargopants : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView

                    override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                supportActionBar?.hide()
                setContentView(R.layout.activity_cargopants)
                imageone = findViewById(R.id.cargo1)
                imagetwo = findViewById(R.id.cargo2)
                imagethree =findViewById(R.id.cargo3)


                imageone=findViewById(R.id.cargo1)
                imageone.setOnClickListener{
                    val intent=Intent(this,blackcargo::class.java )
                    startActivity(intent)
            Toast.makeText(this@cargopants,"black cargo pants",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.cargo2)
        imagetwo.setOnClickListener{
            val intent=Intent(this,whitecargo::class.java )
            startActivity(intent)
            Toast.makeText(this@cargopants,"white cargo pants",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.cargo3)
        imagethree.setOnClickListener{
            val intent=Intent(this,greencargo::class.java )
            startActivity(intent)
            Toast.makeText(this@cargopants,"green cargo pants",Toast.LENGTH_LONG).show()
        }

    }
}


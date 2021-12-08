package com.example.crypto_tracker

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.crypted.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.ListButton)
        val button2: Button = findViewById(R.id.miningButton)



        button.setOnClickListener {
            val intent = Intent(this, listofcoin::class.java).apply {}
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, mining::class.java).apply {}
            startActivity(intent)
        }


    }
}
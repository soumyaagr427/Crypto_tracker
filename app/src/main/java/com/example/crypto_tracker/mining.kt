package com.example.crypto_tracker

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.crypted.R

class mining : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mining)
        val button3: Button = findViewById(R.id.mine)
        button3.setOnClickListener {
            val intent = Intent(this, mining_next::class.java).apply {}
            startActivity(intent)
        }



    }
}
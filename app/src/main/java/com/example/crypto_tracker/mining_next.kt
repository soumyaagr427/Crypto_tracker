package com.example.crypto_tracker

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.crypted.R

class mining_next : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mining_next)
        val button4: Button = findViewById(R.id.next1)

        button4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://medium.com/geekculture/how-to-easily-mine-bitcoin-at-home-and-make-upto-20k-per-month-8d2880e9fc15"))
            startActivity(intent)
        }
    }
}
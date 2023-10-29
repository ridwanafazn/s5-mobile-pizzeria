package com.example.pizzeria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.annotation.SuppressLint

class MenuDetails : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_details)

        val orderNowBtn = findViewById<Button>(R.id.orderNowBtn)
        val backBtn = findViewById<Button>(R.id.backBtn)

        orderNowBtn.setOnClickListener{
            val intent = Intent(this, OrderDetails::class.java)
            startActivity(intent)
        }

        backBtn.setOnClickListener{
            onBackPressed()
        }
    }
}
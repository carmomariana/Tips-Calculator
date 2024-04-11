package com.example.layoutapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SummaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        val totalTable = intent.getFloatExtra("totalTable", 0.0f)
        val numPeople = intent.getIntExtra("numPeople", 0)
        val percentage = intent.getIntExtra("percentage",0)
        val totalAmount = intent.getFloatExtra("totalAmount", 0.0f)

        println("Mariana1" + totalAmount)
    }
}
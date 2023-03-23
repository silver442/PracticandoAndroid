package com.silver2.androidmaster.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.silver2.androidmaster.R

class ResultActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_result)
    val tvResult = findViewById<TextView>(R.id.tvResult)
    val name: String? = intent.extras?.getString("EXTRA_NAME")
    tvResult.text = "Hola $name"
  }
}
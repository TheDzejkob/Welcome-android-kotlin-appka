package com.example.todoappka

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onButtonClick(view: View){
        //val je constanta ne var normalni neda se menit
        val invisibleText: TextView = findViewById(R.id.InvisibleText);
        invisibleText.visibility = View.VISIBLE;
        invisibleText.text = "Hello, Android developer!"
    }


}

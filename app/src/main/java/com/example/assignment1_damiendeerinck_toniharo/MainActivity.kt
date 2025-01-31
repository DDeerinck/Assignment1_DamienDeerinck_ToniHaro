package com.example.assignment1_damiendeerinck_toniharo


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val findGrade = findViewById<Button>(R.id.gradeButton)
        findGrade.setOnClickListener {
            val gradeIn = findViewById<TextInputEditText>(R.id.gradeInput)
            val numberGrade = gradeIn.text
            val output = findViewById<TextView>(R.id.gradeView)
            output.text = numberGrade
        }
    }

}
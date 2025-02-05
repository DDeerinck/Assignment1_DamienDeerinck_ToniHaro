package com.example.assignment1_damiendeerinck_toniharo

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
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


        val gradeScreenButton = findViewById<Button>(R.id.toGradeScreen)
        gradeScreenButton.setOnClickListener{
            val intent = Intent(this, GradeActivity::class.java)
            startActivity(intent)
        }
        /*
        val findGrade = findViewById<Button>(R.id.gradeButton)
        findGrade.setOnClickListener {
            val gradeIn = findViewById<TextInputEditText>(R.id.gradeInput)
            val numberGrade = gradeIn.text
            val output = findViewById<TextView>(R.id.gradeView)
            output.text = getGrade(numberGrade.toString())
        }*/


    }

    /*
    fun getGrade(gradeIn:String):String {
        val score = gradeIn.toDoubleOrNull()

        return if(score == null) {"Null"
        } else if(score >  94){"A"
        } else if(score >= 90){"A-"
        } else if(score >= 87){"B+"
        } else if(score >= 83){"B"
        } else if(score >= 80){"B-"
        } else if(score >= 77){"C+"
        } else if(score >= 73){"C"
        } else if(score >= 70){"C-"
        } else "F"
    }*/
}
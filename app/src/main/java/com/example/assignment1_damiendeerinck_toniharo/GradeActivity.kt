package com.example.assignment1_damiendeerinck_toniharo


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class GradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grade)
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
            output.text = getGrade(numberGrade.toString())
        }


    }
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
    }
}
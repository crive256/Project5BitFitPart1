package com.example.project5bitfitpart1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class DataEntry : AppCompatActivity() {
    private lateinit var dateEnter: EditText
    private lateinit var testText: TextView
    private lateinit var goodOrBadSleep: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_data_entry)

        var isGoodSleep = false
        dateEnter = findViewById(R.id.editTextDate)
        goodOrBadSleep = findViewById(R.id.GoodSleep)
        testText = findViewById(R.id.testText)

        findViewById<Switch>(R.id.GoodSleep).setOnClickListener{
            if (goodOrBadSleep.isChecked){
                isGoodSleep = true
                testText.text = "Good Sleep? " + isGoodSleep.toString()
            }
            else{
                isGoodSleep = false
                testText.text = "Good Sleep? " + isGoodSleep.toString()
            }
        }


        findViewById<Button>(R.id.Submit).setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
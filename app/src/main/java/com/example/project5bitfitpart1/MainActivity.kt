package com.example.project5bitfitpart1

import android.content.Intent
import android.os.Bundle
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

  //      var dateTestText = findViewById<TextView>(R.id.dateTest)
    //    var goodBadText = findViewById<TextView>(R.id.dateTest)

        findViewById<Button>(R.id.SleepButton).setOnClickListener {
            val intent = Intent(this, DataEntry::class.java)
            startActivity(intent)
        }

    }
}
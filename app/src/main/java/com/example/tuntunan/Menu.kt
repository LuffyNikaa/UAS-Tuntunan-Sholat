package com.example.tuntunan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        findViewById<Button>(R.id.button1).setOnClickListener {
            startActivity(Intent(this, Page1::class.java))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            startActivity(Intent(this, Page2::class.java))
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            startActivity(Intent(this, Page3::class.java))
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            startActivity(Intent(this, Page4::class.java))
        }

        findViewById<Button>(R.id.button5).setOnClickListener {
            startActivity(Intent(this, Page5::class.java))
        }

        findViewById<Button>(R.id.button6).setOnClickListener {
            startActivity(Intent(this, Page6::class.java))
        }

        findViewById<Button>(R.id.button7).setOnClickListener {
            startActivity(Intent(this, Page7::class.java))
        }
    }
}
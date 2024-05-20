package com.example.tuntunan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class Page3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sholat Fardhu"

        // Subuh Section
        val subuhTitle = findViewById<TextView>(R.id.subuhTitle)
        val subuhContent = findViewById<TextView>(R.id.subuhContent)
        subuhTitle.setOnClickListener {
            toggleVisibility(subuhContent)
        }

        // Dhuhur Section
        val dhuhurTitle = findViewById<TextView>(R.id.dhuhurTitle)
        val dhuhurContent = findViewById<TextView>(R.id.dhuhurContent)
        dhuhurTitle.setOnClickListener {
            toggleVisibility(dhuhurContent)
        }

        // Ashar Section
        val asharTitle = findViewById<TextView>(R.id.asharTitle)
        val asharContent = findViewById<TextView>(R.id.asharContent)
        asharTitle.setOnClickListener {
            toggleVisibility(asharContent)
        }

        // Maghrib Section
        val maghribTitle = findViewById<TextView>(R.id.maghribTitle)
        val maghribContent = findViewById<TextView>(R.id.maghribContent)
        maghribTitle.setOnClickListener {
            toggleVisibility(maghribContent)
        }

        // Isya Section
        val isyaTitle = findViewById<TextView>(R.id.isyaTitle)
        val isyaContent = findViewById<TextView>(R.id.isyaContent)
        isyaTitle.setOnClickListener {
            toggleVisibility(isyaContent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun toggleVisibility(view: View) {
        view.visibility = if (view.visibility == View.VISIBLE) View.GONE else View.VISIBLE
    }
}
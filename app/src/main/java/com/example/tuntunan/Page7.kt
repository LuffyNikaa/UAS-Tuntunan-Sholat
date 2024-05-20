package com.example.tuntunan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class Page7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page7)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Doa Setelah Sholat"

        // Section: istigfar
        val istigfarTitle = findViewById<TextView>(R.id.istigfarTitle)
        val istigfarContent = findViewById<TextView>(R.id.istigfarContent)
        istigfarTitle.setOnClickListener {
            toggleVisibility(istigfarContent)
        }

        // Section: tahlil
        val tahlilTitle = findViewById<TextView>(R.id.tahlilTitle)
        val tahlilContent = findViewById<TextView>(R.id.tahlilContent)
        tahlilTitle.setOnClickListener {
            toggleVisibility(tahlilContent)
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
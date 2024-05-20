package com.example.tuntunan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class Page6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page6)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sholat Jama' dan Qashar"

        // Section: Arti
        val artiSakitTitle = findViewById<TextView>(R.id.artiSakitTitle)
        val artiSakitContent = findViewById<TextView>(R.id.artiSakitContent)
        artiSakitTitle.setOnClickListener {
            toggleVisibility(artiSakitContent)
        }

        // Section: Syarat
        val syaratSakitTitle = findViewById<TextView>(R.id.syaratSakitTitle)
        val syaratSakitContent = findViewById<TextView>(R.id.syaratSakitContent)
        syaratSakitTitle.setOnClickListener {
            toggleVisibility(syaratSakitContent)
        }

        // Section: Tata Cara
        val tataSakitTitle = findViewById<TextView>(R.id.tataSakitTitle)
        val tataSakitContent = findViewById<TextView>(R.id.tataSakitContent)
        tataSakitTitle.setOnClickListener {
            toggleVisibility(tataSakitContent)
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

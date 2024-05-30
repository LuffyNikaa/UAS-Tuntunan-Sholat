package com.example.tuntunan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
        subuhTitle.setOnClickListener {
            openPdf("shalat_subuh.pdf")
        }

        // Dhuhur Section
        val dhuhurTitle = findViewById<TextView>(R.id.dhuhurTitle)
        dhuhurTitle.setOnClickListener {
            openPdf("shalat_dzuhur.pdf")
        }

        // Ashar Section
        val asharTitle = findViewById<TextView>(R.id.asharTitle)
        asharTitle.setOnClickListener {
            openPdf("shalat_ashar.pdf")
        }

        // Maghrib Section
        val maghribTitle = findViewById<TextView>(R.id.maghribTitle)
        maghribTitle.setOnClickListener {
            openPdf("shalat_maghrib.pdf")
        }

        // Isya Section
        val isyaTitle = findViewById<TextView>(R.id.isyaTitle)
        isyaTitle.setOnClickListener {
            openPdf("shalat_isya.pdf")
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun toggleVisibility(view: View) {
        view.visibility = if (view.visibility == View.VISIBLE) View.GONE else View.VISIBLE
    }
    private fun openPdf(fileName: String) {
        val intent = Intent(this, PdfActivity::class.java)
        intent.putExtra("pdfFileName", fileName)
        startActivity(intent)
    }
}
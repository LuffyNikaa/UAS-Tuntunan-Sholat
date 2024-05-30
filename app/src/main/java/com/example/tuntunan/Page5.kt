package com.example.tuntunan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Page5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sholat Jama' dan Qashar"

        // Jama Section
        val jamaTitle = findViewById<TextView>(R.id.jamaTitle)
        jamaTitle.setOnClickListener {
            openPdf("shalat_jamak.pdf")
        }

        // Qashar Section
        val qasharTitle = findViewById<TextView>(R.id.qasharTitle)
        qasharTitle.setOnClickListener {
            openPdf("shalat_qashar.pdf")
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

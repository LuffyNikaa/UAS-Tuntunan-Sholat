package com.example.tuntunan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class Page1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Wudhu"

        // Arti Wudhu Section
        val artiWudhuTitle = findViewById<TextView>(R.id.artiWudhuTitle)
        val artiWudhuContent = findViewById<TextView>(R.id.artiWudhuContent)
        artiWudhuTitle.setOnClickListener {
            toggleVisibility(artiWudhuContent)
        }

        // Fardhu Wudhu Section
        val fardhuWudhuTitle = findViewById<TextView>(R.id.fardhuWudhuTitle)
        val fardhuWudhuContent = findViewById<TextView>(R.id.fardhuWudhuContent)
        fardhuWudhuTitle.setOnClickListener {
            toggleVisibility(fardhuWudhuContent)
        }

        // Sunnah Wudhu Section
        val sunnahWudhuTitle = findViewById<TextView>(R.id.sunnahWudhuTitle)
        val sunnahWudhuContent = findViewById<TextView>(R.id.sunnahWudhuContent)
        sunnahWudhuTitle.setOnClickListener {
            toggleVisibility(sunnahWudhuContent)
        }

        // Syarat Wudhu Section
        val syaratWudhuTitle = findViewById<TextView>(R.id.syaratWudhuTitle)
        val syaratWudhuContent = findViewById<TextView>(R.id.syaratWudhuContent)
        syaratWudhuTitle.setOnClickListener {
            toggleVisibility(syaratWudhuContent)
        }

        // Tata Cara Wudhu Section
        val tataWudhuTitle = findViewById<TextView>(R.id.tataWudhuTitle)
        val tataWudhuContent = findViewById<TextView>(R.id.tataWudhuContent)
        tataWudhuTitle.setOnClickListener {
            toggleVisibility(tataWudhuContent)
        }

        // Yang Membatalkan Wudhu Section
        val batalWudhuTitle = findViewById<TextView>(R.id.batalWudhuTitle)
        val batalWudhuContent = findViewById<TextView>(R.id.batalWudhuContent)
        batalWudhuTitle.setOnClickListener {
            toggleVisibility(batalWudhuContent)
        }

        // Niat Wudhu Section
        val niatWudhuTitle = findViewById<TextView>(R.id.niatWudhuTitle)
        val niatWudhuContent = findViewById<TextView>(R.id.niatWudhuContent)
        niatWudhuTitle.setOnClickListener {
            toggleVisibility(niatWudhuContent)
        }

        // Doa Wudhu Section
        val doaWudhuTitle = findViewById<TextView>(R.id.doaWudhuTitle)
        val doaWudhuContent = findViewById<TextView>(R.id.doaWudhuContent)
        niatWudhuTitle.setOnClickListener {
            toggleVisibility(niatWudhuContent)
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

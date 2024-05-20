package com.example.tuntunan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class Page2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Tayamum"

        // Arti Tayamum Section
        val artiTayamumTitle = findViewById<TextView>(R.id.artiTayamumTitle)
        val artiTayamumContent = findViewById<TextView>(R.id.artiTayamumContent)
        artiTayamumTitle.setOnClickListener {
            toggleVisibility(artiTayamumContent)
        }

        // Fardhu Tayamum Section
        val fardhuTayamumTitle = findViewById<TextView>(R.id.fardhuTayamumTitle)
        val fardhuTayamumContent = findViewById<TextView>(R.id.fardhuTayamumContent)
        fardhuTayamumTitle.setOnClickListener {
            toggleVisibility(fardhuTayamumContent)
        }

        // Sunnah Tayamum Section
        val sunnahTayamumTitle = findViewById<TextView>(R.id.sunnahTayamumTitle)
        val sunnahTayamumContent = findViewById<TextView>(R.id.sunnahTayamumContent)
        sunnahTayamumTitle.setOnClickListener {
            toggleVisibility(sunnahTayamumContent)
        }

        // Syarat Tayamum Section
        val syaratTayamumTitle = findViewById<TextView>(R.id.syaratTayamumTitle)
        val syaratTayamumContent = findViewById<TextView>(R.id.syaratTayamumContent)
        syaratTayamumTitle.setOnClickListener {
            toggleVisibility(syaratTayamumContent)
        }

        // Tata Cara Tayamum Section
        val tataTayamumTitle = findViewById<TextView>(R.id.tataTayamumTitle)
        val tataTayamumContent = findViewById<TextView>(R.id.tataTayamumContent)
        tataTayamumTitle.setOnClickListener {
            toggleVisibility(tataTayamumContent)
        }

        // Yang Membatalkan Tayamum Section
        val batalTayamumTitle = findViewById<TextView>(R.id.batalTayamumTitle)
        val batalTayamumContent = findViewById<TextView>(R.id.batalTayamumContent)
        batalTayamumTitle.setOnClickListener {
            toggleVisibility(batalTayamumContent)
        }

        // Niat Tayamum Section
        val niatTayamumTitle = findViewById<TextView>(R.id.niatTayamumTitle)
        val niatTayamumContent = findViewById<TextView>(R.id.niatTayamumContent)
        niatTayamumTitle.setOnClickListener {
            toggleVisibility(niatTayamumContent)
        }

        // Doa Tayamum Section
        val ketTayamumTitle = findViewById<TextView>(R.id.ketTayamumTitle)
        val ketTayamumContent = findViewById<TextView>(R.id.ketTayamumContent)
        ketTayamumTitle.setOnClickListener {
            toggleVisibility(ketTayamumContent)
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

package com.example.tuntunan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class Page4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sholat Sunnah"

        // Dhuha Section
        val dhuhaTitle = findViewById<TextView>(R.id.dhuhaTitle)
        val dhuhaContent = findViewById<TextView>(R.id.dhuhaContent)
        dhuhaTitle.setOnClickListener {
            toggleVisibility(dhuhaContent)
        }

        // Hajat Section
        val hajatTitle = findViewById<TextView>(R.id.hajatTitle)
        val hajatContent = findViewById<TextView>(R.id.hajatContent)
        hajatTitle.setOnClickListener {
            toggleVisibility(hajatContent)
        }

        // Ied Section
        val iedTitle = findViewById<TextView>(R.id.iedTitle)
        val iedContent = findViewById<TextView>(R.id.iedContent)
        iedTitle.setOnClickListener {
            toggleVisibility(iedContent)
        }

        // Istikharah Section
        val istikharahTitle = findViewById<TextView>(R.id.istikharahTitle)
        val istikharahContent = findViewById<TextView>(R.id.istikharahContent)
        istikharahTitle.setOnClickListener {
            toggleVisibility(istikharahContent)
        }

        // Istishqa Section
        val istishqaTitle = findViewById<TextView>(R.id.istishqaTitle)
        val istishqaContent = findViewById<TextView>(R.id.istishqaContent)
        istishqaTitle.setOnClickListener {
            toggleVisibility(istishqaContent)
        }

        // Khusuf Section
        val khusufTitle = findViewById<TextView>(R.id.khusufTitle)
        val khusufContent = findViewById<TextView>(R.id.khusufContent)
        khusufTitle.setOnClickListener {
            toggleVisibility(khusufContent)
        }

        // Rawatib Section
        val rawatibTitle = findViewById<TextView>(R.id.rawatibTitle)
        val rawatibContent = findViewById<TextView>(R.id.rawatibContent)
        rawatibTitle.setOnClickListener {
            toggleVisibility(rawatibContent)
        }

        // Safar Section
        val safarTitle = findViewById<TextView>(R.id.safarTitle)
        val safarContent = findViewById<TextView>(R.id.safarContent)
        safarTitle.setOnClickListener {
            toggleVisibility(safarContent)
        }

        // Tahajjud Section
        val tahajjudTitle = findViewById<TextView>(R.id.tahajjudTitle)
        val tahajjudContent = findViewById<TextView>(R.id.tahajjudContent)
        tahajjudTitle.setOnClickListener {
            toggleVisibility(tahajjudContent)
        }

        // Tahiyatul Masjid Section
        val tahiyatulMasjidTitle = findViewById<TextView>(R.id.tahiyatulMasjidTitle)
        val tahiyatulMasjidContent = findViewById<TextView>(R.id.tahiyatulMasjidContent)
        tahiyatulMasjidTitle.setOnClickListener {
            toggleVisibility(tahiyatulMasjidContent)
        }

        // Tarawih Section
        val tarawihTitle = findViewById<TextView>(R.id.tarawihTitle)
        val tarawihContent = findViewById<TextView>(R.id.tarawihContent)
        tarawihTitle.setOnClickListener {
            toggleVisibility(tarawihContent)
        }

        // Tasbih Section
        val tasbihTitle = findViewById<TextView>(R.id.tasbihTitle)
        val tasbihContent = findViewById<TextView>(R.id.tasbihContent)
        tasbihTitle.setOnClickListener {
            toggleVisibility(tasbihContent)
        }

        // Taubat Section
        val taubatTitle = findViewById<TextView>(R.id.taubatTitle)
        val taubatContent = findViewById<TextView>(R.id.taubatContent)
        taubatTitle.setOnClickListener {
            toggleVisibility(taubatContent)
        }

        // Witir Section
        val witirTitle = findViewById<TextView>(R.id.witirTitle)
        val witirContent = findViewById<TextView>(R.id.witirContent)
        witirTitle.setOnClickListener {
            toggleVisibility(witirContent)
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
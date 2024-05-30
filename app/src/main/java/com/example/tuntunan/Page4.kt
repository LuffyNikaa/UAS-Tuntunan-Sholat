package com.example.tuntunan

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
        dhuhaTitle.setOnClickListener {
            openPdf("shalat_dhuha.pdf")
        }

        // Hajat Section
        val hajatTitle = findViewById<TextView>(R.id.hajatTitle)
        hajatTitle.setOnClickListener {
            openPdf("shalat_hajat.pdf")
        }

        // Ied Section
        val iedTitle = findViewById<TextView>(R.id.iedTitle)
        iedTitle.setOnClickListener {
            openPdf("shalat_ied.pdf")
        }

        // Istikharah Section
        val istikharahTitle = findViewById<TextView>(R.id.istikharahTitle)
        istikharahTitle.setOnClickListener {
            openPdf("shalat_istikharah.pdf")
        }

        // Istishqa Section
        val istishqaTitle = findViewById<TextView>(R.id.istishqaTitle)
        istishqaTitle.setOnClickListener {
            openPdf("shalat_istishqa.pdf")
        }

        // Khusuf Section
        val khusufTitle = findViewById<TextView>(R.id.khusufTitle)
        khusufTitle.setOnClickListener {
            openPdf("shalat_khusuf.pdf")
        }

        // Rawatib Section
        val rawatibTitle = findViewById<TextView>(R.id.rawatibTitle)
        rawatibTitle.setOnClickListener {
            openPdf("shalat_rawatib.pdf")
        }

        // Safar Section
        val safarTitle = findViewById<TextView>(R.id.safarTitle)
        safarTitle.setOnClickListener {
            openPdf("shalat_safar.pdf")
        }

        // Tahajjud Section
        val tahajjudTitle = findViewById<TextView>(R.id.tahajjudTitle)
        tahajjudTitle.setOnClickListener {
            openPdf("shalat_tahajjud.pdf")
        }

        // Tahiyatul Masjid Section
        val tahiyatulMasjidTitle = findViewById<TextView>(R.id.tahiyatulMasjidTitle)
        tahiyatulMasjidTitle.setOnClickListener {
            openPdf("shalat_tahiyatul_masjid.pdf")
        }

        // Tarawih Section
        val tarawihTitle = findViewById<TextView>(R.id.tarawihTitle)
        tarawihTitle.setOnClickListener {
            openPdf("shalat_tarawih.pdf")
        }

        // Tasbih Section
        val tasbihTitle = findViewById<TextView>(R.id.tasbihTitle)
        tasbihTitle.setOnClickListener {
            openPdf("shalat_tasbih.pdf")
        }

        // Taubat Section
        val taubatTitle = findViewById<TextView>(R.id.taubatTitle)
        taubatTitle.setOnClickListener {
            openPdf("shalat_taubat.pdf")
        }

        // Witir Section
        val witirTitle = findViewById<TextView>(R.id.witirTitle)
        witirTitle.setOnClickListener {
            openPdf("shalat_witir.pdf")
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun openPdf(fileName: String) {
        val intent = Intent(this, PdfActivity::class.java)
        intent.putExtra("pdfFileName", fileName)
        startActivity(intent)
    }
}
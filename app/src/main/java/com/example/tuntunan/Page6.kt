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
        val artiSakitText = """
            Sholat saat sakit adalah kewajiban bagi setiap muslim, yang tetap harus dilaksanakan sesuai kemampuan meskipun dengan penyesuaian tertentu. Ini merupakan bagian dari menjaga agama (hifz al-din) dalam Islam. Namun, jika kondisi sangat parah atau melaksanakan sholat akan memperburuk kondisi, ada pengecualian di mana sholat dapat digantikan dengan cara yang sesuai. Meskipun demikian, sholat tetap merupakan kewajiban yang penting yang harus diutamakan.
            """.trimIndent()
        artiSakitContent.text = artiSakitText

        // Section: Tata Cara
        val tataSakitTitle = findViewById<TextView>(R.id.tataSakitTitle)
        val tataSakitContent = findViewById<TextView>(R.id.tataSakitContent)
        tataSakitTitle.setOnClickListener {
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

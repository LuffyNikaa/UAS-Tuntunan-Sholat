package com.example.tuntunan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
        val artiTayamumText = """
            Tayammum ialah mengusap muka dan dua belah tangan dengan debu yang suci. Pada suatu ketika tayammum itu dapat menggantikan wudlu dan mandi dengan syarat-syarat tertentu.
        """.trimIndent()
        artiTayamumContent.text = artiTayamumText

        // Fardhu Tayamum Section
        val fardhuTayamumTitle = findViewById<TextView>(R.id.fardhuTayamumTitle)
        val fardhuTayamumContent = findViewById<TextView>(R.id.fardhuTayamumContent)
        fardhuTayamumTitle.setOnClickListener {
            toggleVisibility(fardhuTayamumContent)
        }
        val fardhuTayamumText = """
            1. Niat
            2. Mengusap wajah dengan debu dengan dua kali usapan
            3. Mengusap kedua tangan sampai siku dengan dua kali usapan
            4. Memindahkan debu kepada anggota yang diusap
            5. Tertib, artinya dilakukan secara berurutan
            """.trimIndent()
        fardhuTayamumContent.text = fardhuTayamumText

        // Sunnah Tayamum Section
        val sunnahTayamumTitle = findViewById<TextView>(R.id.sunnahTayamumTitle)
        val sunnahTayamumContent = findViewById<TextView>(R.id.sunnahTayamumContent)
        sunnahTayamumTitle.setOnClickListener {
            toggleVisibility(sunnahTayamumContent)
        }
        val sunnahTayamumText = """
            Sunnah sebelum dan selama tayammum:

            1. Membaca basmalah
            2. Mendahuluan anggota tubuh bagian kanan sebelum kiri
            3. Menipiskan debu
            """.trimIndent()
        sunnahTayamumContent.text = sunnahTayamumText

        // Syarat Tayamum Section
        val syaratTayamumTitle = findViewById<TextView>(R.id.syaratTayamumTitle)
        val syaratTayamumContent = findViewById<TextView>(R.id.syaratTayamumContent)
        syaratTayamumTitle.setOnClickListener {
            toggleVisibility(syaratTayamumContent)
        }
        val syaratTayamumText = """
            Syarat diperbolehkannya melakukan tayammum sebagai pengganti wudhu ialah:

            1. Tidak tersedia air suci walau telah berusaha mencarinya 
            2. Tidak diperbolehkan terkena air karena suatu hal misalnya sakit yang apabila terkena air dapat membuat sakitnya kambuh
            3. Telah masuk waktu shalat
            4. Tayammum dengan debu yang suci
            """.trimIndent()
        syaratTayamumContent.text = syaratTayamumText

        // Tata Cara Tayamum Section
        val tataTayamumTitle = findViewById<TextView>(R.id.tataTayamumTitle)
        tataTayamumTitle.setOnClickListener {
            openPdf("page_tayammum.pdf")
        }

        // Yang Membatalkan Tayamum Section
        val batalTayamumTitle = findViewById<TextView>(R.id.batalTayamumTitle)
        val batalTayamumContent = findViewById<TextView>(R.id.batalTayamumContent)
        batalTayamumTitle.setOnClickListener {
            toggleVisibility(batalTayamumContent)
        }
        val batalTayamumText = """
            Adapun hal-hal yang membatalkan tayammum antara lain:

            1. Segala hal yang membatalkan wudhu
            2. Melihat/menemukan air suci sebelum shalat
            3. Murtad, keluar dari islam
            """.trimIndent()
        batalTayamumContent.text = batalTayamumText

        // Niat Tayamum Section
        val niatTayamumTitle = findViewById<TextView>(R.id.niatTayamumTitle)
        val niatTayamumContent = findViewById<TextView>(R.id.niatTayamumContent)
        niatTayamumTitle.setOnClickListener {
            toggleVisibility(niatTayamumContent)
        }
        val niatTayamumText = """
            نويت التيمم لاستباحَةِ الصَّلَاةِ لله تَعَالَى

            Nawaytu tayammuma li istibaakhati sholati lillahi ta'ala

            Artinya:
            Aku berniat tayamum agar diperbolehkan sholat karena Allah.
            """.trimIndent()
        niatTayamumContent.text = niatTayamumText

        // Keterangan Tayamum Section
        val ketTayamumTitle = findViewById<TextView>(R.id.ketTayamumTitle)
        val ketTayamumContent = findViewById<TextView>(R.id.ketTayamumContent)
        ketTayamumTitle.setOnClickListener {
            toggleVisibility(ketTayamumContent)
        }
        val ketTayamumText = """
            Sekali bertayammum hanya dapat digunakan untuk satu shalat fardlu saja, meskipun tayammum belum batal. Adapun untuk shalat sunnah beberapa kali cukup dengan satu tayammum asalkan belum batal.
            """.trimIndent()
        ketTayamumContent.text = ketTayamumText
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

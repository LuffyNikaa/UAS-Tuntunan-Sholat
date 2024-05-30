package com.example.tuntunan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
        val artiWudhuText = """
            Wudhu menurut bahasa artinya bersih dan indah. Orang yang hendak melaksanakan sholat, wajib terlebih dahulu untuk berwudhu, karena wudhu merupakan syarat sahnya sholat yang betujuan untuk menghilangkan hadas kecil.
        """.trimIndent()
        artiWudhuContent.text = artiWudhuText

        // Fardhu Wudhu Section
        val fardhuWudhuTitle = findViewById<TextView>(R.id.fardhuWudhuTitle)
        val fardhuWudhuContent = findViewById<TextView>(R.id.fardhuWudhuContent)
        fardhuWudhuTitle.setOnClickListener {
            toggleVisibility(fardhuWudhuContent)
        }
        val fardhuWudhuText = """
            Adapun hal fardhu wudhu antara lain:

            1. Niat.
            2. Mencuci wajah.
            3. Mencuci kedua tangan hingga siku.
            4. Mengusap sebagian kepala.
            5. Mencuci kedua kaki hingga mata kaki.
            6. Melakukan langkah tersebut secara berurutan dan tanpa jeda.
        """.trimIndent()
        fardhuWudhuContent.text = fardhuWudhuText

        // Sunnah Wudhu Section
        val sunnahWudhuTitle = findViewById<TextView>(R.id.sunnahWudhuTitle)
        val sunnahWudhuContent = findViewById<TextView>(R.id.sunnahWudhuContent)
        sunnahWudhuTitle.setOnClickListener {
            toggleVisibility(sunnahWudhuContent)
        }
        val sunnahWudhuText = """
            Adapun hal sunnah wudhu antara lain:
            
            1. Membaca basmalah sebelum berwudhu.
            2. Membasuh tangan sebelum berwudhu.
            3. Berkumur-kumur.
            4. Membasuh lubang hidung sebelum berniat.
            5. Menyapu seluruh kepala dengan air.
            6. Mendahulukan anggota tubuh kanan sebelum kiri.
            7. Menyapu kedua telinga luar dan dalam.
            8. Melakukan basuhan sebanyak 3 kali.
            9. Menyela-nyela jari tangan dan kaki.
            10. Membaca do'a sesudah wudhu. 
        """.trimIndent()
        sunnahWudhuContent.text = sunnahWudhuText

        // Syarat Wudhu Section
        val syaratWudhuTitle = findViewById<TextView>(R.id.syaratWudhuTitle)
        val syaratWudhuContent = findViewById<TextView>(R.id.syaratWudhuContent)
        syaratWudhuTitle.setOnClickListener {
            toggleVisibility(syaratWudhuContent)
        }
        val syaratWudhuText = """
            Adapun hal syarat wudhu antara lain:

            1. Beragama Islam.
            2. Tamyiz, yakni dapat membedakan baik dan buruknya sesuatu.
            3. Tidak berhadast besar.
            4. Wudhu dengan air suci yang mensucikan.
            5. Tidak ada sesuatu yang menghalangi air sampai ke anggota badan misal cat.
            6. getah dan sebagainya.
            7. Mengetahui mana yang wajib dan mana sunnah.
        """.trimIndent()
        syaratWudhuContent.text = syaratWudhuText

        // Tata Cara Wudhu Section
        val tataWudhuTitle = findViewById<TextView>(R.id.tataWudhuTitle)
        tataWudhuTitle.setOnClickListener {
            openPdf("page_wudhu.pdf")
        }

        // Yang Membatalkan Wudhu Section
        val batalWudhuTitle = findViewById<TextView>(R.id.batalWudhuTitle)
        val batalWudhuContent = findViewById<TextView>(R.id.batalWudhuContent)
        batalWudhuTitle.setOnClickListener {
            toggleVisibility(batalWudhuContent)
        }
        val batalWudhuText = """
            Adapun hal-hal yang dapat membatalkan wudhu antara lain:

            1. Keluar sesuatu dari qubul dan dubur, misal buang air kecil atau besar atau keluar angin dan sebagainya.
            2. Hilang akal sebab gila, pingsan, mabuk, tidur nyenyak.
            3. Tersentuh kulit antara laki dan perempuan yang bukan muhrimnya.
            4. Tersentuh kemaluan dengan tapak tangan tanpa penutup.
        """.trimIndent()
        batalWudhuContent.text = batalWudhuText

        // Niat Wudhu Section
        val niatWudhuTitle = findViewById<TextView>(R.id.niatWudhuTitle)
        val niatWudhuContent = findViewById<TextView>(R.id.niatWudhuContent)
        niatWudhuTitle.setOnClickListener {
            toggleVisibility(niatWudhuContent)
        }
        val niatWudhuText = """
            نَوَيْتُ الْوُضُوءَ لِرَفْعِ الْحَدَثِ الْأَصْغَرِ فَرَضَا لِلَّهِ تَعَالَى
            
            Nawaitul wudhuu-a liraf'ill hadatsil ashghari fardhal lilaahi ta'aalaa
            
            Artinya:
            Saya niat berwudhu untuk menghilangkan hadats kecil fardu karena Allah.
        """.trimIndent()
        niatWudhuContent.text = niatWudhuText

        // Doa Wudhu Section
        val doaWudhuTitle = findViewById<TextView>(R.id.doaWudhuTitle)
        val doaWudhuContent = findViewById<TextView>(R.id.doaWudhuContent)
        doaWudhuTitle.setOnClickListener {
            toggleVisibility(doaWudhuContent)
        }
        val doaWudhuText = """            
أشهد أن لا إله إلا الله وحده لا شريك له، وأشهد أن محمداً عَبْدُهُ وَرَسُولُهُ اللَّهُمَّ اجعلني من التوابين واجْعَلْنِي مِنَ الْمُتَطَهِّرِين           

Asy-hadu an laa ilaaha illallaah wahdahu laa syariika lahu, wa asy-hadu anna muhammadan 'abduhu wa rasuuluhu, allaahummaj'alnii minat tawwaabiin, waj'alnii minal mutathahhiriin.

Artinya:
Aku bersaksi bahwa tiada Tuhan selain Allah, Yang Mahaesa, tiada sekutu bagi-Nya. Dan aku bersaksi bahwa Muhammad adalah hamba dan rasul-Nya. Ya Allah, jadikanlah aku termasuk golongan yang bertobat dan jadikanlah aku termasuk golongan yang menyucikan diri.
        """.trimIndent()
        doaWudhuContent.text = doaWudhuText
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

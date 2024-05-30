package com.example.tuntunan

import android.graphics.Bitmap
import android.graphics.pdf.PdfRenderer
import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream

class PdfActivity : AppCompatActivity() {

    private var pdfRenderer: PdfRenderer? = null
    private lateinit var pdfFileName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Tata Cara"

        // Get PDF file name from intent
        pdfFileName = intent.getStringExtra("pdfFileName") ?: ""

        // Copy PDF file from raw resource to internal storage
        val pdfFile = copyPdfFromRawToInternal(pdfFileName)

        // Set up PDF renderer
        val fileDescriptor = ParcelFileDescriptor.open(pdfFile, ParcelFileDescriptor.MODE_READ_ONLY)
        pdfRenderer = PdfRenderer(fileDescriptor)

        // Display all pages
        displayAllPages()
    }

    private fun copyPdfFromRawToInternal(fileName: String): File {
        val inputStream: InputStream = resources.openRawResource(
            resources.getIdentifier(fileName.removeSuffix(".pdf"), "raw", packageName)
        )
        val outputFile = File(filesDir, fileName)
        try {
            val outputStream = FileOutputStream(outputFile)
            val buffer = ByteArray(1024)
            var length: Int
            while (inputStream.read(buffer).also { length = it } > 0) {
                outputStream.write(buffer, 0, length)
            }
            outputStream.close()
            inputStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return outputFile
    }

    private fun displayAllPages() {
        val pdfContainer = findViewById<LinearLayout>(R.id.pdfContainer)
        val pageCount = pdfRenderer?.pageCount ?: 0

        for (i in 0 until pageCount) {
            val page = pdfRenderer!!.openPage(i)
            val bitmap = Bitmap.createBitmap(page.width, page.height, Bitmap.Config.ARGB_8888)
            page.render(bitmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
            page.close()

            val imageView = ImageView(this)
            imageView.setImageBitmap(bitmap)
            imageView.adjustViewBounds = true
            pdfContainer.addView(imageView)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    override fun onDestroy() {
        super.onDestroy()
        pdfRenderer?.close()
    }
}

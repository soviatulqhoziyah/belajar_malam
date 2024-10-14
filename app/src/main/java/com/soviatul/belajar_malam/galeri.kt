package com.soviatul.belajar_malam

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.soviatul.belajar_malam.adapter.adaptergambar

class galeri : AppCompatActivity() {
    private val imagelist = arrayOf(
        R.drawable.ti,
        R.drawable.bing,
        R.drawable.mesin,
        R.drawable.sipil,
        R.drawable.elektro,
        R.drawable.sipil,
        R.drawable.akutansi

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)

        val gridView = findViewById<GridView>(R.id.gambar)
        val adapter = adaptergambar(this, imagelist)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, detail_gambar::class.java)
            intent.putExtra("data", imagelist[position])
            startActivity(intent)
        }


    }
}
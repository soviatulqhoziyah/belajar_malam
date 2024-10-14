package com.soviatul.belajar_malam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnmi : Button
    private lateinit var btntk : Button
    private lateinit var btnglr : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnmi=findViewById(R.id.btnmi)
        btntk=findViewById(R.id.btntk)
        btnglr=findViewById(R.id.btnglr)

        btnmi.setOnClickListener {
            intent= Intent(this,Manajemen_Informatika::class.java)
            startActivity(intent)
        }
        btntk.setOnClickListener {
            intent= Intent(this,teknik_informatika::class.java)
            startActivity(intent)
        }
        btnglr.setOnClickListener {
            intent= Intent(this,galeri::class.java)
            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
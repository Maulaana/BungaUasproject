package com.zakii.maulanaaplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBungaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_bunga)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val Bunga = intent.getParcelableExtra<Bunga>(MainActivity.INTENT_PARCELABLE)
        val imgBunga = findViewById<ImageView>(R.id.img_item_photo)
        val nameBunga = findViewById<TextView>(R.id.tv_item_name)
        val descBunga = findViewById<TextView>(R.id.tv_item_description)

        imgBunga.setImageResource(Bunga?.imgBunga!!)
        nameBunga.text = Bunga.nameBunga
        descBunga.text = Bunga.descBunga

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
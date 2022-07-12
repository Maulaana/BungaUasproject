package com.zakii.ahmadzakiaplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailSuperheroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val Superhero = intent.getParcelableExtra<Superhero>(MainActivity.INTENT_PARCELABLE)
        val imgSuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = findViewById<TextView>(R.id.tv_item_description)

        imgSuperhero.setImageResource(Superhero?.imgSuperhero!!)
        nameSuperhero.text = Superhero.nameSuperhero
        descSuperhero.text = Superhero.descSuperhero

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
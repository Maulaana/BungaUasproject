package com.zakii.ahmadzakiaplikasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroolist = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
            "antman",
            "antman adalah superhero yang memiliki kekutan bisa mengecil"
            ),
            Superhero(
                R.drawable.superman,
                "superman",
            "superman adalah superhero yang memiliki kekuatan bisa terbang,tenaga kuat,dan matanya bisa mengrluarkan laser"
            ),
            Superhero(
                R.drawable.spiderman,
                "spiderman",
                "spiderman adalah manusia laba-laba yang mengeluarkan jaring ditangannya"
            ),
            Superhero(
                R.drawable.ironman,
                "ironman",
                "ironman adalah superhero yang memiliki teknologi canggih"
            ),
            Superhero(
                R.drawable.blackpanter,
                "blackpanther",
                "memiliki bahan baju dari vibrenium "
            ),
            Superhero(
                R.drawable.doctorstrange,
                "docterstrange",
                "Doctor Strange mampu memanipulasi ilmu sihir menjadi bentuk sebuah energi kasat mata yang dapat dia gunakan sebagai senjata ataupun tameng pelindung"
            ),
            Superhero(
                R.drawable.captenamerika,
                "captenamerika",
                "Kekuatan fisik, daya tahan fisik, stamina, kecepatan, kelincahan, refleks, dan bahkan ketajaman indra Steve semuanya meningkat. Tubuh Steve juga mampu sembuh dari cedera lebih cepat dari manusia biasa. Untuk senjata, awamnya Steve Rogers bertarung dengan tameng vibranium yang sulit sekali dihancurkan"
            ),
            Superhero(
                R.drawable.thor,
                "thor",
                "Thor sang Dewa Petir adalah salah satu karakter Avengers terkuat dan salah satu karakter yang punya kekuatan besar di MCU"
            ),
            Superhero(
                R.drawable.hulk,
                "hulk",
                "Kekuatan utama yang dimiliki Hulk adalah kekuatan supernya yang luar biasa. Kekuatan Hulk akan semakin meningkat dengan kemarahannya. Jadi apabila Hulk semakin marah, maka kekuatannya menjadi semakin besar dan bertambah kuat."
            ),

            )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = SuperherooAdapter(this,superheroolist){
                val intent = Intent(this,DetailSuperheroActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)


            }


    }
}
package com.zakii.maulanaaplikasi

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

        val bungalist = listOf<Bunga>(
            Bunga(
                R.drawable.bungabonsai,
            "bungabonsai",
            "Bonsai atau yang sering dikenal sebagai bunga bonsai dan tanaman hias bonsai merupakan sebuah tanaman atau pohon yang dikerdilkan dan biasanya diletakkan pada sebuah pot."
            ),
            Bunga(
                R.drawable.bungaedelwis,
                "bungaedelwis",
            "Bunga Edelweis atau bernama latin Anaphalis javanica merupakan satu tumbuhan yang kerap ditemukan di daerah pegunungan."
            ),
            Bunga(
                R.drawable.bungalily,
                "bungalily",
                "Warna putih pada umumnya memiliki arti suci dan bersih, seperti itu jugalah makna yang terkandung dalam bunga lily putih"
            ),
            Bunga(
                R.drawable.bungakantil,
                "bungakantil",
                "Kantil atau cempaka putih merupakan tumbuhan yang memiliki bunga berwarna putih dan harum khas"
            ),
            Bunga(
                R.drawable.bungamatahari,
                "bungamatahari",
                "Bunga matahari adalah tanaman dengan genus Helianthus "
            ),
            Bunga(
                R.drawable.bungamawar,
                "bungamawar",
                "Mawar adalah suatu jenis tanaman semak dari genus Rosa sekaligus nama bunga yang dihasilkan tanaman ini."
            ),
            Bunga(
                R.drawable.bungamelati,
                "bungamelati",
                "Melati merupakan tanaman bunga hias berupa perdu berbatang tegak yang hidup menahun. Melati merupakan genus dari semak dan tanaman merambat dalam keluarga zaitun"
            ),
            Bunga(
                R.drawable.bungasakura,
                "bungasakura",
                "Sakura bersama dengan bunga seruni adalah bunga nasional Jepang yang mekar pada musim semi, yaitu sekitar akhir Maret hingga akhir Juni"
            ),
            Bunga(
                R.drawable.bungasepatu,
                "bungasepatu",
                "Kembang sepatu adalah tanaman semak suku Malvaceae yang berasal dari Asia Timur dan banyak ditanam sebagai tanaman hias di daerah tropis dan subtropis."
            ),

            )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_bunga)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = BungaAdapter(this,bungalist){
                val intent = Intent(this,DetailBungaActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)


            }


    }
}
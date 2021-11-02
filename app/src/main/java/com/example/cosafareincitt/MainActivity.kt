package com.example.cosafareincitt

import android.content.Intent
import android.os.Bundle
import android.widget.Button


class MainActivity : GenericPage() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //APRI UNA PAGINA DI UN POSTO CASUALE
        val button2 = findViewById<Button>(R.id.button2)
        generatelistOfRandomPage(num_page)
        openRandomPage(activityList, button2, this)


        //APRI I LUOGHI CONSIGLIATI
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent3 = Intent(this, luoghiConsigliati::class.java)
            startActivity(intent3)
        }

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent1 = Intent(this, MapsActivity::class.java)
            startActivity(intent1)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent4 = Intent(this, listaLuoghi::class.java)
            startActivity(intent4)
        }
    }
}

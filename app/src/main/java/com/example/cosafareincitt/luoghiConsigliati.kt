package com.example.cosafareincitt
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class luoghiConsigliati : GenericPage() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luoghi_consigliati)
        setActionBar()
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent1 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina52")))
            startActivity(intent1)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent2 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina9")))
            startActivity(intent2)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent3 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina42")))
            startActivity(intent3)
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent4 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina53")))
            startActivity(intent4)
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent5 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina54")))
            startActivity(intent5)
        }
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent6 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina51")))
            startActivity(intent6)
        }
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent7 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina55")))
            startActivity(intent7)
        }
        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            val intent8 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina56")))
            startActivity(intent8)
        }
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val intent9 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina58")))
            startActivity(intent9)
        }
        val button10 = findViewById<Button>(R.id.button10)
        button10.setOnClickListener {
            val intent10 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina57")))
            startActivity(intent10)
        }
    }
}

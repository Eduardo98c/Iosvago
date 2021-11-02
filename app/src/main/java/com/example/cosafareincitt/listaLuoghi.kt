package com.example.cosafareincitt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class listaLuoghi : GenericPage() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_luoghi)
        setActionBar()


        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent1 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina13")))
            startActivity(intent1)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent2 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina28")))
            startActivity(intent2)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent3 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina57")))
            startActivity(intent3)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent4 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina5")))
            startActivity(intent4)
        }

        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent5 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina45")))
            startActivity(intent5)
        }

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent6 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina46")))
            startActivity(intent6)
        }

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent7 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina23")))
            startActivity(intent7)
        }

        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            val intent8 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina11")))
            startActivity(intent8)
        }

        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val intent9 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina19")))
            startActivity(intent9)
        }

        val button10 = findViewById<Button>(R.id.button10)
        button10.setOnClickListener {
            val intent10 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina47")))
            startActivity(intent10)
        }

        val button11 = findViewById<Button>(R.id.button11)
        button11.setOnClickListener {
            val intent11 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina9")))
            startActivity(intent11)
        }

        val button12 = findViewById<Button>(R.id.button12)
        button12.setOnClickListener {
            val intent12 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina58")))
            startActivity(intent12)
        }
        val button13 = findViewById<Button>(R.id.button13)
        button13.setOnClickListener {
            val intent13 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina30")))
            startActivity(intent13)
        }

        val button14 = findViewById<Button>(R.id.button14)
        button14.setOnClickListener {
            val intent14 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina7")))
            startActivity(intent14)
        }
        val button15 = findViewById<Button>(R.id.button15)
        button15.setOnClickListener {
            val intent15 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina39")))
            startActivity(intent15)
        }

        val button16 = findViewById<Button>(R.id.button16)
        button16.setOnClickListener {
            val intent16 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina17")))
            startActivity(intent16)
        }
        val button17 = findViewById<Button>(R.id.button17)
        button17.setOnClickListener {
            val intent17 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina21")))
            startActivity(intent17)
        }

        val button18 = findViewById<Button>(R.id.button18)
        button18.setOnClickListener {
            val intent18 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina36")))
            startActivity(intent18)
        }

        val button19 = findViewById<Button>(R.id.button19)
        button19.setOnClickListener {
            val intent19 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina29")))
            startActivity(intent19)
        }
        val button20 = findViewById<Button>(R.id.button20)
        button20.setOnClickListener {
            val intent20 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina40")))
            startActivity(intent20)
        }
        val button21 = findViewById<Button>(R.id.button21)
        button21.setOnClickListener {
            val intent21 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina24")))
            startActivity(intent21)
        }
        val button22 = findViewById<Button>(R.id.button22)
        button22.setOnClickListener {
            val intent22 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina15")))
            startActivity(intent22)
        }
        val button23 = findViewById<Button>(R.id.button23)
        button23.setOnClickListener {
            val intent23 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina44")))
            startActivity(intent23)
        }
        val button24 = findViewById<Button>(R.id.button24)
        button24.setOnClickListener {
            val intent24 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina22")))
            startActivity(intent24)
        }
        val button25 = findViewById<Button>(R.id.button25)
        button25.setOnClickListener {
            val intent25 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina34")))
            startActivity(intent25)
        }
        val button26 = findViewById<Button>(R.id.button26)
        button26.setOnClickListener {
            val intent26 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina20")))
            startActivity(intent26)
        }
        val button27 = findViewById<Button>(R.id.button27)
        button27.setOnClickListener {
            val intent27 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina10")))
            startActivity(intent27)
        }
        val button28 = findViewById<Button>(R.id.button28)
        button28.setOnClickListener {
            val intent28 = Intent(this, (Class.forName("com.example.cosafareincitt.pagin42")))
            startActivity(intent28)
        }
        val button29 = findViewById<Button>(R.id.button29)
        button29.setOnClickListener {
            val intent29 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina35")))
            startActivity(intent29)
        }
        val button30 = findViewById<Button>(R.id.button30)
        button30.setOnClickListener {
            val intent30 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina51")))
            startActivity(intent30)
        }
        val button31 = findViewById<Button>(R.id.button31)
        button31.setOnClickListener {
            val intent31 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina27")))
            startActivity(intent31)
        }
        val button32 = findViewById<Button>(R.id.button32)
        button32.setOnClickListener {
            val intent32 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina4")))
            startActivity(intent32)
        }
        val button33 = findViewById<Button>(R.id.button33)
        button33.setOnClickListener {
            val intent33 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina1")))
            startActivity(intent33)
        }
        val button34 = findViewById<Button>(R.id.button34)
        button34.setOnClickListener {
            val intent34 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina25")))
            startActivity(intent34)
        }

        val button35 = findViewById<Button>(R.id.button35)
        button35.setOnClickListener {
            val intent35 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina2")))
            startActivity(intent35)
        }
        val button36 = findViewById<Button>(R.id.button36)
        button36.setOnClickListener {
            val intent36 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina54")))
            startActivity(intent36)
        }
        val button37 = findViewById<Button>(R.id.button37)
        button37.setOnClickListener {
            val intent37 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina3")))
            startActivity(intent37)
        }
        val button38 = findViewById<Button>(R.id.button38)
        button38.setOnClickListener {
            val intent38 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina49")))
            startActivity(intent38)
        }
        val button39 = findViewById<Button>(R.id.button39)
        button39.setOnClickListener {
            val intent39 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina52")))
            startActivity(intent39)
        }
        val button40 = findViewById<Button>(R.id.button40)
        button40.setOnClickListener {
            val intent40 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina50")))
            startActivity(intent40)
        }
        val button41 = findViewById<Button>(R.id.button41)
        button41.setOnClickListener {
            val intent41 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina18")))
            startActivity(intent41)
        }
        val button42 = findViewById<Button>(R.id.button42)
        button42.setOnClickListener {
            val intent42 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina48")))
            startActivity(intent42)
        }
        val button43 = findViewById<Button>(R.id.button43)
        button43.setOnClickListener {
            val intent43 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina37")))
            startActivity(intent43)
        }

        val button44 = findViewById<Button>(R.id.button44)
        button44.setOnClickListener {
            val intent44 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina41")))
            startActivity(intent44)
        }
        val button45 = findViewById<Button>(R.id.button45)
        button45.setOnClickListener {
            val intent45 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina8")))
            startActivity(intent45)
        }
        val button46 = findViewById<Button>(R.id.button46)
        button46.setOnClickListener {
            val intent46 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina26")))
            startActivity(intent46)
        }
        val button47 = findViewById<Button>(R.id.button47)
        button47.setOnClickListener {
            val intent47 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina43")))
            startActivity(intent47)
        }
        val button48 = findViewById<Button>(R.id.button48)
        button48.setOnClickListener {
            val intent48 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina55")))
            startActivity(intent48)
        }
        val button49 = findViewById<Button>(R.id.button49)
        button49.setOnClickListener {
            val intent49 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina31")))
            startActivity(intent49)
        }
        val button50 = findViewById<Button>(R.id.button50)
        button50.setOnClickListener {
            val intent50 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina56")))
            startActivity(intent50)
        }
        val button51 = findViewById<Button>(R.id.button51)
        button51.setOnClickListener {
            val intent51 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina38")))
            startActivity(intent51)
        }
        val button52 = findViewById<Button>(R.id.button52)
        button52.setOnClickListener {
            val intent52 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina12")))
            startActivity(intent52)
        }
        val button53 = findViewById<Button>(R.id.button53)
        button53.setOnClickListener {
            val intent53 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina33")))
            startActivity(intent53)
        }
        val button54 = findViewById<Button>(R.id.button54)
        button54.setOnClickListener {
            val intent54 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina6")))
            startActivity(intent54)
        }
        val button55 = findViewById<Button>(R.id.button55)
        button55.setOnClickListener {
            val intent55 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina16")))
            startActivity(intent55)
        }
        val button56 = findViewById<Button>(R.id.button56)
        button56.setOnClickListener {
            val intent56 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina53")))
            startActivity(intent56)
        }
        val button57 = findViewById<Button>(R.id.button57)
        button57.setOnClickListener {
            val intent57 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina32")))
            startActivity(intent57)
        }
        val button58 = findViewById<Button>(R.id.button58)
        button58.setOnClickListener {
            val intent58 = Intent(this, (Class.forName("com.example.cosafareincitt.pagina14")))
            startActivity(intent58)
        }
    }
}
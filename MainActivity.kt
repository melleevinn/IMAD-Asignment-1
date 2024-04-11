package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declaring
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResults)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 0..12 -> "1"
                    in 13..19 -> "2"
                    in 20..29 -> "3"
                    in 30..39 -> "4"
                    in 40..49 -> "5"
                    in 50..59 -> "6"
                    in 60..69 -> "7"
                    in 70..79 -> "8"
                    in 80..89 -> "9"
                    in 90..100 -> "10"
                    else -> "Senior"
                }
                txtResult.text = "age: $age\n${
                    when (result) {
                        "1" -> "Hector Pieterson (1963-1976) a symbol of the Soweto uprising agaisnt Apartheid policies died at 12 "
                        "2" -> "N'Krumah Mangenela (1963-1976) a child soldier in the Democratic republic of congo during the Congo civil war died at 14"
                        "3" -> " solomon mahlangu (1956-1979) a stuggle hero in the anti Apartheid movment died at 23"
                        "4" -> "steve biko (1946-1977) a prominent anti-Apartheid activist and found of the black consciousness movement died at 30"
                        "5" -> " (amilcar cabral (1924-1973) a Guinea-Bissauan and Cape Verdean anti-Colonial revelutionary leader an intellectual died at 48)"
                        "6" -> "chris hani a leader in the ANC and a key figure in the struggle against Apartheid die at 50"
                        "7" -> " Kwame Nkrumah (1909-1972) the first president of Ghana and a key figure in the pan-African movement"
                        "8" -> "Oliver Tambo (1917-1993) a promnent ANC leader and anti-Aparteid activist died at 75"
                        "9" -> "Filix Houphouet-Boigny (1905-1993) the first president of Cote D'Ivoire died at 88"
                        "10" -> "albertina Sisulu a prominet anti-Apartheid activist and politician died at 92"
                        else -> "please enter a valid age"
                    }
                }"
            } else {
                {
                    txtResult.text = "please enter a valid age"
                }
            }
            btnCancel.setOnClickListener {
                ageNumber.text.clear()
                txtResult.text = ""
            }
        }
    }
}
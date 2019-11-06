package com.dionnecondorfarrell.mydicerrollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener { rollDice() }

        val countUp: Button = findViewById(R.id.count_up)

        countUp.setOnClickListener { countUp() }

    }

    private fun rollDice() {

        val resultText: TextView = findViewById(R.id.result_text)

        val randomNumber = Random.nextInt(6) + 1

        resultText.text = randomNumber.toString()
        Toast.makeText(this,"Dice Rolled", Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {

        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text.toString() == "Hello World!") {
            resultText.text = "1"
        } else {
            var resultInt: Int = resultText.text.toString().toInt()

            if(resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }

        }
    }
}

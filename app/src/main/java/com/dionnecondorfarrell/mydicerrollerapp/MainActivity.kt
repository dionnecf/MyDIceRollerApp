package com.dionnecondorfarrell.mydicerrollerapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener { rollDice() }

        //val countUp: Button = findViewById(R.id.count_up)
        //countUp.setOnClickListener { countUp() }

        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener {

            diceImage.setImageResource(R.drawable.empty_dice)
            diceImage2.setImageResource(R.drawable.empty_dice)
        }
    }

    private fun rollDice(){

        diceImage.setImageResource(randomDiceImage())
        diceImage2.setImageResource(randomDiceImage())
    }

    private fun randomDiceImage() : Int {

        val randomNumber = Random.nextInt(6) + 1
        return when(randomNumber) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    /*private fun countUp() {

        //val resultText: TextView = findViewById(R.id.result_text)

       *//* if (resultText.text.toString() == "Hello World!") {
            resultText.text = "1"
        } else {
            var resultInt: Int = resultText.text.toString().toInt()

            if(resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }

        }*//*
    }*/
}

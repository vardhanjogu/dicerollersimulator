package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dicerollersimulator.R
import kotlin.random.Random



class MainActivity : AppCompatActivity() {



    private lateinit var diceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        diceImage = findViewById(R.id.diceImage)

        val rollButton: Button = findViewById(R.id.rollButton)
        val move : TextView = findViewById(R.id.spin1)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        //  val randomInt = Random.Default.nextInt(6) + 1
        //   val randomInt = Random.Default?.nextInt(6) + 1 ?: 1
        val randomInt = Random.nextInt(6) + 1



        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

    }
}
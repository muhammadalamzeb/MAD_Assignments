package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random
var randomInt = Random.nextInt(0,100)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.button)
        val buttonSHow: Button= findViewById(R.id.button2)


        buttonSHow.setOnClickListener {
            // Code to be executed when the button is clicked
            setContentView(R.layout.assignmnet2)
            val hatCheckBox = findViewById<CheckBox>(R.id.hatcheckBox4)
            val eyesBrowsCheckBox = findViewById<CheckBox>(R.id.eyebrowscheckBox5)
            val eyesCheckBox = findViewById<CheckBox>(R.id.eyescheckBox9)
            val noseCheckBox = findViewById<CheckBox>(R.id.nosecheckBox6)
            val mustacheCheckBox = findViewById<CheckBox>(R.id.mustachecheckBox7)
            val armsCheckBox = findViewById<CheckBox>(R.id.armscheckBox8)
            val shoesCheckBox = findViewById<CheckBox>(R.id.shoescheckBox13)
            val mouthCheckBox = findViewById<CheckBox>(R.id.mouthcheckBox11)
            val glassCheckBox = findViewById<CheckBox>(R.id.GlassescheckBox10)
            val earCheckBox = findViewById<CheckBox>(R.id.earscheckBox12)
             hatCheckBox.isChecked = true
             eyesBrowsCheckBox.isChecked = true
            eyesCheckBox.isChecked= true
            noseCheckBox.isChecked = true
            mustacheCheckBox.isChecked = true
           armsCheckBox.isChecked = true
            shoesCheckBox.isChecked = true
            mouthCheckBox.isChecked = true
            glassCheckBox.isChecked = true
            earCheckBox.isChecked = true

            hatCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val hat = findViewById<ImageView>(R.id.hats)
                if (isChecked) {
                    hat.visibility = View.VISIBLE
                } else {
                    hat.visibility = View.GONE
                }
            }
            noseCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val nose = findViewById<ImageView>(R.id.nose)
                if (isChecked) {
                    nose.visibility = View.VISIBLE
                } else {
                    nose.visibility = View.GONE
                }
            }
            eyesCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val eyes = findViewById<ImageView>(R.id.eyes)
                if (isChecked) {
                    eyes.visibility = View.VISIBLE
                } else {
                    eyes.visibility = View.GONE
                }
            }
            eyesBrowsCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val eyebrow = findViewById<ImageView>(R.id.eyebrows)
                if (isChecked) {
                    eyebrow.visibility = View.VISIBLE
                } else {
                    eyebrow.visibility = View.GONE
                }
            }
            glassCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val glasses = findViewById<ImageView>(R.id.glasses)
                if (isChecked) {
                    glasses.visibility = View.VISIBLE
                } else {
                    glasses.visibility = View.GONE
                }
            }
            mouthCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val mouth = findViewById<ImageView>(R.id.mouth)
                if (isChecked) {
                    mouth.visibility = View.VISIBLE
                } else {
                    mouth.visibility = View.GONE
                }
            }
            mustacheCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val mustache = findViewById<ImageView>(R.id.mustache)
                if (isChecked) {
                    mustache.visibility = View.VISIBLE
                } else {
                    mustache.visibility = View.GONE
                }
            }
            earCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val ears = findViewById<ImageView>(R.id.ears)
                if (isChecked) {
                    ears.visibility = View.VISIBLE
                } else {
                    ears.visibility = View.GONE
                }
            }
            armsCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val arm = findViewById<ImageView>(R.id.hands)
                if (isChecked) {
                    arm.visibility = View.VISIBLE
                } else {
                    arm.visibility = View.GONE
                }
            }
            shoesCheckBox.setOnCheckedChangeListener { _, isChecked ->
                val shoe = findViewById<ImageView>(R.id.shoes)
                if (isChecked) {
                    shoe.visibility = View.VISIBLE
                } else {
                    shoe.visibility = View.GONE
                }
            }


        }
        myButton.setOnClickListener {
            // Code to be executed when the button is clicked

            Validate()
        }


    }

    fun Validate(){
        val inputText : EditText = findViewById(R.id.Text)
        val editText =findViewById<TextView>(R.id.TextVeiw)
        val input= Integer.parseInt(inputText.text.toString())

        if (input > randomInt){
            editText.text="your guess i Too HIgh $randomInt"

        }
        else if (input < randomInt)
            editText.text="your guess i  Low $randomInt"
        else{
            editText.text="ohh Hurrah U guessed it correctly Now Number is Changed"
            randomInt = Random.nextInt()
        }

    }
}

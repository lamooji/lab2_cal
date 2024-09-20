package com.cs407.calculator

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val editFirstText = findViewById<EditText>(R.id.myFirstTextField)
        val editSecondText = findViewById<EditText>(R.id.mySecondTextField)
        val addButton = findViewById<Button>(R.id.addButton)
        val subButton = findViewById<Button>(R.id.subButton)
        val multiButton = findViewById<Button>(R.id.multiButton)
        val divideButton = findViewById<Button>(R.id.divideButton)

        addButton.setOnClickListener {

            try {
                val userFirstInput = editFirstText.text.toString().toInt()
                val userSecondInput = editSecondText.text.toString().toInt()
                //Toast.makeText(this, userInput, Toast.LENGTH_SHORT).show()

                //Log.i("INFO","Add Button Click!")

                val addResult = userFirstInput + userSecondInput

                // Create an intent to navigate to CalculatorActivity
                val intent = Intent(this, CalculatorActivity::class.java)
                // Pass the user input to the new activity
                intent.putExtra("EXTRA_MESSAGE", addResult)
                // Start the new activity
                startActivity(intent)
            }catch(e: NumberFormatException){

                val intent = Intent(this, ErrorMesaage::class.java)

                intent.putExtra("EXTRA_MESSAGE", "Make sure there's 2 numbers")
                startActivity(intent)

            }
        }


        subButton.setOnClickListener {

            try {
                val userFirstInput = editFirstText.text.toString().toInt()
                val userSecondInput = editSecondText.text.toString().toInt()
                //Toast.makeText(this, userInput, Toast.LENGTH_SHORT).show()

                //Log.i("INFO","Add Button Click!")

                val addResult = userFirstInput - userSecondInput

                // Create an intent to navigate to CalculatorActivity
                val intent = Intent(this, CalculatorActivity::class.java)
                // Pass the user input to the new activity
                intent.putExtra("EXTRA_MESSAGE", addResult)
                // Start the new activity
                startActivity(intent)
            }catch(e: NumberFormatException){

                val intent = Intent(this, ErrorMesaage::class.java)

                intent.putExtra("EXTRA_MESSAGE", "Make sure there's 2 numbers")
                startActivity(intent)

            }
        }

        multiButton.setOnClickListener {
            try {
                val userFirstInput = editFirstText.text.toString().toInt()
                val userSecondInput = editSecondText.text.toString().toInt()
                //Toast.makeText(this, userInput, Toast.LENGTH_SHORT).show()

                //Log.i("INFO","Add Button Click!")

                val addResult = userFirstInput * userSecondInput

                // Create an intent to navigate to CalculatorActivity
                val intent = Intent(this, CalculatorActivity::class.java)
                // Pass the user input to the new activity
                intent.putExtra("EXTRA_MESSAGE", addResult)
                // Start the new activity
                startActivity(intent)
            }catch(e: NumberFormatException){

                val intent = Intent(this, ErrorMesaage::class.java)

                intent.putExtra("EXTRA_MESSAGE", "Make sure there's 2 numbers")
                startActivity(intent)

            }
        }

        divideButton.setOnClickListener {

            try {
                val userFirstInput = editFirstText.text.toString().toInt()
                val userSecondInput = editSecondText.text.toString().toInt()
                //Toast.makeText(this, userInput, Toast.LENGTH_SHORT).show()

                //Log.i("INFO","Add Button Click!")

                val addResult = userFirstInput / userSecondInput

                // Create an intent to navigate to CalculatorActivity
                val intent = Intent(this, CalculatorActivity::class.java)
                // Pass the user input to the new activity
                intent.putExtra("EXTRA_MESSAGE", addResult)
                // Start the new activity
                startActivity(intent)
            }
            catch(e: NumberFormatException){

                val intent = Intent(this, ErrorMesaage::class.java)

                intent.putExtra("EXTRA_MESSAGE", "Make sure there's 2 numbers")
                startActivity(intent)

            }
            catch(e: ArithmeticException){

                val intent = Intent(this, ErrorMesaage::class.java)

                intent.putExtra("EXTRA_MESSAGE", "divide by zero!")
                startActivity(intent)

            }
        }
    }

}
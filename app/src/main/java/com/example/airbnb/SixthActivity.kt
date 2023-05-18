package com.example.airbnb

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SixthActivity : AppCompatActivity() {

    private lateinit var kisumu_button1: Button
    private lateinit var kisumu_button2: Button
    private lateinit var kisumu_button3: Button
    private lateinit var kisumu_button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        kisumu_button1 = findViewById(R.id.btnkisumu1)
        kisumu_button2 = findViewById(R.id.btnkisumu2)
        kisumu_button3 = findViewById(R.id.btnkisumu3)
        kisumu_button4 = findViewById(R.id.btnkisumu4)

        kisumu_button1.setOnClickListener {

            var progress5 = ProgressDialog(this)
            progress5.setTitle("Opening Booking...")
            progress5.setMessage("Please wait")

            progress5.show()

            var gotobooking = Intent(this, MainActivity2::class.java)
            startActivity(gotobooking)
        }

        kisumu_button2.setOnClickListener {

            var progress6 = ProgressDialog(this)
            progress6.setTitle("Opening Booking...")
            progress6.setMessage("Please wait")

            progress6.show()

            var gotobooking = Intent(this, MainActivity2::class.java)
            startActivity(gotobooking)
        }

        kisumu_button3.setOnClickListener {

            var progress7 = ProgressDialog(this)
            progress7.setTitle("Opening Booking...")
            progress7.setMessage("Please wait")

            progress7.show()

            var gotobooking = Intent(this, MainActivity2::class.java)
            startActivity(gotobooking)
        }

        kisumu_button4.setOnClickListener {

            var progress8 = ProgressDialog(this)
            progress8.setTitle("Opening Booking...")
            progress8.setMessage("Please wait")

            progress8.show()

            var gotobooking = Intent(this, MainActivity2::class.java)
            startActivity(gotobooking)
        }
    }
}
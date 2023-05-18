package com.example.airbnb

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    private lateinit var nairobi_button1:Button
    private lateinit var nairobi_button2:Button
    private lateinit var nairobi_button3:Button
    private lateinit var nairobi_button4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nairobi_button1 = findViewById(R.id.btnnairobi1)
        nairobi_button2 = findViewById(R.id.btnnairobi2)
        nairobi_button3 = findViewById(R.id.btnnairobi3)
        nairobi_button4 = findViewById(R.id.btnnairobi4)

        nairobi_button1.setOnClickListener {

            var progress5 = ProgressDialog(this)
            progress5.setTitle("Opening Booking...")
            progress5.setMessage("Please wait")

            var gotobooking = Intent(this, MainActivity2::class.java)
            startActivity(gotobooking)

            progress5.show()

        }

        nairobi_button2.setOnClickListener {

            var progress6 = ProgressDialog(this)
            progress6.setTitle("Opening Booking...")
            progress6.setMessage("Please wait")

            var gotobooking = Intent(this, MainActivity2::class.java)
            startActivity(gotobooking)

            progress6.show()

        }

        nairobi_button3.setOnClickListener {

            var progress7 = ProgressDialog(this)
            progress7.setTitle("Opening Booking...")
            progress7.setMessage("Please wait")

            var gotobooking = Intent(this, MainActivity2::class.java)
            startActivity(gotobooking)

            progress7.show()

        }

        nairobi_button4.setOnClickListener {

            var progress8 = ProgressDialog(this)
            progress8.setTitle("Opening Booking...")
            progress8.setMessage("Please wait")

            var gotobooking = Intent(this, MainActivity2::class.java)
            startActivity(gotobooking)

            progress8.show()

        }
    }
}
package com.example.airbnb

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity2 : AppCompatActivity() {

    private lateinit var bookbutton:Button
    private lateinit var bookingname:EditText
    private lateinit var bookingage:EditText
    private lateinit var bookingphone:EditText
    private lateinit var bookingresidence:EditText
    private lateinit var bookingemail:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        bookbutton = findViewById(R.id.btnbook)
        bookingname = findViewById(R.id.namebooking)
        bookingage = findViewById(R.id.agebooking)
        bookingphone = findViewById(R.id.phonebooking)
        bookingresidence = findViewById(R.id.residencebooking)
        bookingemail = findViewById(R.id.emailbooking)

        bookbutton.setOnClickListener {

            var name = bookingname.text.toString().trim()
            var email = bookingemail.text.toString().trim()
            var age = bookingage.text.toString().trim()
            var phone = bookingphone.text.toString().trim()
            var residence = bookingresidence.text.toString().trim()
            var time_id = System.currentTimeMillis().toString()

            var progress = ProgressDialog(this)
            progress.setTitle("Saving Data")
            progress.setMessage("Please wait")

            if (name.isEmpty() || email.isEmpty() || age.isEmpty() || phone.isEmpty()|| residence.isEmpty()){

                Toast.makeText(this, "Input required,cannot submit an empty field", Toast.LENGTH_SHORT).show()

            }else{

                var my_child = FirebaseDatabase.getInstance().reference.child("Bookings/" + time_id)
                var booking_data = Booking(name, email, age, phone, residence, time_id)

                progress.show()

                my_child.setValue(booking_data).addOnCompleteListener{
                    if (it.isSuccessful){

                        Toast.makeText(this, "Data saved successfully", Toast.LENGTH_SHORT).show()

                        var gotoview = Intent(this,ViewBookingsActivity::class.java)
                        startActivity(gotoview)
                        finish()

                    }else{

                        Toast.makeText(this, "Error!Failed to upload data", Toast.LENGTH_SHORT).show()

                    }
                }
            }
        }
    }
}
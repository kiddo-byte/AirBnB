package com.example.airbnb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ViewBookingsActivity : AppCompatActivity() {

    private lateinit var my_list_view:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_bookings)

        my_list_view = findViewById(R.id.mListBooking)

        var bookings:ArrayList<Booking> = ArrayList()

        var my_adapter = CustomAdapter(applicationContext, bookings)

        var my_db = FirebaseDatabase.getInstance().reference.child("Bookings")

        my_db.addValueEventListener(object : ValueEventListener{

            override fun onDataChange(snapshot: DataSnapshot) {

                bookings.clear()
                for (snap in snapshot.children){
                    var person = snap.getValue(Booking::class.java)
                    bookings.add(person!!)
                }
                my_adapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {

                Toast.makeText(applicationContext, "Failed to Display Data", Toast.LENGTH_SHORT).show()

            }
        })

        my_list_view.adapter = my_adapter

    }
}
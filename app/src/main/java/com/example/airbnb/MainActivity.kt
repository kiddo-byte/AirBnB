package com.example.airbnb

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ArrayAdapter<*>
    private lateinit var lv:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,resources.getStringArray(R.array.area_array))

        lv = findViewById(R.id.list_item)

        lv.adapter = adapter

        lv.setOnItemClickListener { parent, view, position, id ->

            if (position==0){
                Toast.makeText(this, "Nairobi clicked...", Toast.LENGTH_SHORT).show()

                var progress = ProgressDialog(this)
                progress.setTitle("Showing Nairobi Residences...")
                progress.setMessage("Please wait")

                var gotonairobi = Intent(this,SecondActivity::class.java)
                startActivity(gotonairobi)

                progress.show()

            }
            if (position==1){
                Toast.makeText(this, "Nakuru clicked...", Toast.LENGTH_SHORT).show()

                var progress1 = ProgressDialog(this)
                progress1.setTitle("Showing Nakuru Residences...")
                progress1.setMessage("Please wait")

                var gotonakuru = Intent(this,ThirdActivity::class.java)
                startActivity(gotonakuru)

                progress1.show()

            }
            if (position==2){
                Toast.makeText(this, "Eldoret clicked...", Toast.LENGTH_SHORT).show()

                var progress2 = ProgressDialog(this)
                progress2.setTitle("Showing Eldoret Residences...")
                progress2.setMessage("Please wait")

                var gotoeldoret = Intent(this,FourthActivity::class.java)
                startActivity(gotoeldoret)

                progress2.show()

            }
            if (position==3){
                Toast.makeText(this, "Mombasa clicked...", Toast.LENGTH_SHORT).show()

                var progress3 = ProgressDialog(this)
                progress3.setTitle("Showing Mombasa Residences...")
                progress3.setMessage("Please wait")

                var gotomombasa = Intent(this,FifthActivity::class.java)
                startActivity(gotomombasa)

                progress3.show()

            }
            if (position==4  ) {
                Toast.makeText(this, "Kisumu clicked...", Toast.LENGTH_SHORT).show()

                var progress4 = ProgressDialog(this)
                progress4.setTitle("Showing Kisumu Residences...")
                progress4.setMessage("Please wait")

                var gotokisumu = Intent(this, SecondActivity::class.java)
                startActivity(gotokisumu)

                progress4.show()


            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)

        val search = menu?.findItem(R.id.nav_search)
        val searchView = search?.actionView as SearchView
        searchView.queryHint = "Where are you looking to stay?"

        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return true
            }
        })
        return super.onCreateOptionsMenu(menu)
    }
}
package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView1 = findViewById<ListView>(R.id.ListView1)
        val misc = arrayOf("The Canadian Horse", "Akhal-Teke", "Dales Pony", "Suffolk Punch", "Cleveland Bay",
            "Newfoundland Pony", "American Cream Draft", "Eriskay Pony", "Caspian Horse", "Hackney Horse",
            "Highland Pony", "Shire Horse")
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1, misc)
        listView1.adapter = arrayAdapter


        listView1.onItemClickListener = AdapterView.OnItemClickListener {
            parent, view, position, id ->
            Toast.makeText(this,"Selected: " + misc[position], Toast.LENGTH_LONG).show()
        }


    }
}
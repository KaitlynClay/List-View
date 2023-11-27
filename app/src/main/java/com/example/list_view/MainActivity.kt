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
//        val misc = arrayOf("The Canadian Horse", "Akhal-Teke", "Dales Pony", "Suffolk Punch", "Cleveland Bay",
//            "Newfoundland Pony", "American Cream Draft", "Eriskay Pony", "Caspian Horse", "Hackney Horse",
//            "Highland Pony", "Shire Horse")
        var list = ArrayList<Model>()

        list.add(Model("The Canadian Horse", "Saddle horse", R.drawable.horse_eye))
        list.add(Model("Dales Pony", "Pony", R.drawable.horse_eye))
        list.add(Model("Suffolk Punch", "Draft horse", R.drawable.horse_eye))

        listView1.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)





    }
}
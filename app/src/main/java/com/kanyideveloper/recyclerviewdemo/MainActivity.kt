package com.kanyideveloper.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: NamesAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.namesRecyclerView)

        val namesList = arrayListOf("Joel", "Ann", "Robert", "Washngton", "Brandy", "Jackie", "Collince","Joel", "Ann", "Robert", "Washngton", "Brandy", "Jackie", "Collince","Joel", "Ann", "Robert", "Washngton", "Brandy", "Jackie", "Collince")

        adapter = NamesAdapter(namesList)

        recyclerView.adapter = adapter

    }

}
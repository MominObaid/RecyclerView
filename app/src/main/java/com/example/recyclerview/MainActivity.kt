package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val itemList = listOf<String>("Alex","Sam","John","Tony")
        val MainList = findViewById<RecyclerView>(R.id.listView)
        MainList.adapter = MyAdapter(this, itemList)
        MainList.layoutManager = LinearLayoutManager(this)

    }
}

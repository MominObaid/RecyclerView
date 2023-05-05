package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val MainList = binding.listView
        MainList.adapter = MyAdapter(itemList)
        MainList.layoutManager = LinearLayoutManager(this)

    }

    val itemList = listOf<itemListt>(
        itemListt("Tom", "New Message"),
        itemListt ("Sam", "Student"),
        itemListt("Tim", "Student", ),
        itemListt("Alex", "Employee"),
        itemListt("abc", "xyz"),
        itemListt("def", "zyx"),
        itemListt("ghi", "age"),
        itemListt("jkl", "bbbbb"),
        itemListt("bbbbb", "ccccc"),
        itemListt("ccccc","zzzzzzzz")
    )

    data class itemListt(
        var Name: String,
        var Detail: String,
    )
}


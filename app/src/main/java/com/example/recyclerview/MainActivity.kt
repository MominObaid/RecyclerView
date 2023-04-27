package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val MainList = findViewById<RecyclerView>(R.id.listView)
        MainList.adapter = MyAdapter(itemList)
        MainList.layoutManager = LinearLayoutManager(this)

    }

    val itemList = listOf<itemListt>(
        itemListt(
            "Tom", "New Message"
        ),
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
//        var Image: ImageView
    )

}


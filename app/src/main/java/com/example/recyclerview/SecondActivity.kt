package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.databinding.ActivitySecondBinding
import java.io.File

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val binding = ActivitySecondBinding.inflate(LayoutInflater.from(parent))
        setContentView(R.layout.activity_second)

        val AddName = findViewById<EditText>(R.id.ET_Name)
        val AddDetails = findViewById<EditText>(R.id.ET_Details)
        val AddbtnData = findViewById<Button>(R.id.btnAdd)


        AddbtnData.setOnClickListener{
            val fileName :String = AddName.text.toString()
            val fileDetails: String = AddDetails.text.toString()

            val AddIntent = Intent(this, MainActivity::class.java)
            AddIntent.putExtra("", fileName)
                .putExtra("", fileDetails)
            startActivity(AddIntent)
        }
    }
}
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
    private lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val AddName = binding.ET_Name
        val AddDetails = binding.ET_Details
        val AddbtnData = binding.btnAdd


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

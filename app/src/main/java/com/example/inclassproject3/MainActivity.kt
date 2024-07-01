package com.example.inclassproject3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {


    val viewModel: projectViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputName : EditText = findViewById(R.id.inputName)
        val inputSurname : EditText = findViewById(R.id.inputSurname)

        val button : Button = findViewById(R.id.button)
        val twMessage : TextView = findViewById(R.id.twMessage)

        button.setOnClickListener{
            viewModel.setName("Welcome " + inputName.text.toString() + " " + inputSurname.text.toString())
        }

        val name_Observer = Observer<String>{newValue ->
            twMessage.text = newValue.toString()
        }
        viewModel.name.observe(this,name_Observer)

    }
}
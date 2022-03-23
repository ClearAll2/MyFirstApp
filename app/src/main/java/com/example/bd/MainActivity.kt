package com.example.bd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "EXTRA_MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btt :Button = findViewById(R.id.buttonShowme)
        btt.setOnClickListener{
            val conText = findViewById<EditText>(R.id.editTextTextPersonName)
            val message = conText.text.toString()
            if (message.isEmpty())
            {
                val toast = Toast.makeText(this, "Name cannot be empty!", Toast.LENGTH_LONG)
                toast.show()
                return@setOnClickListener
            }
            val intent = Intent(this, ShowMe::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)
        }
    }
}

package com.example.bd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btt :Button = findViewById(R.id.buttonShowme)
        btt.setOnClickListener{
            val toast = Toast.makeText(this, "Happy Birthday!!!!", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}
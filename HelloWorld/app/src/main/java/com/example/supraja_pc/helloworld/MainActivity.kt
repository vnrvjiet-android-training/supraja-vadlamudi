package com.example.supraja_pc.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById(R.id.button) as Button
        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "Submitted.", Toast.LENGTH_SHORT).show()
        }
    }
}

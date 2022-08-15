package com.example.resepmasakan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.)
        val adapter = resepAdapter()
        listView.adapter = adapter

        val dataName = resources.getStringArray()
        val dataDescription = resources.getStringArray()
        val photo = resources.obtainTypedArray()
        photo.recycle()

        val
    }
}
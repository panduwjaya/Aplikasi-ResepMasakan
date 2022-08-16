package com.example.resepmasakan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

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
    override fun onCreateOptionsMenu(menu: Menu?):Boolean{
        val inflater:MenuInflater=menuInflater
        inflater.inflate(R.menu.option_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.btnAbout -> {
                val moveIntent = Intent(this@MainActivity, About::class.java)
                startActivity(moveIntent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }



}
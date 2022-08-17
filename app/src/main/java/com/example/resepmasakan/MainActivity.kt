package com.example.resepmasakan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val listView: ListView = findViewById(R.id.)
//        val adapter = ResepAdapter()
//        listView.adapter = adapter
//
//        val dataName = resources.getStringArray()
//        val dataDescription = resources.getStringArray()
//        val photo = resources.obtainTypedArray()
//        photo.recycle()
//
//        val
//    }

    private lateinit var rvResep: RecyclerView
    private var list: ArrayList<Resep> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvResep = findViewById(R.id.rv_resep)
        rvResep.setHasFixedSize(true)

        list.addAll(ResepData.listDataResep)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvResep.layoutManager = LinearLayoutManager(this)
        val listResepAdapter = ResepAdapter(list)
        rvResep.adapter = listResepAdapter
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.option_menu, menu)
//        return super.onCreateOptionsMenu(menu)
//    }

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


//BATAS

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        setMode(item.itemId)
//        return super.onOptionsItemSelected(item)
//    }
//
//    private fun setMode(selectedMode: Int) {
//        when (selectedMode) {
//            R.id.btnAbout -> {
//                val moveIntent = Intent(this@MainActivity, About::class.java)
//                startActivity(moveIntent)
//            }
//        }
//    }

}
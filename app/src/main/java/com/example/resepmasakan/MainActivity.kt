package com.example.resepmasakan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.resepmasakan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<Resep> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvResep.setHasFixedSize(true)
        list.addAll(ResepData.listDataResep)
        showRecyclerList()
    }


    override fun onCreateOptionsMenu(menu: Menu?):Boolean{
        val inflater:MenuInflater = menuInflater
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

    private fun showRecyclerList() {
        binding.rvResep.layoutManager = LinearLayoutManager(this)
        val listResepAdapter = ResepAdapter(list)
        binding.rvResep.adapter = listResepAdapter
    }
}
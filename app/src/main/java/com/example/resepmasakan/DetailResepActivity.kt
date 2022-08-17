package com.example.resepmasakan

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.CollapsingToolbarLayout

class DetailResepActivity: AppCompatActivity() {
    companion object {
        const val KEY_RESEP = "key_resep"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_daftar_resep)
        setSupportActionBar(findViewById(R.id.toolbar))

        val dataSendResep = intent.getParcelableExtra<>(KEY_RESEP) as Resep
        findViewById<CollapsingToolbarLayout>(R.id.tv_item_name).title = dataSendResep.nama
        findViewById<TextView>(R.id.tv_item_detail).text = dataSendResep.detail
        findViewById<ImageView>(R.id.img_item_photo).setImageResource(dataSendResep.photo)
    }
}
package com.example.resepmasakan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.resepmasakan.databinding.ActivityDetailResepBinding

class DetailResep : AppCompatActivity() {

    //membuat binding
    private lateinit var binding: ActivityDetailResepBinding

    companion object {
        const val EXTRA_RESEP = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailResepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.getParcelableExtra<Resep>(EXTRA_RESEP) as Resep
        Glide.with(this).load(item.photo).into(binding.imgDetail)
        binding.descriptionDetail.text = item.nama
        binding.authorDetail.text = item.detail
    }
}
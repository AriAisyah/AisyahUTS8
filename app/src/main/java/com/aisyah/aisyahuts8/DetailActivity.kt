package com.aisyah.aisyahuts8

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name")
        val detail = intent.getStringExtra("detail")
        val photo = intent.getIntExtra("photo", 0)

        val tvname: TextView = findViewById(R.id.detail_nama)
        val imgphoto: ImageView = findViewById(R.id.detail_gambar)
        val tvisi: TextView = findViewById(R.id.detail_isi)

        tvname.text = name
        tvisi.text = detail
        Glide.with(this).load(photo).into(imgphoto)

    }
}

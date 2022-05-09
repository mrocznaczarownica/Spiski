package com.example.spiski

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.spiski.recadapters.FeelRecycler
import com.example.spiski.recadapters.MyFeel
import com.example.spiski.recadapters.feel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val feel_recycler : RecyclerView = findViewById(R.id.recyclerView1)
        feel_recycler.adapter = FeelRecycler(MyFeel().list)
    }
}
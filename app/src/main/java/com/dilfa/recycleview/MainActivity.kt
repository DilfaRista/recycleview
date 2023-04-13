package com.dilfa.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.pppa,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.pppa,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.tv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}
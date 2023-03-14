package com.stohkdyh.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.stohkdyh.movieapp.databinding.ActivityMainBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            with(rvCategories) {
                adapter = CategoryAdapter(listOf("Action", "Horror", "Comedy"))
                layoutManager = LinearLayoutManager(this@DashboardActivity, LinearLayoutManager.HORIZONTAL, false)
            }

            with(rvFilm) {
                adapter = FilmAdapter(listOf(Film("Doraemon", "2019-08-03", "9.2", R.drawable.image_ex_film), Film("Avangers End Game", "2019-08-03", "9.2", R.drawable.image_ex_film)))
                layoutManager = LinearLayoutManager(this@DashboardActivity)
            }
        }
    }
}
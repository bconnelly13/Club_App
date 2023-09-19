package com.example.clubapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.clubapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Launch the VerticalListActivity on verticalBtn click
        binding.allClubButton.setOnClickListener { launchGrid() }

        // Launch the HorizontalListActivity on horizontalBtn click
        binding.myClubButton.setOnClickListener { launchVertical() }
    }
    private fun launchVertical() {
        listIntent = Intent(this, MyClubsActivity::class.java)
        startActivity(listIntent)
    }
    private fun launchGrid() {
        listIntent = Intent(this, AllClubsActivity::class.java)
        startActivity(listIntent)
    }

}
package com.example.cadenas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.cadenas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding
            by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottonMenu.setupWithNavController(navController)

    }
}
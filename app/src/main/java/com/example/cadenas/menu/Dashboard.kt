package com.example.cadenas.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cadenas.R
import com.example.cadenas.databinding.ActivityDashboardBinding

class Dashboard : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnsignin.setOnClickListener{
            val intent = Intent(this,SignIn::class.java)
            startActivity(intent)
        }
        binding.btnsignup.setOnClickListener{
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }
}
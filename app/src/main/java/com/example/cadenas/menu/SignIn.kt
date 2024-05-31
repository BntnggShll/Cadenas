package com.example.cadenas.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cadenas.R
import com.example.cadenas.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
        binding.btnsignup.setOnClickListener{
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
        binding.btnsignin.setOnClickListener{
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}
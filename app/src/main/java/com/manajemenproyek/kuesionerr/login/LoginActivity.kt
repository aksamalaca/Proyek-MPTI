package com.manajemenproyek.kuesionerr.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.manajemenproyek.kuesionerr.MainActivity
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.databinding.ActivityLoginBinding
import com.manajemenproyek.kuesionerr.register.RegisterActivity
import com.manajemenproyek.kuesionerr.splash.SplashActivity

class LoginActivity : AppCompatActivity() {

    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val backButton = findViewById<ImageButton>(R.id.ib_back_login)
        backButton.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
            finish()
        }

        val textDaftar = findViewById<TextView>(R.id.tv_daftar_act_login)
        textDaftar.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }


}
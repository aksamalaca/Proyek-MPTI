package com.manajemenproyek.kuesionerr.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.login.LoginActivity
import com.manajemenproyek.kuesionerr.register.RegisterActivity


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val textMasuk = findViewById<TextView>(R.id.tv_masuk)
        textMasuk.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        btnDaftar.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}
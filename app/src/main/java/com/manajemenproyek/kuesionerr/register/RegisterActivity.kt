package com.manajemenproyek.kuesionerr.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.login.LoginActivity
import com.manajemenproyek.kuesionerr.splash.SplashActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val backButton = findViewById<ImageButton>(R.id.ib_back)
        backButton.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
            finish()
        }

        val textMasuk = findViewById<TextView>(R.id.tv_masuk_act_regis)
        textMasuk.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
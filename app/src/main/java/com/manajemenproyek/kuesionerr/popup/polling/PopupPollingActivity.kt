package com.manajemenproyek.kuesionerr.popup.polling

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.manajemenproyek.kuesionerr.MainActivity
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.hasil.HasilActivity

class PopupPollingActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_polling)

        val textHome = findViewById<TextView>(R.id.tv_back_home)
        textHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val textHasil = findViewById<TextView>(R.id.tv_lihat_hasil)
        textHasil.setOnClickListener {
            val intent = Intent(this, HasilActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
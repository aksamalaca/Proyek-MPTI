package com.manajemenproyek.kuesionerr.hasil

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.popup.polling.PopupPollingActivity

class HasilActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val backButton = findViewById<ImageButton>(R.id.ib_back)
        backButton.setOnClickListener {
            val intent = Intent(this, PopupPollingActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
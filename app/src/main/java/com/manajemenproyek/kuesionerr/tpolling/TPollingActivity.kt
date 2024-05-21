package com.manajemenproyek.kuesionerr.tpolling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.manajemenproyek.kuesionerr.MainActivity
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.polling.PollingActivity
import com.manajemenproyek.kuesionerr.popup.polling.PopupPollingActivity

class TPollingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tpolling)

        val backButton = findViewById<ImageButton>(R.id.ib_back_home)
        backButton.setOnClickListener {
            val intent = Intent(this, PollingActivity::class.java)
            startActivity(intent)
            finish()
        }

        val sendButton = findViewById<Button>(R.id.submit_button)
        sendButton.setOnClickListener {
            val intent = Intent(this, PopupPollingActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
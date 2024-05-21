package com.manajemenproyek.kuesionerr.tsurvei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.manajemenproyek.kuesionerr.MainActivity
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.polling.PollingActivity
import com.manajemenproyek.kuesionerr.popup.survei.PopupSurveiActivity
import com.manajemenproyek.kuesionerr.survei.SurveiActivity

class TSurveiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tsurvei)

        val backButton = findViewById<ImageButton>(R.id.ib_back_home)
        backButton.setOnClickListener {
            val intent = Intent(this, SurveiActivity::class.java)
            startActivity(intent)
            finish()
        }

        val sendButton = findViewById<Button>(R.id.submit_button)
        sendButton.setOnClickListener {
            val intent = Intent(this, PopupSurveiActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
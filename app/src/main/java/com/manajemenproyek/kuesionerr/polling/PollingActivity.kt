package com.manajemenproyek.kuesionerr.polling

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.manajemenproyek.kuesionerr.MainActivity
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.data.PollingDataSourceImpl
import com.manajemenproyek.kuesionerr.data.PollingDataSource
import com.manajemenproyek.kuesionerr.model.Polling
import com.manajemenproyek.kuesionerr.polling.adapter.AdapterPolling
import com.manajemenproyek.kuesionerr.polling.adapter.OnItemClickListener
import com.manajemenproyek.kuesionerr.tpolling.TPollingActivity

class PollingActivity : AppCompatActivity(), OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polling)

        val backButton = findViewById<ImageButton>(R.id.ib_back_home)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        showPolling()
    }

    private fun showPolling() {
        val rvPolling = findViewById<RecyclerView>(R.id.rv_polling_near)
        val pollingAdapter = AdapterPolling(this)
        rvPolling.adapter = pollingAdapter
        rvPolling.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        val pollingDataSource: PollingDataSource = PollingDataSourceImpl()
        val pollingList: List<Polling> = pollingDataSource.getPolling()
        pollingAdapter.setData(pollingList)
    }

    override fun onItemClick(item: Polling) {
        val intent = Intent(this, TPollingActivity::class.java)
        intent.putExtra("SURVEI_ID", item.id)
        startActivity(intent)
    }
}

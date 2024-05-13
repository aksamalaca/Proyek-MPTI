package com.manajemenproyek.kuesionerr.polling

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.data.PollingDataSourceImpl
import com.manajemenproyek.kuesionerr.data.PollingDataSource
import com.manajemenproyek.kuesionerr.model.Polling
import com.manajemenproyek.kuesionerr.polling.adapter.AdapterPolling

class PollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polling)
        showPolling()
    }

    private fun showPolling() {
        val rvPolling = findViewById<RecyclerView>(R.id.rv_polling_near)
        val pollingAdapter = AdapterPolling()
        rvPolling.adapter = pollingAdapter
        rvPolling.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        val pollingDataSource: PollingDataSource = PollingDataSourceImpl()
        val pollingList: List<Polling> = pollingDataSource.getPolling()
        pollingAdapter.setData(pollingList)
    }
}

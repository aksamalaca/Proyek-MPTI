package com.manajemenproyek.kuesionerr.riwayat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.data.RiwayatDataSource
import com.manajemenproyek.kuesionerr.data.RiwayatDataSourceImpl
import com.manajemenproyek.kuesionerr.model.Riwayat
import com.manajemenproyek.kuesionerr.riwayat.adapter.AdapterRiwayat


class RiwayatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment`
        return inflater.inflate(R.layout.fragment_riwayat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showRiwayat(view)
    }

    private fun showRiwayat(view: View) {
        val rvRiwayat = view.findViewById<RecyclerView>(R.id.rv_riwayat)
        val riwayatAdapter = AdapterRiwayat()
        rvRiwayat.adapter = riwayatAdapter
        rvRiwayat.layoutManager = GridLayoutManager(requireContext(), 1, GridLayoutManager.VERTICAL, false)
        val riwayatDataSource: RiwayatDataSource = RiwayatDataSourceImpl()
        val riwayatList: List<Riwayat> = riwayatDataSource.getRiwayat()
        riwayatAdapter.setData(riwayatList)
    }
}

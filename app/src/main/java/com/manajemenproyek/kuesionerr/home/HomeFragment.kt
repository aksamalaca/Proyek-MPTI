package com.manajemenproyek.kuesionerr.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.data.PollingDataSource
import com.manajemenproyek.kuesionerr.data.PollingDataSourceImpl
import com.manajemenproyek.kuesionerr.data.SurveyDataSource
import com.manajemenproyek.kuesionerr.data.SurveyDataSourceImpl
import com.manajemenproyek.kuesionerr.home.adapter.AdapterPolling
import com.manajemenproyek.kuesionerr.home.adapter.AdapterSurvey
import com.manajemenproyek.kuesionerr.login.LoginActivity
import com.manajemenproyek.kuesionerr.model.Polling
import com.manajemenproyek.kuesionerr.model.Survey
import com.manajemenproyek.kuesionerr.polling.PollingActivity
import com.manajemenproyek.kuesionerr.register.RegisterActivity
import com.manajemenproyek.kuesionerr.survei.SurveiActivity


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showSurvey(view)
        showPolling(view)

        view.findViewById<TextView>(R.id.tv_lihat_survei).setOnClickListener {
            val intent = Intent(requireContext(), SurveiActivity::class.java)
            startActivity(intent)
        }

        view.findViewById<TextView>(R.id.tv_lihat_polling).setOnClickListener {
            val intent = Intent(requireContext(), PollingActivity::class.java)
            startActivity(intent)
        }
    }


    private fun showPolling(view: View) {
        val rvPolling = view.findViewById<RecyclerView>(R.id.rv_polling)
        val pollingAdapter = AdapterPolling()
        rvPolling.adapter = pollingAdapter
        rvPolling.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL, false )
        val pollingDataSource: PollingDataSource = PollingDataSourceImpl()
        val pollingList: List<Polling> = pollingDataSource.getPolling()
        pollingAdapter.setData(pollingList)
    }

    private fun showSurvey(view: View) {
        val rvSurvey = view.findViewById<RecyclerView>(R.id.rv_survei)
        val surveyAdapter = AdapterSurvey()
        rvSurvey.adapter = surveyAdapter
        rvSurvey.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL, false )
        val surveyDataSource: SurveyDataSource = SurveyDataSourceImpl()
        val surveyList: List<Survey> = surveyDataSource.getSurvey()
        surveyAdapter.setData(surveyList)
    }
}

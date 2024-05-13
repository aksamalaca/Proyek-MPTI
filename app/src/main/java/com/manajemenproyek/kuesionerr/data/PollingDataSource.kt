package com.manajemenproyek.kuesionerr.data

import com.manajemenproyek.kuesionerr.model.Polling

interface PollingDataSource{
    fun getPolling(): List<Polling>
}

class PollingDataSourceImpl : PollingDataSource {
    override fun getPolling(): List<Polling> = listOf(
        Polling(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Polling(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Polling(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Polling(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Polling(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
    )
}
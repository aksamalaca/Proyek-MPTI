package com.manajemenproyek.kuesionerr.data

import com.manajemenproyek.kuesionerr.model.Riwayat

interface RiwayatDataSource{
    fun getRiwayat(): List<Riwayat>
}

class RiwayatDataSourceImpl : RiwayatDataSource {
    override fun getRiwayat(): List<Riwayat> = listOf(
        Riwayat(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Riwayat(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Riwayat(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Riwayat(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Riwayat(
            title = "Tanggal Pelaksanaan Kerja bakti mingguan",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/kuesioner.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
    )
}
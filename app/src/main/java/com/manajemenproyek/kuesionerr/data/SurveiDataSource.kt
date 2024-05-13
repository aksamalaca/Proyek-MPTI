package com.manajemenproyek.kuesionerr.data

import com.manajemenproyek.kuesionerr.model.Survei

interface SurveiDataSource{
    fun getSurvei(): List<Survei>
}

class SurveiDataSourceImpl : SurveiDataSource {
    override fun getSurvei(): List<Survei> = listOf(
        Survei(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            description = "Survey ini bertujuan untuk mengumpulkan data tentang kesehatan masyarakat RT X"
        ),
        Survei(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            description = "Survey ini bertujuan untuk mengumpulkan data tentang kesehatan masyarakat RT X"
        ),
        Survei(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            description = "Survey ini bertujuan untuk mengumpulkan data tentang kesehatan masyarakat RT X"
        ),
        Survei(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            description = "Survey ini bertujuan untuk mengumpulkan data tentang kesehatan masyarakat RT X"
        ),
        Survei(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            description = "Survey ini bertujuan untuk mengumpulkan data tentang kesehatan masyarakat RT X"
        ),
    )
}
package com.manajemenproyek.kuesionerr.data

import com.manajemenproyek.kuesionerr.model.Survey

interface SurveyDataSource{
    fun getSurvey(): List<Survey>
}

class SurveyDataSourceImpl : SurveyDataSource {
    override fun getSurvey(): List<Survey> = listOf(
        Survey(
            name = "Snack",
            imgUrl = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/ic_snack.png"
        )
    )
}
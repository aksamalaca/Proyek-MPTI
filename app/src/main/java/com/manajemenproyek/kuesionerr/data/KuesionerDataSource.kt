package com.manajemenproyek.kuesionerr.data

import com.manajemenproyek.kuesionerr.model.Kuesioner

interface KuesionerDataSource{
    fun getKuesioner(): List<Kuesioner>
}

class KuesionerDataSourceImpl : KuesionerDataSource {
    override fun getKuesioner(): List<Kuesioner> = listOf(
        Kuesioner(
            name = "Snack",
            imgUrl = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/ic_snack.png"
        )
    )
}
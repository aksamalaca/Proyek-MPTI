package com.manajemenproyek.kuesionerr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Polling(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val imgUrl: String,
    val deadline: String,
    val responded: String
) : Parcelable
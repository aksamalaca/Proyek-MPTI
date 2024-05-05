package com.manajemenproyek.kuesionerr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Survey(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val imgUrl: String
) : Parcelable
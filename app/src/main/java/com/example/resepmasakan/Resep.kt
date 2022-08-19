package com.example.resepmasakan

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Resep(
    var nama: String = "",
    var detail: String = "",
    var photo: Int = 0
): Parcelable

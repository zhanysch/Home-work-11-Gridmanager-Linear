package com.example.homework11

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class cusstomDataClass(
    val image2: Int,
    val ttext: String = "выбери recyclerview"


): Parcelable



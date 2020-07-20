package com.example.homework11

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class cusstomDataClass(
    val ttext: String="выбери recyclerview"
): Parcelable



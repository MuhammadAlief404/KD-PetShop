package com.quantumhiggs.kdpetshop.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pets(
    var race: String = "",
    var image: Int = 0,
    var age: String = "",
    var sex: String = "",
    var type : String = ""
) : Parcelable
package feri.com.belajarandroid

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class HeroModel(
    var nama: String? = null,
    var gender: String? = null,
    var role: String? = null
) : Parcelable
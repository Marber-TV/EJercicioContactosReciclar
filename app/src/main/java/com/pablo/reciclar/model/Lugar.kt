package com.pablo.reciclar.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Lugar (

    val nombre: String,
    val urlImagen: String,
    val latitud: String,
    val longitud: String

): Parcelable
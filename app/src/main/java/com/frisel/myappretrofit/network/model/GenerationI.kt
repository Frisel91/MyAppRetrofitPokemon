package com.frisel.myappretrofit.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationI(
    @SerialName(value = "red-blue")
    val red_blue: RedBlue,
    val yellow: Yellow
)
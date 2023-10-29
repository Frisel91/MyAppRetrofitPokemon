package com.frisel.myappretrofit.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationVii(
    val icons: Icons,
    @SerialName(value = "ultra-sun-ultra-moon")
    val ultra_sun_ultra_moon: UltraSunUltraMoon
)
package com.frisel.myappretrofit.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Other(
    val dream_world: DreamWorld,
    val home: Home,
    @SerialName(value = "official-artwork")
    val official_artwork: OfficialArtwork
)
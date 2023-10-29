package com.frisel.myappretrofit.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIv(
    @SerialName(value = "diamond-pearl")
    val diamond_pearl: DiamondPearl,
    @SerialName(value = "heartgold-soulsilver")
    val heartgold_soulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)
package com.frisel.myappretrofit.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIii(
    val emerald: Emerald,
    @SerialName(value = "firered-leafgreen" )
    val firered_leafgreen: FireredLeafgreen,
    @SerialName(value = "ruby-sapphire")
    val ruby_sapphire: RubySapphire
)
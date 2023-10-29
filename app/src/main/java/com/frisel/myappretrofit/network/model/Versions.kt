package com.frisel.myappretrofit.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Versions(
    @SerialName(value = "generation-i")
    val generation_i: GenerationI,
    @SerialName(value = "generation-ii")
    val generation_ii: GenerationIi,
    @SerialName(value = "generation-iii")
    val generation_iii: GenerationIii,
    @SerialName(value = "generation-iv")
    val generation_iv: GenerationIv,
    @SerialName(value = "generation-v")
    val generation_v: GenerationV,
    @SerialName(value = "generation-vi")
    val generation_vi: GenerationVi,
    @SerialName(value = "generation-vii")
    val generation_vii: GenerationVii,
    @SerialName(value = "generation-viii")
    val generation_viii: GenerationViii
)
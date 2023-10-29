package com.frisel.myappretrofit.network.model

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)
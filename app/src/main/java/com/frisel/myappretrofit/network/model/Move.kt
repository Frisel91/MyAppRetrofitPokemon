package com.frisel.myappretrofit.network.model

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)
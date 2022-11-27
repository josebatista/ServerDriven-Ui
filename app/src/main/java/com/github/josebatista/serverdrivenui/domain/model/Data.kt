package com.github.josebatista.serverdrivenui.domain.model

data class Data(
    val children: List<Data> = emptyList(),
    val topBar: List<Data> = emptyList(),
    val type: Type = Type.UNKNOWN,
    val value: String = "",
    val size: Int = 0,
    val action: Action = Action(),
)
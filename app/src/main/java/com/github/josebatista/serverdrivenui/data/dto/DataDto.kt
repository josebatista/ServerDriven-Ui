package com.github.josebatista.serverdrivenui.data.dto

import com.google.gson.annotations.SerializedName

data class DataDto(
    @SerializedName("children")
    val children: List<DataDto> = emptyList(),

    @SerializedName("top_bar")
    val topBar: List<DataDto> = emptyList(),

    @SerializedName("type")
    val type: TypeDto = TypeDto.UNKNOWN,

    @SerializedName("value")
    val value: String = "",

    @SerializedName("size")
    val size: Int = 0,

    @SerializedName("action")
    val action: ActionDto = ActionDto()
)

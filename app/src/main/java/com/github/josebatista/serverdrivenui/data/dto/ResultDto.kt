package com.github.josebatista.serverdrivenui.data.dto

import com.google.gson.annotations.SerializedName

data class ResultDto(
    @SerializedName("data")
    val dataDto: List<DataDto> = emptyList(),
)

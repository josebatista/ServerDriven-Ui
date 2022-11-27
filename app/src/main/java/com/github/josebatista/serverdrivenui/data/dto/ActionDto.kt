package com.github.josebatista.serverdrivenui.data.dto

import com.google.gson.annotations.SerializedName

data class ActionDto(
    @SerializedName("type")
    val type: ActionTypeDto = ActionTypeDto.UNKNOWN,

    @SerializedName("value")
    val value: String = "",
)

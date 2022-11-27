package com.github.josebatista.serverdrivenui.domain.model

data class Action(
    val type: ActionType = ActionType.UNKNOWN,
    val value: String = "",
)

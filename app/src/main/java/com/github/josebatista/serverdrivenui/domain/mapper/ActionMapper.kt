package com.github.josebatista.serverdrivenui.domain.mapper

import com.github.josebatista.serverdrivenui.data.dto.ActionDto
import com.github.josebatista.serverdrivenui.domain.model.Action
import com.github.josebatista.serverdrivenui.domain.model.ActionType

fun ActionDto.toAction(): Action = Action(
    type = ActionType.valueOf(type.name),
    value = value
)
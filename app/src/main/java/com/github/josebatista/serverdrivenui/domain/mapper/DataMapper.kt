package com.github.josebatista.serverdrivenui.domain.mapper

import com.github.josebatista.serverdrivenui.data.dto.DataDto
import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.domain.model.Type

fun DataDto.toData(): Data = Data(
    children = children.map { dto -> dto.toData() },
    topBar = topBar.map { dto -> dto.toData() },
    type = Type.valueOf(type.name),
    value = value,
    size = size,
    action = action.toAction()
)
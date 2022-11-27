package com.github.josebatista.serverdrivenui.presentation

import com.github.josebatista.serverdrivenui.domain.model.Data

data class MainState(
    val uiItem: List<Data> = emptyList(),
)

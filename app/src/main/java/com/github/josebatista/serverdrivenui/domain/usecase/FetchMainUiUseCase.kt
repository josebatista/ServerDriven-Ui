package com.github.josebatista.serverdrivenui.domain.usecase

import com.github.josebatista.serverdrivenui.domain.model.Data

interface FetchMainUiUseCase {
    suspend operator fun invoke(): List<Data>
}
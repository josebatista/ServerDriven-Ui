package com.github.josebatista.serverdrivenui.domain.usecase

import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.domain.repository.Repository
import javax.inject.Inject

class FetchMainUiUseCaseImpl @Inject constructor(
    private val repository: Repository,
) : FetchMainUiUseCase {
    override suspend fun invoke(): List<Data> = repository()
}
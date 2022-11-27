package com.github.josebatista.serverdrivenui.data.repository

import com.github.josebatista.serverdrivenui.data.local.Mock
import com.github.josebatista.serverdrivenui.domain.mapper.toData
import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor() : Repository {
    override suspend fun invoke(): List<Data> = runCatching {
        Mock().getMainUi().dataDto.map { dataDto -> dataDto.toData() }
    }.getOrDefault(emptyList())
}
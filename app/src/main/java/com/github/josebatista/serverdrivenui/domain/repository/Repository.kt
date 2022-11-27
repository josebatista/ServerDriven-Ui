package com.github.josebatista.serverdrivenui.domain.repository

import com.github.josebatista.serverdrivenui.domain.model.Data

interface Repository {
    suspend operator fun invoke(): List<Data>
}
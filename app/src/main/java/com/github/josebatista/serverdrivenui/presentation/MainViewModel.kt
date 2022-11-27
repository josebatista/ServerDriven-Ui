package com.github.josebatista.serverdrivenui.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.github.josebatista.serverdrivenui.domain.usecase.FetchMainUiUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val fetchMainUiUseCase: FetchMainUiUseCase,
) : ViewModel() {

    var state by mutableStateOf(MainState())
        private set

    suspend fun fetchMainUi() {
        val items = fetchMainUiUseCase()
        state = state.copy(
            uiItem = items
        )
    }
}
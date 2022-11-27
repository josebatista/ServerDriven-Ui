package com.github.josebatista.serverdrivenui.presentation.cardstack.core

import androidx.compose.runtime.Composable
import com.github.josebatista.serverdrivenui.domain.model.Data

object SetView {

    @Composable
    operator fun invoke(data: List<Data>) {
        data.forEach {
            CheckUiType(it)
        }
    }

    @Composable
    operator fun invoke(data: Data) {
        CheckUiType(data)
    }
}
package com.github.josebatista.serverdrivenui.presentation.cardstack.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.Component

class TextComponent(
    private val data: Data,
) : Component() {

    @Composable
    override fun Render() {
        super.Render()

        Text(
            text = data.value
        )
    }


}
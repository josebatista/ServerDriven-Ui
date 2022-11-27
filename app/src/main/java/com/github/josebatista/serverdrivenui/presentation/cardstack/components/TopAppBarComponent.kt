package com.github.josebatista.serverdrivenui.presentation.cardstack.components

import android.util.Log
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.Component
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.SetView

class TopAppBarComponent(
    private val data: Data,
) : Component() {

    @Composable
    override fun Render() {
        super.Render()
        TopAppBar(
            title = {
                SetView(data.children)
            },
            backgroundColor = MaterialTheme.colors.background
        )
    }

    override fun receiveEvent(event: String) {
        Log.d("TopAppBar", "===> RECEIVED EVENT: $event")
    }
}
package com.github.josebatista.serverdrivenui.presentation.cardstack.components

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.Component
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.SetView

class ScaffoldComponent(
    private val data: Data,
) : Component() {

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @Composable
    override fun Render() {
        super.Render()

        Scaffold(
            topBar = {
                SetView(data.topBar)
            }
        ) {
            SetView(data.children)
        }
    }
}
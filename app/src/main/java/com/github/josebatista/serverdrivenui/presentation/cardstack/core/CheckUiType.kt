package com.github.josebatista.serverdrivenui.presentation.cardstack.core

import androidx.compose.runtime.Composable
import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.domain.model.Type
import com.github.josebatista.serverdrivenui.presentation.cardstack.components.ImageComponent
import com.github.josebatista.serverdrivenui.presentation.cardstack.components.RowComponent
import com.github.josebatista.serverdrivenui.presentation.cardstack.components.ScaffoldComponent
import com.github.josebatista.serverdrivenui.presentation.cardstack.components.TextComponent
import com.github.josebatista.serverdrivenui.presentation.cardstack.components.TopAppBarComponent
import com.github.josebatista.serverdrivenui.presentation.cardstack.components.VerticalListComponent

object CheckUiType {

    @Composable
    operator fun invoke(data: Data) {
        when (data.type) {
            Type.SCAFFOLD -> ScaffoldComponent(data).Render()
            Type.APP_BAR -> TopAppBarComponent(data).Render()
            Type.VERTICAL_LIST -> VerticalListComponent(data).Render()
            Type.TEXT -> TextComponent(data).Render()
            Type.ROW -> RowComponent(data).Render()
            Type.IMAGE -> ImageComponent(data).Render()
            else -> Unit
        }
    }
}
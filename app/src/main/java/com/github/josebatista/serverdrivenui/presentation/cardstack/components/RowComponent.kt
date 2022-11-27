package com.github.josebatista.serverdrivenui.presentation.cardstack.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.github.josebatista.serverdrivenui.domain.model.ActionType
import com.github.josebatista.serverdrivenui.domain.model.Data
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.Component
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.SetView
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.click

class RowComponent(
    private val data: Data,
) : Component() {

    @Composable
    override fun Render() {
        super.Render()

        val context = LocalContext.current

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .then(
                    if (data.action.type != ActionType.UNKNOWN) {
                        Modifier.clickable {
                            data.action.click(context)
                        }
                    } else {
                        Modifier
                    }
                )
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SetView(data.children)
        }
    }
}
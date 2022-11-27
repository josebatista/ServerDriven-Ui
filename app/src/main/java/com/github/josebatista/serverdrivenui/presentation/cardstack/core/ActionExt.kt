package com.github.josebatista.serverdrivenui.presentation.cardstack.core

import android.content.Context
import android.widget.Toast
import com.github.josebatista.serverdrivenui.domain.model.Action
import com.github.josebatista.serverdrivenui.domain.model.ActionType

fun Action.click(context: Context) {
    when (type) {
        ActionType.NAVIGATE_SCREEN -> {
            TODO("NAVIGATE_SCREEN")
        }
        ActionType.NAVIGATE_WEB_VIEW -> {
            TODO("NAVIGATE_WEB_VIEW")
        }
        ActionType.SHOW_MESSAGE -> {
            Toast.makeText(context, value, Toast.LENGTH_LONG).show()
        }
        ActionType.UNKNOWN -> Unit
    }
}
package com.github.josebatista.serverdrivenui.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.LaunchedEffect
import com.github.josebatista.serverdrivenui.presentation.cardstack.core.SetView
import com.github.josebatista.serverdrivenui.presentation.ui.theme.ServerDrivenUiTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ServerDrivenUiTheme {

                val state = viewModel.state

                LaunchedEffect(Unit) {
                    viewModel.fetchMainUi()
                }

                SetView(state.uiItem)
            }
        }
    }
}

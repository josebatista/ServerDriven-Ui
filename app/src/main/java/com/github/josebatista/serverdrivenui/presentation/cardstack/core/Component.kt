package com.github.josebatista.serverdrivenui.presentation.cardstack.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import com.github.josebatista.serverdrivenui.presentation.cardstack.communicator.Communicator
import com.github.josebatista.serverdrivenui.presentation.cardstack.communicator.CommunicatorImpl
import com.github.josebatista.serverdrivenui.presentation.cardstack.communicator.Subscriber

open class Component : Subscriber, Communicator by CommunicatorImpl {

    @Composable
    open fun Render() {
        DisposableEffect(Unit) {
            attach(this@Component)
            onDispose {
                detach(this@Component)
            }
        }
    }

    override fun receiveEvent(event: String) {}
}
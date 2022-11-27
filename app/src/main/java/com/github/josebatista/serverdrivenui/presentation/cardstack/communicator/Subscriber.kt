package com.github.josebatista.serverdrivenui.presentation.cardstack.communicator

interface Subscriber {
    fun receiveEvent(event: String)
}
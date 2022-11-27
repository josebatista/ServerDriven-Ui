package com.github.josebatista.serverdrivenui.presentation.cardstack.communicator

interface Communicator {
    fun attach(subscriber: Subscriber)
    fun detach(subscriber: Subscriber)
    fun emit(event: String)
}
package com.github.josebatista.serverdrivenui.presentation.cardstack.communicator

object CommunicatorImpl : Communicator {

    private val subscribers = mutableListOf<Subscriber>()

    override fun attach(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    override fun detach(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    override fun emit(event: String) {
        subscribers.forEach {
            it.receiveEvent(event)
        }
    }
}
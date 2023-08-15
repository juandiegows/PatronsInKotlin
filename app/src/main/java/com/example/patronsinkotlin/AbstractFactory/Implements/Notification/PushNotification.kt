package com.example.patronsinkotlin.AbstractFactory.Implements.Notification


class PushNotification: Notification() {
    override fun NotifyUser(message: String) {
        println("Mensaje enviado por Push : $message")
    }
}
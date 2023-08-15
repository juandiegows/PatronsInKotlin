package com.example.patronsinkotlin.AbstractFactory.Implements.Notification


class EmailNotification: Notification() {
    override fun NotifyUser(message: String) {
        println("Mensaje enviado por Email : $message")
    }
}
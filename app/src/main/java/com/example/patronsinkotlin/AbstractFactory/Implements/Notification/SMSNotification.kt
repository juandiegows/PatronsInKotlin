package com.example.patronsinkotlin.AbstractFactory.Implements.Notification


class SMSNotification: Notification() {
    override fun NotifyUser(message: String) {
        println("Mensaje enviado por SMS : $message")
    }
}
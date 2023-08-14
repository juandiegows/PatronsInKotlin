package com.example.patronsinkotlin.FactoryMethod.Implements

import com.example.patronsinkotlin.FactoryMethod.Notification

class PushNotification:Notification {
    override fun NotifyUser(message: String) {
        println("Mensaje enviado por Push : $message")
    }
}
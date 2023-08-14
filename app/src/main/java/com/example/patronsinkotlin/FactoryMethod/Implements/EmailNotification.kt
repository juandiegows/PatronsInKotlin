package com.example.patronsinkotlin.FactoryMethod.Implements

import com.example.patronsinkotlin.FactoryMethod.Notification

class EmailNotification: Notification {
    override fun NotifyUser(message: String) {
        println("Mensaje enviado por Email : $message")
    }
}
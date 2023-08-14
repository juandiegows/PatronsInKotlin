package com.example.patronsinkotlin.FactoryMethod.Implements

import com.example.patronsinkotlin.FactoryMethod.Notification

class SMSNotification: Notification {
    override fun NotifyUser(message: String) {
        println("Mensaje enviado por SMS : $message")
    }
}
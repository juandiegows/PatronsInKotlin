package com.example.patronsinkotlin.AbstractFactory

import com.example.patronsinkotlin.AbstractFactory.Implements.BackUp.BackUp
import com.example.patronsinkotlin.AbstractFactory.Implements.Notification.Notification


abstract class ServiceFactory {

    abstract fun CreateServicioNotification(): Notification
    abstract fun CreateServicioBackUp():BackUp
}
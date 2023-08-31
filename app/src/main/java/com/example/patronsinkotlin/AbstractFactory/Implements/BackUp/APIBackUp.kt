package com.example.patronsinkotlin.AbstractFactory.Implements.BackUp

import com.example.patronsinkotlin.AbstractFactory.Implements.Notification.Notification

class APIBackUp(var notification: Notification):BackUp(notification) {
    override fun createBackUp(): Int {
        //creado copia de seguridad
        this.Notify(notification)
        return 10
    }
}
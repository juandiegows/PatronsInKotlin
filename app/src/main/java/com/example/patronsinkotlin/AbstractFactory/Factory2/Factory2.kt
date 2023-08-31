package com.example.patronsinkotlin.AbstractFactory.Factory2

import com.example.patronsinkotlin.AbstractFactory.Implements.BackUp.BackUp
import com.example.patronsinkotlin.AbstractFactory.Implements.BackUp.DatabaseBackUp
import com.example.patronsinkotlin.AbstractFactory.Implements.Notification.Notification
import com.example.patronsinkotlin.AbstractFactory.Implements.Notification.SMSNotification
import com.example.patronsinkotlin.AbstractFactory.AbstractFactory

class Factory2:AbstractFactory() {
    override fun CreateServicioNotification(): Notification {
       return SMSNotification()
    }

    override fun CreateServicioBackUp(): BackUp {
        println("Backup al database")
        return DatabaseBackUp(CreateServicioNotification())
    }
}
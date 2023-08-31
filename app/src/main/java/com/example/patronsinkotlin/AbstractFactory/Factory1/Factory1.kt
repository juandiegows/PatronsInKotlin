package com.example.patronsinkotlin.AbstractFactory.Factory1

import com.example.patronsinkotlin.AbstractFactory.Implements.BackUp.APIBackUp
import com.example.patronsinkotlin.AbstractFactory.Implements.BackUp.BackUp
import com.example.patronsinkotlin.AbstractFactory.Implements.Notification.EmailNotification
import com.example.patronsinkotlin.AbstractFactory.Implements.Notification.Notification
import com.example.patronsinkotlin.AbstractFactory.AbstractFactory

class Factory1 : AbstractFactory() {
    override fun CreateServicioNotification(): Notification {
        return EmailNotification()
    }

    override fun CreateServicioBackUp(): BackUp {
        println("Backup al api")
       return APIBackUp(CreateServicioNotification())
    }
}
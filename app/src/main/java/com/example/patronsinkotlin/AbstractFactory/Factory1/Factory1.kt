package com.example.patronsinkotlin.AbstractFactory.Factory1

import com.example.patronsinkotlin.AbstractFactory.Implements.BackUp.APIBackUp
import com.example.patronsinkotlin.AbstractFactory.Implements.BackUp.BackUp
import com.example.patronsinkotlin.AbstractFactory.Implements.Notification.EmailNotification
import com.example.patronsinkotlin.AbstractFactory.Implements.Notification.Notification
import com.example.patronsinkotlin.AbstractFactory.ServiceFactory

class Factory1 : ServiceFactory() {
    override fun CreateServicioNotification(): Notification {
        return EmailNotification()
    }

    override fun CreateServicioBackUp(): BackUp {
       return APIBackUp()
    }
}
package com.example.patronsinkotlin.FactoryMethod

import com.example.patronsinkotlin.FactoryMethod.Implements.EmailNotification

fun main(){
    var factory = NotificationFactory()
    var notification:Notification = factory.createNotification(NotificationFactory.Companion.Type.SMS)!!
    var emailNotification:EmailNotification = (factory.createNotification(NotificationFactory.Companion.Type.EMAIL) as EmailNotification?)!!
    notification.NotifyUser("Hello word")
    emailNotification.NotifyUser("Hola")
}
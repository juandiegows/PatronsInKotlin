package com.example.patronsinkotlin.FactoryMethod

import com.example.patronsinkotlin.FactoryMethod.Implements.EmailNotification
import com.example.patronsinkotlin.FactoryMethod.Implements.PushNotification
import com.example.patronsinkotlin.FactoryMethod.Implements.SMSNotification


class NotificationFactory {

    companion object {
        enum class Type(num: Int) {
            SMS(1),
            EMAIL(2),
            PUSH(3)
        }
    }

    fun createNotification(channel: Type? = null): Notification? {
     return   when (channel) {
            Type.SMS -> SMSNotification()
            Type.EMAIL -> EmailNotification()
            Type.PUSH -> PushNotification()
            else -> throw IllegalArgumentException("Unknown channel $channel")
        }
    }
}
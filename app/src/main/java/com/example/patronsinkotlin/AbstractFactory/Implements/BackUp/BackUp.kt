package com.example.patronsinkotlin.AbstractFactory.Implements.BackUp

import com.example.patronsinkotlin.AbstractFactory.Implements.Notification.Notification

abstract class BackUp {
    abstract  fun createBackUp():Int
    fun finish(){
        println("Ha finalizado")
    }
    fun Notify(notification: Notification){
        notification.NotifyUser("se ha creado una copia de seguridad ")
    }
}
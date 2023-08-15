package com.example.patronsinkotlin.AbstractFactory.Implements.Notification

abstract  class Notification {
    abstract fun NotifyUser(message:String)

    fun Finish(){
        println("Finalizar envio de mensaje")
    }

}
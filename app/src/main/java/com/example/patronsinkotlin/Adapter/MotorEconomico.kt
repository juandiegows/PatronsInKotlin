package com.example.patronsinkotlin.Adapter

class MotorEconomico : Motor {
    override fun encender() {
       println("encender desde el motor economico")
    }

    override fun accelerar() {
        println("accelerar desde el motor economico")
    }

    override fun apagar() {
        println("apagar desde el motor economico")
    }
}
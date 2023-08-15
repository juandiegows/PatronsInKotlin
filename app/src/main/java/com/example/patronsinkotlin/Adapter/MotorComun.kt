package com.example.patronsinkotlin.Adapter

class MotorComun : Motor {
    override fun encender() {
     println("Encender motor común")
    }

    override fun accelerar() {
        println("accelerar motor común")
    }

    override fun apagar() {
        println("apagar motor comun")
    }
}
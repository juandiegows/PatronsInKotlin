package com.example.patronsinkotlin.Adapter

class MotorElectricoAdapter(var motorElectrico: MotorElectrico) : Motor {

    override fun encender() {
        motorElectrico.conectar()
        motorElectrico.activar()
    }

    override fun accelerar() {
       motorElectrico.MoverMasRapido()
    }

    override fun apagar() {
       motorElectrico.detener()
        motorElectrico.desconectar()
    }
}
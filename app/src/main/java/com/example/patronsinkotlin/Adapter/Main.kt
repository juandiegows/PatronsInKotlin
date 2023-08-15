package com.example.patronsinkotlin.Adapter

fun main(){
var motor : Motor = MotorComun()
    var motorElectrico= MotorElectrico()
    motor = MotorElectricoAdapter(motorElectrico)
    motor.encender()
    motor.accelerar()
    motor.apagar()
}
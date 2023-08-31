package com.example.patronsinkotlin.AbstractFactory

import com.example.patronsinkotlin.AbstractFactory.Factory1.Factory1
import com.example.patronsinkotlin.AbstractFactory.Factory2.Factory2
import com.example.patronsinkotlin.FactoryMethod.Implements.EmailNotification

fun main() {
    
    var factory: AbstractFactory
    factory = Factory1()
    factory.CreateServicioBackUp().createBackUp()
    factory = Factory2()
    factory.CreateServicioBackUp().createBackUp()


    println("-------------------------------------")


    CreateBackup(Factory1())
    CreateBackup(Factory2())


}

fun CreateBackup(factory: AbstractFactory){
    factory.CreateServicioBackUp().createBackUp()
}
package com.example.patronsinkotlin.AbstractFactory.Implements.BackUp

class DatabaseBackUp:BackUp() {
    override fun createBackUp(): Int {
        //creado copia de seguridad
        return 10
    }
}
package com.example.patronsinkotlin.Singleton

class Class2 {
    fun setVersion(version : Int){
        Singleton.getInstance().version = version
    }
    fun print(){
        println(Singleton.getInstance())
    }
}
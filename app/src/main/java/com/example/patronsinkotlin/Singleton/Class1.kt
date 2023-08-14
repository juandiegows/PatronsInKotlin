package com.example.patronsinkotlin.Singleton

class Class1 {
    fun setName(name : String){
        Singleton.getInstance().name = "version class 1 > $name"
    }
    fun print(){
        println(Singleton.getInstance())
    }
}
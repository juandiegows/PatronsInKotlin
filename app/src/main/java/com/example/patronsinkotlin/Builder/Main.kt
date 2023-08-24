package com.example.patronsinkotlin.Builder

fun main(){
    var pizza : Pizza = Pizza.Builder()
        .crust("uno")
        .size("M")
        .price(20000.0)
        .ingredients("queso", "aceitunas", "carne")
        .build()

    println(pizza)
}
package com.example.patronsinkotlin.composite

fun main(){
    val composite = Composite()

    composite.add(IndividualComposable())
    composite.add(TeamComposable())
    composite.add(IndividualComposable())
    composite.add(TeamComposable())
    println(composite.operation())
}
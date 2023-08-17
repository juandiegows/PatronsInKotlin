package com.example.patronsinkotlin.Decorator

interface Hero
{

    var life: Int
    var attack: Int
    var name: String

    enum class PlaceBody(num: Int) {
        HEAD(1),
        BODY(2),
        CHEST(3)
    }

    fun hurt(placeBody: PlaceBody, attack: Int): Int {

        return when (placeBody) {
            PlaceBody.HEAD -> (attack * 2)
            PlaceBody.CHEST -> attack
            PlaceBody.BODY -> (attack / 2)
        }
    }

    fun attack(
        placeBody: PlaceBody,
        hero: Hero,
        attack: Int = this.hurt(placeBody, this.attack)
    ): Int{
        hero.receiveAttack(placeBody, attack)

        return hero.life
    }

    fun receiveAttack(
        placeBody: PlaceBody,
        attack: Int
    ): Int

    fun lifeless() {
        println("El heroe $name ha muerto")
    }
}

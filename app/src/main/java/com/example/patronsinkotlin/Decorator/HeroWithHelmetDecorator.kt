package com.example.patronsinkotlin.Decorator

class HeroWithHelmetDecorator(var hero: Hero) : Hero {
    override var life: Int = hero.life
    override var attack: Int = hero.attack
    override var name: String = hero.name
    var lifeHelmet: Int = hero.life

    override fun receiveAttack(placeBody: Hero.PlaceBody,  attack: Int): Int {


        if(placeBody == Hero.PlaceBody.HEAD){
            if (lifeHelmet < 0) {
                life =   hero.receiveAttack(placeBody, attack)
            } else {
                lifeHelmet -= attack
                if (lifeHelmet < 0) {
                    life =   hero.receiveAttack(placeBody, lifeHelmet * -1)
                }else {
                    life =  hero.receiveAttack(placeBody, 0)
                }
            }
        }else {
           life = hero.receiveAttack(placeBody, attack)
        }

        return life
    }
}
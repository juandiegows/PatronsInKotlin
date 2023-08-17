package com.example.patronsinkotlin.Decorator

class HeroWithArmoredVestDecorator(var hero:Hero):Hero {

    override var life: Int = hero.life
    override var attack: Int = hero.attack
    override var name: String = hero.name
    var lifeArmoredVest: Int = hero.life

    override fun receiveAttack(placeBody: Hero.PlaceBody, attack: Int): Int {
        if(placeBody == Hero.PlaceBody.CHEST){
            if (lifeArmoredVest < 0) {
                life =   hero.receiveAttack(placeBody, attack)
            } else {
                lifeArmoredVest -= attack
                if (lifeArmoredVest < 0) {
                    life =   hero.receiveAttack(placeBody, lifeArmoredVest * -1)
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
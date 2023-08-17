package com.example.patronsinkotlin.Decorator

class ConcreteHero : Hero {
    override var life: Int = 0
    override var attack: Int = 0
    override var name: String = ""

    constructor(name: String, attack: Int = 20, life: Int = 100) {
        this.name = name;
        this.life = life
        this.attack = attack
    }




    override fun receiveAttack(placeBody: Hero.PlaceBody, attack: Int): Int {

        this.life -= attack
        if(this.life < 0){
            this.lifeless()
        }
        return this.life
    }


}
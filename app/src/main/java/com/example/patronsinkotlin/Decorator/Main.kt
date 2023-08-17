package com.example.patronsinkotlin.Decorator

fun main() {
    var hero: Hero = ConcreteHero("Hero 1", 20, 100)
    var heroEnemy: Hero = ConcreteHero("Hero 2", 30, 100)
    heroEnemy = HeroWithHelmetDecorator(heroEnemy)
    heroEnemy = HeroWithArmoredVestDecorator(heroEnemy)
    println("su vida quedo a ${hero.attack(Hero.PlaceBody.HEAD, heroEnemy)}")
    println("su vida quedo a ${hero.attack(Hero.PlaceBody.CHEST, heroEnemy)}")
}
    package com.example.patronsinkotlin.Singleton

    fun main() {
        var singleton: Singleton = Singleton.getInstance()
        singleton.name = "version beta"
        singleton.version = 2
        Singleton.getInstance().version = 5
        println("Test 1 : $singleton")
        var class1 = Class1()
        class1.setName("Hello word")
        println("Test 2 : $singleton")
        var class2 = Class2()
        class2.setVersion(10)
        class1.print()
        class1.setName("Hello")
        class2.print()
        var singleton2 = singleton
        println("Test 5 : $singleton2")

        singleton2 = Singleton()
        singleton2.version = 2
        singleton.version =5
        println("Test 6 : $singleton2")


        var instacia1 = SingletonObject
        instacia1.name = "version 1"
        instacia1.version = 4
        var instacia2 = SingletonObject
        instacia2.name = "version 3"
        instacia2.version = 3

        println("Test 6 : $instacia1")

    }

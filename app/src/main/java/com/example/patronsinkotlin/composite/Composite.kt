package com.example.patronsinkotlin.composite

class Composite : Composable {

    private val objects = mutableListOf<Composable>()

    fun add(data: Composable) {
        objects.add(data)
    }

    fun remove(data: Composable) {
        objects.remove(data)
    }

    override fun operation() = objects.map { it.operation() }.joinToString(separator = "\n")

}
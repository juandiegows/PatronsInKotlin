package com.example.patronsinkotlin.Builder

class Pizza {
    var size: String? = null
    var crust: String? = null
    var ingredients: List<String>? = null
    var price: Double? = null

    class Builder {
        private val pizza = Pizza()

        fun size(size: String) = apply { pizza.size = size }
        fun crust(crust: String) = apply { pizza.crust = crust }
        fun ingredients(vararg ingredients: String) = apply { pizza.ingredients = ingredients.toList() }
        fun price(price: Double) = apply { pizza.price = price }

        fun build() = pizza
    }

    override fun toString(): String {
        return "Pizza(size=$size, crust=$crust, ingredients=$ingredients, price=$price)"
    }


}
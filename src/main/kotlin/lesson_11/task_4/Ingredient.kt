package org.example.lesson_11.task_4

class Ingredient(val nameOfIngredient: String, val count: Int) {
    var weight: Int = 0

    constructor(
        nameOfIngredient: String,
        count: Int,
        weight: Int,
    ) : this(nameOfIngredient, count) {
        this.weight = weight
    }

    init {
        println("Ингредиенты: $nameOfIngredient")
    }
}
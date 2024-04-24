package org.example.lesson_11.task_4

class Category(
    val nameOfCategory: String,
    val dishes: MutableList<String> = mutableListOf()
) {
    fun addDishes(nameOfDish: String) {
        dishes.add(nameOfDish)
    }

    init {
        println("Блюдо в категории: $nameOfCategory")
    }
}
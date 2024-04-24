package org.example.lesson_11.task_4

class Recipe(
    val nameOfDish: String,
    val mutableListOfIngredients: MutableList<String> = mutableListOf()
) {
    fun addIngredient(ingredient: Ingredient) {
        mutableListOfIngredients.add(ingredient.toString())
    }

    init {
        println("Рецепт блюда: $nameOfDish")
    }
}
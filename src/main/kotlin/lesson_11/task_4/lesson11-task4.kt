package org.example.lesson_11.task_4

fun main() {
    val burgerMushroomsAndCheese = Recipe(
        "Бургер с грибами и сыром",
    )
    println()

    burgerMushroomsAndCheese.addIngredient(Ingredient("яйцо", 2))
    burgerMushroomsAndCheese.addIngredient(Ingredient("сыр", 1, 60))
    burgerMushroomsAndCheese.addIngredient(Ingredient("грибы", 6))
    burgerMushroomsAndCheese.addIngredient(Ingredient("булка", 1))

    println()

    val burgers = Category("Бургеры")
    burgers.addDishes(burgerMushroomsAndCheese.toString())
    println(burgers)
}

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
/*Задача 4 к Уроку 11

Дизайнер предоставил макет Android-приложения:
https://www.figma.com/file/89K5JomHGyIkUFUaBKRBXi/RecipesApp?type=design&node-id=1%3A181&mode=design&t=DsOaqqRfAeCTY2eN-1

Для представленных экранов спроектируй следующие сущности для хранения данных:

- Категория рецепта
- Рецепт
- Ингредиент*/
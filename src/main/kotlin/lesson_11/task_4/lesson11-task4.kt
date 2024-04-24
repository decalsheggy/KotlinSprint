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
/*Задача 4 к Уроку 11

Дизайнер предоставил макет Android-приложения:
https://www.figma.com/file/89K5JomHGyIkUFUaBKRBXi/RecipesApp?type=design&node-id=1%3A181&mode=design&t=DsOaqqRfAeCTY2eN-1

Для представленных экранов спроектируй следующие сущности для хранения данных:

- Категория рецепта
- Рецепт
- Ингредиент*/
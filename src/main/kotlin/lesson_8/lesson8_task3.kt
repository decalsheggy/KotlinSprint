package org.example.lesson_8

fun main() {
    val pancakesIngredients = arrayOf("eggs", "milk", "butter", "flour", "sugar", "salt")
    println("Какой ингридиент вы желаете найти?")

    val ingredient = readln()

    //Метод contains() предназначен для проверки наличия элемента в коллекции.
    if (pancakesIngredients.contains(ingredient)) println("Ингредиент $ingredient в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")
}
/*Используй условие из предыдущей задачи.
Нужно доработать код, который проверяет наличие ингредиента в рецепте.
Однако, не используя цикл для поиска.*/
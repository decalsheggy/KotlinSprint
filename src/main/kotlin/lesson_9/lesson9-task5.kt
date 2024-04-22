package org.example.lesson_9


fun main() {
    println("Введите пять названий ингредиентов:")

    val size = 5
    val ingredients = List(size) { readln() }
    val allIngredients = ingredients
        .toSet()
        .toList()
        .sorted()
        .joinToString(", ")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

    println(allIngredients)

}
/*Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

- результат должен исключать повторы;
- список должен выводиться в алфавитном порядке;
- все элементы списка выведены в одну строку, разделяя слова запятыми;
- !первый элемент должен быть распечатан с заглавной буквы!.*/
package org.example.lesson_9

fun main() {
    val scrambledEggsIng = mutableListOf("butter", "eggs", "tomato")

    println(
        "В рецепте есть базовые ингредиенты: ${scrambledEggsIng.joinToString()}.\n" +
                "Желаете добавить еще (да/нет)?"
    )

    val decision = readln()

    if (decision.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        scrambledEggsIng.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${scrambledEggsIng.joinToString()}.")
    }
}
/*Создай новый список ингредиентов, состоящий из 3 шт. Нужно расширить функционал программы
– пусть у пользователя будет возможность добавить к базовым ингредиентам из списка еще один свой.

- после создания базового списка, выведи его в консоль:
"В рецепте есть базовые ингредиенты: [базовый_список_ингредиентов]";
- затем сообщи о возможности добавить свой: "Желаете добавить еще?” и активировать ввод с консоли;
- если пользователь ввел “нет” или что-то иное – заверши программу,
если пользователь ввел “да” – запроси: "Какой ингредиент вы хотите добавить?";
- добавь считанное значение в базовый список;
- в конце выведи сообщение со списком всех элементов такого типа:
"Теперь в рецепте есть следующие ингредиенты: [список_ингредиентов]".*/
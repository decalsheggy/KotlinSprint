package org.example.lesson_9


fun main() {
    val oneDish = mutableListOf(2, 50, 15)
    println("Сколько порций потребуется?")

    val numberOfDishes = readln().toInt()

    val allDishes = oneDish.map { it * numberOfDishes }

    println(
        "На $numberOfDishes порций вам понадобится:\n" +
        "Яиц – ${allDishes[0]}шт, молока – ${allDishes[1]}мл, сливочного масла – ${allDishes[2]}мл."
    )
}
/*Напиши программу, которая будет рассчитывать сколько потребуется ингредиентов для разного количества порций блюда.
Для примера возьмем рецепт омлета. Для одной порции нужно: яиц – 2шт., молока – 50 мл, сливочного масла – 15 гр.

 – создай список с количеством ингредиентов для 1 блюда
 (где под индексами располагается количество для яиц/молока/масла соответственно);
 – запроси у пользователя количество порций;
 – модернизировать список таким образом, чтобы вывести в консоль сообщение с количеством
 нужных ингредиентов такого типа: “На [количество_порций] порций вам понадобится:
 Яиц – n, молока – n1, сливочного масла – n2]”.*/
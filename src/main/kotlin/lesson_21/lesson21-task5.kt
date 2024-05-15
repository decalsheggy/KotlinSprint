package org.example.lesson_21

import java.util.Random

fun main() {
    val categories =
        mapOf(
            "Ловкость" to 10,
            "Интеллект" to 14,
            "Мудрость" to 14,
            "Харизма" to 19,
            "Сила" to 10,
            "Телосложение" to 13,
        )
    println(categories.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? {
    val maxValue = this.maxByOrNull { it.value }?.value
    val maxKeys = this.filter { it.value == maxValue }.keys.toList()

    return if (maxKeys.isNotEmpty()) maxKeys[Random().nextInt(maxKeys.size)] else null
}
/*Игра имеет систему прокачки персонажей по различным навыкам. Опыт в каждом навыке хранится в виде пары
ключ-значение, где ключ — это название навыка (String), а значение — количество очков опыта (Int).

Создай extension функцию для интерфейса Map с названием maxCategory, которая будет возвращать название навыка,
в котором у игрока наибольшее количество очков опыта.
Если два или более навыка имеют одинаковое максимальное значение, функция должна возвращать любой из них.*/
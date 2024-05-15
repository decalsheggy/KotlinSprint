package org.example.lesson_21

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(list.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    for (i in this) {
        if (i % 2 == 0)
            sum += i
    }
    return sum
}
/*Создай extension функцию evenNumbersSum для списка чисел,
которая будет возвращать сумму всех четных чисел в списке.*/
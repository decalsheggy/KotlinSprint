package org.example.lesson_16

import java.util.Random

const val MIN = 1
const val MAX = 6
fun main() {
    val a = Dice()
    a.printInfo()
}

class Dice {
    private val randomNumber = Random().nextInt(MIN, MAX + 1)

    fun printInfo() {
        println("Выпало число: ${randomNumber}")
    }
}
/*На игральном кубике может выпасть одно число от 1 до 6.

Создай класс кубика, в котором будет проинициализировано одно поле со случайным числом.
Единственный способ узнать это число – вызвать специальный метод, который напечатает информацию в консоль*/
package org.example.lesson_5

import java.util.random.RandomGenerator
import kotlin.random.Random

fun main(){
    println("Придумайте 3 числа:")

    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()

    val userRandomNumbers = listOf<Int>(first, second, third)
    println("Ваши числа: $userRandomNumbers.")

    val sistemRandomNumbers = mutableListOf<Int>()

    repeat(3){
        val sistemRandomNumber = Random.nextInt(43)
        sistemRandomNumbers.add(sistemRandomNumber)
    }

    val checking = userRandomNumbers.intersect(sistemRandomNumbers).size
    println("Найдено совпадений: $checking")

    if (checking == 3) println("Вы выиграли джекпот!")
    if (checking == 2) println("Вы выиграли крупный приз!")
    if (checking == 1) println("Вы получили утешительный приз!")
    else println("Вы не угадали ни одного числа.")

    println("Выиграшные числа: $sistemRandomNumbers.")
}
/*Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42.
Пользователь вводит числа через консоль.

Требования к программе:

- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке.
- Поочередно введенные пользователем числа должны также храниться в списке.
- Для определения совпадений используй метод intersect() и сохрани размер
полученной коллекции в отдельную переменную.

В зависимости от количества угаданных чисел программа выводит результат:

- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
- Если угадано одно число, пользователю выплачивается утешительный приз.
- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
- В конце игры вне зависимости от результата программа выводит выигрышные числа*/
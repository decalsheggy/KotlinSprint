package org.example.lesson_5

fun main() {
    val number1 = 1
    val number2 = 4

    println("Введите значение суммы $number1 + $number2:")

    val sum = readLine()?.toInt()

    if(sum == (number1 + number2)) println("Добро пожаловать!") else println("Доступ запрещен.")
}
/*Нужно написать часть модуля для авторизации пользователя.
Для входа в приложение пользователь должен доказать, что он не бот.
Для этого программа предлагает решить простой математический пример
– сложить два числа (сообщить об этом пользователю).

Имитируй эти действия в консоли, путем считывания данных с клавиатуры.
При успешном решении вход в программу символизируется сообщением “Добро пожаловать!".
В противном случае вывести сообщение "Доступ запрещен."*/
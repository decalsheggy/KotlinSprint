package org.example.lesson_6

import kotlin.random.Random

fun main(){
    var numberOfTries = 3

    while (numberOfTries > 0) {
        val firstRandomNum = Random.nextInt(1, 9)
        val secondRandomNum = Random.nextInt(1, 9)

        val sum = firstRandomNum + secondRandomNum
        println("Решите пример: $firstRandomNum + $secondRandomNum = ")

        if (sum == readln().toInt()) {
            println("Добро пожаловать!")
            return
        }
        else {
            numberOfTries --
            println("Осталось попыток: $numberOfTries")
        }
    }
   print("Доступ запрещен.")
}
/*Доработка задачи на авторизацию. Нужно написать часть модуля для авторизации пользователя.
Для входа в приложение пользователь должен доказать, что он не бот. Для этого программа
предлагает решить простой математический пример – сложить два числа. Имитируй эти действия
в консоли, путем считывания данных с клавиатуры.

При успешном решении вход в программу символизируется сообщением “Добро пожаловать!".
Дай пользователю три попытки пройти тест. Для этого придется каждый раз генерировать
новый математический пример и предлагать решить его заново.

Для простоты ограничься примерами на сложение с использованием цифр от 1 до 9.
Если три попытки оказались неудачными, вывести сообщение "Доступ запрещен".*/
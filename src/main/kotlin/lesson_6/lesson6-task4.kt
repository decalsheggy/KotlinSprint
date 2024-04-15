package org.example.lesson_6

import kotlin.random.Random

fun main() {
    println("Угадайте число от 1 до 9, у вас есть 5 попыток:")

    val secretNumber = Random.nextInt(1, 9)
    var numberOfTries = 5

    while (numberOfTries > 0) {
        val guessNumber = readln().toInt()

        if (guessNumber == secretNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно:(")
        }
        numberOfTries--
        println("У вас осталось попыток: $numberOfTries")
    }
    println("Было загадано число $secretNumber")
}
/*Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9.
Игроку дается 5 попыток, чтобы угадать это число.

 – если игрок угадывает число, выводится сообщение
 “Это была великолепная игра!” и программа завершает работу;
 – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение
 и оставшееся количество попыток;
 – после истечения попыток выводится сообщение “Было загадано число N”.*/
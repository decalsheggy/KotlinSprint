package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val playersRandomDice = throwDice()
    println("Игрок выбросил: $playersRandomDice")

    val computersRandomDice = throwDice()
    println("Компьютер выбросил: $computersRandomDice")

    if (playersRandomDice > computersRandomDice) println("Слава цивилизации человечества!")
    else if (playersRandomDice == computersRandomDice) println("Победителя нет.")
    else println("Плоть слаба. Да здравствует Бог-Машины!")
}

fun throwDice(): Int {
    val randomDice = Random.nextInt(1, 7)
    return randomDice
}
/*Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число.

- поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
- бросок кости вынеси в отдельную функцию, в которой генерируется случайное число от 1 до 6;
- в отдельные переменные сохрани результат работы функции для игрока и компьютера;
- после сравнения результатов, выведи соответствующее сообщение в консоль. Например: "Победило человечество"
или "Победила машина".*/
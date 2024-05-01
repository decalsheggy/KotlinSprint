package org.example.lesson_10

import kotlin.random.Random

fun main() {
    var numberOfWins = 0
    var gameOn = true

    while (gameOn) {
        val playersRandomDice = throwDice()
        println("Игрок: $playersRandomDice")

        val computersRandomDice = throwDice()
        println("Машина: $computersRandomDice")

        if (playersRandomDice > computersRandomDice) {
            println("Победа человечества!")
            numberOfWins++
        } else if (playersRandomDice == computersRandomDice) println("Победителей нет.")

        else println("Победа машин!")

        gameOn = startTheRound()
    }
    println("Ваше число побед: $numberOfWins")
}

fun throwDice1(min: Int = 1, max: Int = 6): Int {

    return Random.nextInt(min, max + 1)
}

fun startTheRound(): Boolean {
    println("Попытать удачу снова?")
    val repeat = readln()
    return repeat.equals("да", true)
}
/*Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости. Побеждает выбросивший
наибольшее число. Теперь дай возможность пользователю играть до тех пор пока ему не надоест.
В конце программа должна вывести сколько партий он выиграл.

- после первого раунда программа задает вопрос: “Хотите бросить кости еще раз? Введите Да или Нет”;
- программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом количества
выигрышных партий человека;
- в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков);
- основная логика программы должна находиться в main(), а 2 другие функции будут вспомогательными.*/
package org.example.lesson_18

import kotlin.random.Random

fun main() {
    val diceFour: Dice = DiceFour()
    val diceSix: Dice = DiceSix()
    val diceEight: Dice = DiceEight()

    val dices: List<Dice> = listOf(diceFour, diceSix, diceEight)
    for (d in dices) {
        d.throwDice()
    }
}

open class Dice(numberOfFaces: Int) {
    open fun throwDice() {}
}

class DiceFour(numberOfFaces: Int = 4) : Dice(numberOfFaces) {
    override fun throwDice() {
        val randomNumber = Random.nextInt(1, 4 + 1)
        println("На 1к4 выпало число: $randomNumber")
    }
}

class DiceSix(numberOfFaces: Int = 6) : Dice(numberOfFaces) {
    override fun throwDice() {
        val randomNumber = Random.nextInt(1, 6 + 1)
        println("На 1к6 выпало число: $randomNumber")
    }
}

class DiceEight(numberOfFaces: Int = 8) : Dice(numberOfFaces) {
    override fun throwDice() {
        val randomNumber = Random.nextInt(1, 8 + 1)
        println("На 1к8 выпало число: $randomNumber")
    }
}
/*В игре используются типы игральных костей с разным количеством граней: 4, 6 и 8.

Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен быть метод,
бросающий кость и печатающий значение в консоль.

Для демонстрации полиморфизма “включения”:

- создай несколько объектов с разными гранями;
- собери из них список объектов, указав тип списка;
- выполни итерацию по списку и вызови у каждого объекта метод броска кости.*/
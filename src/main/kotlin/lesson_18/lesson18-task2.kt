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

open class Dice(private val numberOfFaces: Int) {
    open fun throwDice() {
        val randomNumber = Random.nextInt(1, numberOfFaces + 1)
        println("На 1к$numberOfFaces выпало число: $randomNumber")
    }
}

class DiceFour : Dice(4) {
    override fun throwDice() {
        super.throwDice()
    }
}

class DiceSix : Dice(6) {
    override fun throwDice() {
        super.throwDice()
    }
}

class DiceEight : Dice(8) {
    override fun throwDice() {
        super.throwDice()
    }
}
/*В игре используются типы игральных костей с разным количеством граней: 4, 6 и 8.

Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен быть метод,
бросающий кость и печатающий значение в консоль.

Для демонстрации полиморфизма “включения”:

- создай несколько объектов с разными гранями;
- собери из них список объектов, указав тип списка;
- выполни итерацию по списку и вызови у каждого объекта метод броска кости.*/
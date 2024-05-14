package org.example.lesson_19

fun main() {
    val spaceShip = SpaceShip()

    try {
        spaceShip.takeOff()
    } catch (e: NotImplementedError) {
        println(e.message)
    }
    spaceShip.landOn()
    spaceShip.shootBack()
}

class SpaceShip {
    fun takeOff() {
        throw NotImplementedError("Эта функция еще не реализована.")
    }

    fun landOn() {
        println("Совершить приземление.") //TODO(): добавить счетчик до приземления
    }

    fun shootBack() {
        println("Отстреливаться от приближающегося астероида.")
    }
}
/*В игре есть космический корабль. Он может взлетать, приземляться и отстреливаться от астероида.

Задача описать класс и его методы. Требуемая реализация методов нам пока неизвестна.
Один из методов должен содержать явную пометку-напоминание о том,
что здесь нужна информация о дополнительной логике.
Другой метод должен вызывать падение программы с ошибкой NotImplementedError.*/
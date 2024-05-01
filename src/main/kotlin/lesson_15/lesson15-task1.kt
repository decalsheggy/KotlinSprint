package org.example.lesson_15

fun main() {
    val crucian = Crucian()
    crucian.swim()

    val seagull = Seagull()
    seagull.swim()
    seagull.fly()

    val duck = Duck()
    duck.swim()
    duck.fly()
}

interface FlyingCreatures {
    fun fly()
}

interface SwimmingCreatures {
    fun swim()
}

class Crucian() : SwimmingCreatures {
    override fun swim() {
        println("Карась умеет плавать.")
    }
}

class Seagull() : SwimmingCreatures, FlyingCreatures {
    override fun swim() {
        println("Чайка умеет плавать и нырять.")
    }

    override fun fly() {
        println("Чайка умеет летать.")
    }
}

class Duck() : SwimmingCreatures, FlyingCreatures {
    override fun swim() {
        println("Утка умеет хорошо плавать.")
    }

    override fun fly() {
        println("Утка умеет летать.")
    }
}

/*В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.

- создай интерфейсы с методами передвижения для: карась, чайка, утка;
- создай для каждого существа классы, реализующие соответствующие интерфейсы;
- выведи сообщения в консоль, о том как они могут передвигаться.*/
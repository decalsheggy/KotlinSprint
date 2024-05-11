package org.example.lesson_19

fun main() {
    val fishes = enumValues<Fishes>().toList()
    println("Доступные рыбы для добавления в аквариум: ${fishes.joinToString { it.nameOfFish }}.")
}

enum class Fishes(val nameOfFish: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FISH("петушок"),
}

/*В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish),
петушок (Siamese fighting fish). Напиши enum класс, перечисляющий этих рыб.
Сообщи пользователю, каких рыб он может добавить в свой аквариум, распечатав список в консоль.*/
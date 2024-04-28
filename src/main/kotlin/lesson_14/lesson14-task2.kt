package org.example.lesson_14

fun main() {
    val liner = LinerSpaceship1()
    liner.printDetails1()
    liner.loadTheShip()

    val cargo = CargoSpaceship1()
    cargo.printDetails1()
    cargo.loadTheShip()

    val icebreaker = IcebreakerSpaceship1()
    icebreaker.printDetails1()
    icebreaker.loadTheShip()
}

open class LinerSpaceship1(
    val typeOfShip: String = "лайнер",
    val capacity: Int = 30000,
    val loadCapacity: Int = 9000,
    val speed: Int = 15,
    val isBreakingTheIce: Boolean = false,
) {
    open fun printDetails1() {
        println(
            "Свойства корабля типа $typeOfShip: " +
                    "\nвместительность - $capacity пассажиров" +
                    "\nгрузоподъемность - $loadCapacity тонн" +
                    "\nскорость - $speed световых лет в сутки"
        )
    }

    open fun loadTheShip() {
        println("Выдвинуть горизонтальный трап со шкафута.")
    }
}

class CargoSpaceship1(
    typeOfShip: String = "грузовой",
    capacity: Int = 3000,
    loadCapacity: Int = 80000,
    speed: Int = 10,
) : LinerSpaceship1(typeOfShip, capacity, loadCapacity, speed) {
    override fun loadTheShip() {
        println("Активировать погрузочный кран.")
    }
}

class IcebreakerSpaceship1(
    typeOfShip: String = "ледокол",
    capacity: Int = 5000,
    loadCapacity: Int = 15000,
    speed: Int = 5,
    isBreakingTheIce: Boolean = true,
) : LinerSpaceship1(typeOfShip, capacity, loadCapacity, speed, isBreakingTheIce) {

    override fun printDetails1() {
        super.printDetails1()
        println("способен колоть лёд")
    }

    override fun loadTheShip() {
        println("Открыть ворота со стороны кормы.")
    }
}
/*Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.

Каждый тип корабля обладает уникальным способом погрузки:

- лайнер выдвигает горизонтальный трап со шкафута;
- грузовой корабль активирует погрузочный кран;
- ледокол открывает ворота со стороны кормы.

Реализуй методы погрузки, специфичные для каждого вида корабля.

Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.*/
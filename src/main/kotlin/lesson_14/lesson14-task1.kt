package org.example.lesson_14

fun main() {
    val liner = LinerSpaceship()
    liner.printDetails()

    val cargo = CargoSpaceship()
    cargo.printDetails()

    val icebreaker = IcebreakerSpaceship()
    icebreaker.printDetails()
}

open class LinerSpaceship(
    val typeOfShip: String = "лайнер",
    val capacity: Int = 30000,
    val loadCapacity: Int = 9000,
    val speed: Int = 15,
    val isBreakingTheIce: Boolean = false,
) {
    open fun printDetails() {
        println(
            "Свойства корабля типа $typeOfShip: " +
                    "\nвместительность - $capacity пассажиров" +
                    "\nгрузоподъемность - $loadCapacity тонн" +
                    "\nскорость - $speed световых лет в сутки"
        )
    }
}

class CargoSpaceship(
    typeOfShip: String = "грузовой",
    capacity: Int = 3000,
    loadCapacity: Int = 80000,
    speed: Int = 10,
) : LinerSpaceship(typeOfShip, capacity, loadCapacity, speed) {}

class IcebreakerSpaceship(
    typeOfShip: String = "ледокол",
    capacity: Int = 5000,
    loadCapacity: Int = 15000,
    speed: Int = 5,
    isBreakingTheIce: Boolean = true,
) : LinerSpaceship(typeOfShip, capacity, loadCapacity, speed, isBreakingTheIce) {

    override fun printDetails() {
        super.printDetails()
        println("способен колоть лёд")
    }
}
/*В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол.
Все корабли построены на основе лайнера, но у каждого свой функционал и дополнительные свойства.

У грузовых скорость меньше, а грузоподъемность больше. У ледоколов ниже и скорость, и вместительность,
но они могут колоть лёд. Лайнер может вмещать наибольшее количество пассажиров.

- спроектируй иерархию классов со значениями по умолчанию для каждого типа корабля;
- создай по 1 экземпляру каждого типа корабля.
*/
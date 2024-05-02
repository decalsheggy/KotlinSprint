package org.example.lesson_15

fun main() {
    val passengerCar1 = PassengerCar()
    passengerCar1.move()
    passengerCar1.passengersTransportation(3)

    val passengerCar2 = PassengerCar()
    passengerCar2.move()
    passengerCar2.passengersTransportation(3)

    val cargoCar = CargoCar()
    cargoCar.move()
    cargoCar.passengersTransportation(0)
    cargoCar.cargoTransportation(2.0)

    val allPassengers = passengerCar1.maxPassengers + passengerCar2.maxPassengers
    val allCargo = cargoCar.maxWeightOfCargo

    println("Всего перевезено $allPassengers пассажиров и $allCargo тонны груза.")
}

abstract class Car(
    override var currentPassengers: Int = 0,
    override val maxPassengers: Int = 3,
) : Moveable, PassengersTransportation {
    override fun move() {
        println("Поездка началась.")
    }

    override fun passengersTransportation(number: Int) {
        if ((currentPassengers + number) <= maxPassengers && (currentPassengers + number) != 0) {
            currentPassengers += number
            println("Пассажиры перевезены $currentPassengers.")
        } else if (number == 0) println("В машине пассажиров нет.")
        else println("Пассажиры не поместятся.")
    }
}

class PassengerCar(
    override var currentPassengers: Int = 0,
    override val maxPassengers: Int = 3,
) : Car()

class CargoCar(
    override var currentPassengers: Int = 0,
    override var currentWeightOfCargo: Double = 0.0,
    override val maxPassengers: Int = 1,
    override val maxWeightOfCargo: Double = 2.0,
) : Car(), CargoTransportation {
    override fun cargoTransportation(number: Double) {
        if (currentWeightOfCargo + number <= maxWeightOfCargo) {
            currentWeightOfCargo += number
            println("Груз весом $currentWeightOfCargo тонн перевезен.")
        } else println("Вес груза превышен.")
    }
}

interface Moveable {
    fun move()
}

interface PassengersTransportation {
    val currentPassengers: Int
    val maxPassengers: Int
    fun passengersTransportation(number: Int)
}

interface CargoTransportation {
    val currentPassengers: Int
    val maxPassengers: Int
    val currentWeightOfCargo: Double
    val maxWeightOfCargo: Double
    fun cargoTransportation(number: Double)
}
/*В логике мобильной игры есть грузовые и легковые автомобили с такими параметрами:

- грузовые машины могут перевозить одного пассажира и 2 тонны груза;
- легковые не перевозят груз, но могут вместить до 3 пассажиров.

Создай интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.

- учитывай максимальное и текущее количество перевозимых людей или грузов;
- интерфейсы должны содержать методы загрузки и разгрузки пассажиров или грузов.

Спроектируй классы и несколько объектов. Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.
- одна грузовая и две пассажирских

{
        println("Перевозка пассажиров.")
    }
{
        println("Начать поездку.")
    }
    {
        println("Перевозка грузов.")
    }

*/
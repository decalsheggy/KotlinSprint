package org.example.lesson_17

fun main() {
    val package1 = Package(7435, "Иркутск")
    println("Начальное местоположение посылки №${package1.number}: ${package1.location}.")

    package1.location = "Байкальск"
    println("Посылка №${package1.number} прибыла в ${package1.location}.")
    println("Счетчик перемещений: ${package1.counter}.")

    package1.location = "Красноярск"
    println("Посылка №${package1.number} прибыла в ${package1.location}.")
    println("Счетчик перемещений: ${package1.counter}.")
}

class Package(
    val number: Int,
    private var currentLocation: String,
    var counter: Int = 0,
) {
    var location: String
        get() = currentLocation
        set(value) {
            if (value != currentLocation) {
                currentLocation = value
                counter++
            }
        }
}

/*Каждый раз, когда посылка прибывает в промежуточный пункт обработки,
в программе меняется её местоположение. Опиши класс посылки с такими вводными:

- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.

Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика.
При реализации использовать сеттер*/
package org.example.lesson_17

fun main() {
    val ship = Ship("Гидра", 30, "Звон цепей")
    ship.shipName = "Посейдон"

    println("Корабль ${ship.name}, со средней скоростью ${ship.averageSpeed} " +
            "морских узлов, пришвартовался к пристани \"${ship.portName}\".")
}

class Ship(
    val name: String,
    var averageSpeed: Int,
    var portName: String,
) {
    var shipName = name
        set(value) {
            println("Попытка изменить \"$field\" на \"$value\". Название неизменно!")
        }
}
/*Опиши класс для корабля в мобильной игре. Поля хранят имя, среднюю скорость и порт приписки.

Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.

Создай экземпляр класса и протестируй работу.*/
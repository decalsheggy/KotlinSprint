package org.example.lesson_14

fun main() {
    val satellite1 = Satellite("deimos")
    val satellite2 = Satellite("phobos")

    val listOfSatellites = mutableListOf<Satellite>()
    listOfSatellites.add(satellite1)
    listOfSatellites.add(satellite2)
    val planet1 = Planet("Mars", listOfSatellites)

    println("У планеты ${planet1.nameOfBody} есть спутники: " +
            "${planet1.listOfSatellites.joinToString { it.nameOfBody }}."
    )
}

open class SpaceBody(
    val nameOfBody: String,
    val presenceOfAtmosphere: Boolean = true,
    val comeDown: Boolean = true
)

class Planet(
    nameOfBody: String,
    val listOfSatellites: MutableList<Satellite>,
    presenceOfAtmosphere: Boolean = true,
    comeDown: Boolean = false,
) : SpaceBody(nameOfBody, presenceOfAtmosphere, comeDown)

class Satellite(
    nameOfBody: String,
    presenceOfAtmosphere: Boolean = false,
    comeDown: Boolean = false
) : SpaceBody(nameOfBody, presenceOfAtmosphere, comeDown)

/*В компьютерной игре существуют планеты. У некоторых из них есть спутники.

Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.

Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.

- планета должна хранить список спутников.

Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников*/
package org.example.lesson_22

import java.time.LocalDateTime

fun main() {
    val place = GalacticGuide(
        "Альфа Центавра",
        """Альфа Центавра — это ближайшая к Земле звездная система, состоящая из трех звезд: 
            |Альфа Центавра A - её масса чуть больше солнечной, и она является ярчайшей звездой в системе; 
            |Альфа Центавра B - эта звезда меньше и холоднее, чем Альфа Центавра A; 
            |Проксима Центавра - это красный карлик, значительно меньше и холоднее основных звезд системы.""".trimMargin(),
        null,
        4.367
    )
    val nameOfPlaceOrEvent = place.component1()
    val descriptionOfPlaceOrEvent = place.component2()
    val timeOfEvent = place.component3()
    val distance = place.component4()

    println("Название места: $nameOfPlaceOrEvent")
    println("Описание места: $descriptionOfPlaceOrEvent")
    println("Время события: ${timeOfEvent ?: "Дата и время отсутствуют"}")
    println("Расстояние: $distance световых лет")
}

data class GalacticGuide(
    val nameOfPlaceOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val timeOfEvent: LocalDateTime?,
    val distance: Double,
)

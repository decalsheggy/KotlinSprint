package org.example.lesson_22

import java.time.LocalDateTime

fun main() {
    val place = GalacticGuide(
        "Альфа Центавра",
        """Альфа Центавра — это ближайшая к Земле звездная система, состоящая из трех звезд: 
            |Альфа Центавра A - её масса чуть больше солнечной, и она является ярчайшей звездой в системе; 
            |Альфа Центавра B - эта звезда меньше и холоднее, чем Альфа Центавра A; 
            |Проксима Центавра - это красный карлик, значительно меньше и холоднее основных звезд системы.""".trimMargin(),
        LocalDateTime.of(2024, 5, 17, 15, 30),
        4.367
    )
    val (nameOfPlaceOrEvent, descriptionOfPlaceOrEvent,timeOfEvent,distance) = place

    println("Название места: $nameOfPlaceOrEvent")
    println("Описание места: $descriptionOfPlaceOrEvent")
    println("Время события: $timeOfEvent")
    println("Расстояние (в световых годах): $distance")
}

data class GalacticGuide(
    val nameOfPlaceOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val timeOfEvent: LocalDateTime,
    val distance: Double,
)
/*В Путеводитель для путешествующих автостопом по Галактике добавляется
информация о месте или событии в галактике в виде объектов.

Создай data class GalacticGuide cо свойствами:

- название места или события;
- описание места или события;
- дата и время события;
- расстояние места или события от Земли в световых годах.

Создай объект с информацией о звездной системе Alpha Centauri.
Выведи информацию о месте, используя компонентные функции data class.*/
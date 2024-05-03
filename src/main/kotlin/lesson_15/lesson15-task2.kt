package org.example.lesson_15

fun main() {
    val temperature = Temperature(5)
    val precipitation = PrecipitationAmount(2.1)

    val weatherServer = WeatherServer()
    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitation)
}

abstract class WeatherStationStats

class Temperature(val temp: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitation: Double) : WeatherStationStats()

class WeatherServer {
    fun sendMessage(i: WeatherStationStats) {
        when (i) {
            is Temperature -> println("Температура: ${i.temp} °C")
            is PrecipitationAmount -> println("Количество осадков: ${i.precipitation} мм.")
        }
    }
}

/*Необходимо разработать простую систему мониторинга погодных условий,
которая будет собирать данные о температуре и количестве осадков.

Создай абстрактный класс WeatherStationStats. Он будет служить родителем
для классов-объектов погодных данных: Temperature и PrecipitationAmount.

Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer. Метод отправки сообщения
должен определять тип переданного сообщения и в зависимости от результата передавать соответствующие данные.

Создай по одному объекту для разных типов погодных данных и протестируй работу программы.*/
package org.example.lesson_12

fun main() {
    WeatherData1(285, 292, false)
}

  class WeatherData1(_nightWeather: Int, _dayWeather: Int, _rainDuringTheDay: Boolean) {
    val nightWeather = _nightWeather - 273
    val dayWeather = _dayWeather - 273
    val rainDuringTheDay = _rainDuringTheDay

    init {
        println(
            "Погода ночью: $nightWeather°C, погода днем: $dayWeather°C, " +
                    "осадки: $rainDuringTheDay."
        )
    }
}
/*Измени программу таким образом, чтобы информация о погоде
выводилась в консоль сразу при создании объекта.*/
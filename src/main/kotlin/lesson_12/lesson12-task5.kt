package org.example.lesson_12

import java.util.Random

fun main() {
    val allDays = mutableListOf<WeatherData>()

    for (i in 1..30) {
        val day = Random().nextInt(285, 295)
        val night = Random().nextInt(280, 290)
        val rain = Random().nextBoolean()

        val weather = WeatherData(night, day, rain)
        allDays.add(weather)
    }

    val averageNight = allDays
        .map { it.nightWeather.toDouble()}
        .average()
        .toInt()
    println("Среднемесячная погода ночью: $averageNight°C.")

    val averageDay = allDays
        .map { it.dayWeather.toDouble() }
        .average()
        .toInt()
    println("Среднемесячная погода днем: $averageDay°C.")

    val numberOfRainDays = allDays.count { it.rainDuringTheDay }
    println("Всего дождливых дней в этом месяце: $numberOfRainDays.")
}

class WeatherData(_nightWeather: Int, _dayWeather: Int, _rainDuringTheDay: Boolean) {
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
/*Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения
температур и считать количество дней с осадками за месяц.
Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.
- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса,
передав в конструкторы случайные значения;
- сохрани в отдельные списки дневные и ночные температуры, а также список дней с осадками;
- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции
из стандартной библиотеки;
- посчитай количество дней с осадками.

Выведи результаты в консоль.*/
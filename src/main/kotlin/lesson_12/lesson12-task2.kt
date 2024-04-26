package org.example.lesson_12

fun main() {
    val weather = dayWeather(5, 10, true)
    weather.printData()
}

class dayWeather(_nightWeather: Int, _dayWeather: Int, _rainDuringTheDay: Boolean) {
    val nightWeather = _nightWeather
    val dayWeather = _dayWeather
    val rainDuringTheDay = _rainDuringTheDay

    fun printData() {
        println("Погода ночью: $nightWeather°C, погода днем: $dayWeather°C, осадки: $rainDuringTheDay.")
    }
}
/*Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- перепиши его, используя определение свойств в основном конструкторе;
- свойства не должны содержать значения по умолчанию (мы создаем каркас сущности для будущих объектов).

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.*/
package org.example.lesson_12

fun main() {
    val day1 = OneDayWeather()
    day1.nightWeather = 7
    day1.dayWeather = 16
    day1.rainDuringTheDay
    day1.printData()

    val day2 = OneDayWeather()
    day2.nightWeather = 9
    day2.dayWeather = 20
    day2.rainDuringTheDay = false
    day2.printData()
}

class OneDayWeather() {
    var nightWeather = 5
    var dayWeather = 15
    var rainDuringTheDay = true

    fun printData() {
        println("Погода ночью: $nightWeather°C, погода днем: $dayWeather°C, осадки: $rainDuringTheDay.")
    }
}


/*Программа отслеживает погоду по дням. Создай класс для хранения данных
о температуре и осадках для одного дня.

Объекты класса будут хранить:

- дневная температура;
- ночная температура;
- наличие осадков в течение суток.

Создай два объекта, присвой им произвольные
данные и выведи в консоль одним методом созданного класса.

- в классе создай переменные и проинициализируй их какими-нибудь значениями;
- затем в созданных объектах подставь другие значения этим переменным.

В этой задаче используй пустой конструктор*/
package org.example.lesson_12

fun main(){
    val weather = allDayWeather(285, 292, false)
    weather.printData()
}

class allDayWeather(_nightWeather: Int, _dayWeather: Int, _rainDuringTheDay: Boolean) {
    val nightWeather = _nightWeather - 273
    val dayWeather = _dayWeather - 273
    val rainDuringTheDay = _rainDuringTheDay

    fun printData() {
        println("Погода ночью: $nightWeather°C, погода днем: $dayWeather°C, " +
                "осадки: $rainDuringTheDay.")
    }
}
/*Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- в этой задаче используй первичный конструктор без выделения памяти под свойства;
- поля должны быть объявлены и проинициализированы в теле класса;
- все поля с температурой должны иметь тип Int;
- программа не должна иметь других функций, кроме метода вывода информации о погоде.

В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются
данные в Цельсиях.

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.*/
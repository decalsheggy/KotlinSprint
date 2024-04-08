package org.example.lesson2

const val HOUR_TO_MIN = 60

fun main(){
    val timeTrainLeft: Int = 9 * HOUR_TO_MIN + 39
    val travelTimeMin: Int = 457

    val hourTrainCome = (timeTrainLeft + travelTimeMin) / HOUR_TO_MIN
    val minTrainCome = (timeTrainLeft + travelTimeMin) % HOUR_TO_MIN

    println("$hourTrainCome - часов, $minTrainCome - минут")

    val timeTrainCome = String.format("%02d:%02d", hourTrainCome,minTrainCome)

    println("Время прибытия поезда - $timeTrainCome.")

}
/* Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути,
а время прибытия вычисляется из них. Сервер прислал данные,
что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль. */
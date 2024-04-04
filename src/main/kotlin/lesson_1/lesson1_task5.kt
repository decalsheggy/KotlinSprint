package org.example.lesson_1


const val SEC_MIN_HOUR = 60

fun main() {
    val secInSpace = 6480
    val minInSpace = secInSpace / SEC_MIN_HOUR
    val hoursInSpace = minInSpace / SEC_MIN_HOUR

    val restSec = secInSpace % SEC_MIN_HOUR
    val restMin = minInSpace % SEC_MIN_HOUR

    val allTime = String.format("%02d:%02d:%02d", hoursInSpace, restMin, restSec)

    println("Время, проведенное в космосе $allTime.")
}
/*  Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
- Переведи в коде количество секунд в целые минуты и целые часы,
сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами. */
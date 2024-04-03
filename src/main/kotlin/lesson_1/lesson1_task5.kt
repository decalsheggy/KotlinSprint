package org.example.lesson_1

fun main(){
    val howManySec = 6480
    val howManyMin = howManySec / 60
    val howManyHours = howManyMin / 60
    val restSec = howManySec % 60
    val restMin = howManyMin % 60
    println("время, проведенное в космосе: $howManyHours:$restMin:$restSec")
}
/* Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы,
сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами. */
package org.example.lesson_8

fun main(){
    val views = intArrayOf(3144,5645,7657,5454,7874,3445,5436)
    var sum = 0
    for (i in views){
        sum += i
    }
    println("Всего просмотров за неделю было: $sum")
}
/*Скрипт считает количество просмотров рекламы за день. Напиши программу, которая сохраняет в массив
данные просмотров за неделю (числа использовать на свое усмотрение). Каждая ячейка хранит количество
просмотров за день. Имея массив с данными, нужно посчитать сколько всего было просмотров за неделю.
Результат вычислений выведи в консоль.*/
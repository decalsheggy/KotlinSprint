package org.example.lesson_7

fun main() {
    println("Введите любое число:")
    val number = readln().toInt()

    println("Четные числа от 0 до $number:")

    for (i in 0..number step 2) {
        println(i)
    }
}
/*Создай программу, которая выводит все чётные числа от нуля до числа, введенного пользователем.
Сначала нужно вывести в консоль запрос на ввод числа.
Полученное число сохранить в отдельную переменную. При реализации должна использоваться прогрессия.*/
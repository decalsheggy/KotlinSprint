package org.example.lesson_5

fun main() {
    val number1 = "13"
    val number2 = "39"

    println("Угадайте два числа от 0 до 42:")

    val firstNumber = readln()
    val secondNumber = readln()

    val isFirstNumberCorrect = (firstNumber == number1) || (firstNumber == number2)
    val isSecondNumberCorrect = (secondNumber == number1) || (secondNumber == number2)

    if (isFirstNumberCorrect && isSecondNumberCorrect && (firstNumber != secondNumber))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (isFirstNumberCorrect || isSecondNumberCorrect)
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Верные числа: $number1, $number2.")
}
/*Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
Если угадать только одно – игрок получает утешительный приз.
Напиши программу, проверяющую выигрыш. Пользователь должен вводить числа в консоль.
Правильные числа заранее известны и хранятся в переменных.
Оформить ввод текстовыми подсказками о том, что нужно вводить.
Вывести отдельным сообщением, какие числа были нужны для победы.

- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
- если не угадано ничего, вывести “Неудача!”;
- программа должна учитывать ввод чисел в обратном порядке.*/
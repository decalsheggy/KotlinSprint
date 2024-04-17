package org.example.lesson_7

import kotlin.random.Random

fun main() {
    val chars = 'a'..'z'
    val numbers = '0'..'9'
    val lengthOfPassword = 6
    val randomPassword = StringBuilder() //Позволяет модифицировать строки, не создавая новых объектов

    for (i in 0 until  lengthOfPassword) {
        if (i % 2 == 0) randomPassword.append(chars.random()) else randomPassword.append(numbers.random())
    }
    println("Возможный пароль: $randomPassword")
}
/*Создай программу, которая генерирует шестизначные пароли.
Пусть пароль будет состоять из чередующихся цифр и строчных букв латинского алфавита (без специальных символов).
Например, k5p6m2. Выведи сгенерированный пароль в консоль.*/
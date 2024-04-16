package org.example.lesson_7

import kotlin.random.Random

fun main(){
    val characters = "abcdefghijklmnopqrstuvwxyz0123456789"
    val lengthOfPassword = 6
    val randomPassword = StringBuilder()

    for (i in 0 until  lengthOfPassword){
         randomPassword.append(characters.random())
    }
    println("Возможный пароль: $randomPassword")
}
/*Создай программу, которая генерирует шестизначные пароли.
Пусть пароль будет состоять из чередующихся цифр и строчных букв латинского алфавита (без специальных символов).
Например, k5p6m2. Выведи сгенерированный пароль в консоль.*/
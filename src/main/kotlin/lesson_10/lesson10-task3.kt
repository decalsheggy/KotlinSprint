package org.example.lesson_10

fun main() {
    println("Сколько символов вам нужно в пароле?")
    val size = readln().toInt()
    val password = generatePassword(size)

    println("Ваш пароль: $password")
}

fun generatePassword(size: Int): String {
    val password = StringBuilder()
    val numbers = 0..9
    val specialChars = ' '..'/'


    for (i in 0 until size) {
        password.append(if (i % 2 == 0) numbers.random() else specialChars.random())
    }
    return password.toString()
}

/*Напиши программу, которая генерирует пароли. Пароль должен состоять из
последовательно чередующихся цифр и специальных символов. Например, 4#4%2!.

- пользователь сам задает длину пароля;
- для генерации пароля должна быть отдельная функция, принимающая целочисленное
значение длины пароля и возвращающая готовый пароль;
- пароль должен содержать цифры от 0 до 9, специальные символы:
 !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).*/
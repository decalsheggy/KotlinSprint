package org.example.lesson_7

fun main() {
    val numbers = '0'..'9'
    val lowercaseLetters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'

    val password = StringBuilder()

    println("Введите предпочтительное количество символов в пароле(не менее 6):")
    var lengthOfPassword = readln().toInt()

    while (lengthOfPassword < 6) {
        println("Нужно не менее 6 символов!")
        lengthOfPassword = readln().toInt()
    }

    //гарантированно по символу из каждого диапазона:
    val guaranteedChars = listOf(
        numbers.random(),
        lowercaseLetters.random(),
        uppercaseLetters.random(),
    )

    val shuffledGuaranteedChars = guaranteedChars.shuffled()
    password.append(shuffledGuaranteedChars.joinToString(""))

    for (i in 0 until lengthOfPassword - shuffledGuaranteedChars.size) {
        password.append((numbers + lowercaseLetters + uppercaseLetters).random())
    }
    println(password)
}
/*Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.
*/
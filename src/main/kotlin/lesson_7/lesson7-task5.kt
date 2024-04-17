package org.example.lesson_7

fun main() {
    val numbers = "1234567890"
    val lowercaseLetters = "abcdefghijklmnopqrstuvwxyz"
    val uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val password = StringBuilder()

    println("Введите предпочтительное количество символов в пароле(не менее 6):")
    var lengthOfPassword: Int = readln().toInt()

    while (lengthOfPassword < 6) {
        println("Нужно не менее 6 символов!")
        lengthOfPassword = readln().toInt()
    }

    val guaranteedChars = listOf(
        numbers.random(),
        lowercaseLetters.random(),
        uppercaseLetters.random(),
    )

    val shuffledGuaranteedChars = guaranteedChars.shuffled()
    password.append(shuffledGuaranteedChars.joinToString(""))

    val allChars = "$numbers$lowercaseLetters$uppercaseLetters"

    for (i in 0 until lengthOfPassword - 3) {
        password.append(allChars.random())
    }
    println(password)
}
/*Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.
*/
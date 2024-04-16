package org.example.lesson_7

fun main(){
    val numbers = "1234567890"
    val lowercaseLetters = "abcdefghijklmnopqrstuvwxyz"
    val uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val password = StringBuilder()

    println("Введите предпочтительное количество символов в пароле(не менее 6):")
    val lengthOfPassword = readln().toInt()

    for (i in 0 until lengthOfPassword){
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
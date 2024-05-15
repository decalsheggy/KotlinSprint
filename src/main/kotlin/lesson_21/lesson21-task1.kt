package org.example.lesson_21

fun main() {
    val string = "Сколько гласных в этой строке? - How many vowels are there in this line?"
    println(string.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU"
    return this.count { it in vowels }
}

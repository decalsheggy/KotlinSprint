package org.example.lesson_21

fun main() {
    val phrase = "Сколько гласных в этой строке? - How many vowels are there in this line?"
    println(phrase.vowelCount())
}

fun String.vowelCount(): Int {
    return count { it in "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU" }
}

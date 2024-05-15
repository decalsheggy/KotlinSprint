package org.example.lesson_21

fun main() {
    val string = ""
    println(string.vowelCount("Сколько гласных в этой строке? - How many vowels are there in this line?"))
}

fun String.vowelCount(input: String): Int {
    var count = 0
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ" + "aeiouAEIOU"

    for (char in input) {
        if (char in vowels)
            count++
    }
    return count
}
/*Реализуй extension функцию для класса String, которая будет возвращать количество гласных букв в строке.
Назови функцию vowelCount. Например, для строки "hello" функция должна вернуть 2.*/
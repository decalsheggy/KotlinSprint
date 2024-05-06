package org.example.lesson_13

fun main() {
    println("Введите номер телефона:")
    try {
        val input = readln().toLong()
        val user = PhoneBookData("L", input, "School")
        user.outputObjects()
    } catch (e: Exception) {
        println("Ошибка - ${e::class.simpleName}.")
    }
}

class PhoneBookData(
    val name: String,
    val phoneNumber: Long?,
    val company: String? = null,
) {
    fun outputObjects() {
        println("Имя: $name, номер телефона: $phoneNumber, место работы: $company.")
    }
}
/*Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги)
и измени его название для избегания конфликтов.

Для получения номера программа считывает ввод пользователя с типом String по умолчанию.
Приведи строку к типу Long. Если пользователь ввел что-либо, кроме цифр — программа падает.

Необходимо воспроизвести ошибку и вывести ее название в консоль.*/
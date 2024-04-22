package org.example.lesson_10

import javax.swing.text.PasswordView

const val RIGHT_LOGIN = "login"
const val RIGHT_PASSWORD = "password"
val shoppingCart = listOf("Apples", "bananas", "carrots")

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    val token = authenticate(login, password)
    val cart = getShoppingCart(token)

    if (cart != null) println("Ваша корзина: ${cart.joinToString()}.")
    else println("Авторизация не удалась.")
}

fun generateToken(): String {
    val tokenChars  = listOf('a'..'z') + ('A'..'Z') + (1..9)
    return (1..32)
        .map { tokenChars.random() }
        .joinToString("")
}

fun authenticate(login: String, password: String): String? {
    return if (login == RIGHT_LOGIN && password == RIGHT_PASSWORD) {
        generateToken()
    } else null
}

fun getShoppingCart(token: String?): List<String>? {
    return if (token != null) shoppingCart
    else null
}

/*Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.

Метод авторизации принимает логин и пароль, верифицирует пользователя, генерирует и возвращает токен доступа.
При неудачной авторизации возвращается null. Токен - текстовая строка, генерируемая методом авторизации
(32 символа, которые включают цифры и буквы англ. алфавита).
Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token

Метод получения корзины принимает токен и возвращает список товаров (содержимое переменной корзины).

Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации.
Переменные логин, пароль и корзина проинициализированы заранее и неизменяемы.
generateToken*/
package org.example.lesson_17

fun main() {
    val user = User("aB12345", "bA56789")
    user.changedLogin = "bA54321"

    user.changedPassword = "135c796D53e"
    println("Пароль: ${user.passwordInfo}")
}

class User(private var login: String, private val password: String) {
    val passwordInfo: String = password.replace(Regex("."), "*")
    var changedPassword: String
        get() = password
        set(value) {
            if (value != password) println("Вы не можете изменить пароль на $value.")
        }

    var changedLogin: String
        get() = login
        set(value) {
            if (login != value) {
                login = value
                println("Логин изменен на $changedLogin.")
            }
        }
}
/*Класс описывает пользователя и хранит свойства логин и пароль (без инициализации по умолчанию).

- при попытке изменить пароль, в консоль должно выводиться «Вы не можете изменить пароль».
- при попытке прочитать пароль – вместо букв должны отображаться звездочки (по количеству символов пароля).
- при изменении логина в консоли должно печататься сообщение об успешной смене логина.

Создай пользователя с произвольными данными и протестируй изменение логина и пароля.
Вся реализация должна быть на сеттерах и геттерах*/
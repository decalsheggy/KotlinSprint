package org.example.lesson_17

fun main() {
    val user = User("aB12345", "bA56789")
    user.login = "bA54321"

    user.password = "135c796D53e"
    println("Пароль: ${user.password}")
}

class User(initialLogin: String, initialPassword: String) {
    var password: String = initialPassword
        get() = "*".repeat(field.length)
        set(value) {
            if (value != field) println("Вы не можете изменить пароль на $value.")
        }

    var login: String = initialLogin
        get() = field
        set(value) {
            if (field != value) {
                field = value
                println("Логин изменен на $value.")
            }
        }
}
/*Класс описывает пользователя и хранит свойства логин и пароль (без инициализации по умолчанию).

- при попытке изменить пароль, в консоль должно выводиться «Вы не можете изменить пароль».
- при попытке прочитать пароль – вместо букв должны отображаться звездочки (по количеству символов пароля).
- при изменении логина в консоли должно печататься сообщение об успешной смене логина.

Создай пользователя с произвольными данными и протестируй изменение логина и пароля.
Вся реализация должна быть на сеттерах и геттерах*/
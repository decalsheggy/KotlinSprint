package org.example.lesson_16

fun main() {
    val user = User("1234", "5678")
    println(user.checkPassword("5678"))
}

class User(val login: String, private val password: String) {
    fun checkPassword(pass: String): Boolean {
        return pass == password
    }
}
/*Создай класс, описывающий пользователя, который хранит поля логин и пароль.

Пароль не должен быть виден в теле главной функции,
но должен быть способ проверить, что пароль введен верно.
Функция валидации должна принимать строку и возвращать результат проверки
(и только его – без распечатки или генерации других строк).

Выведи информацию о релевантности пароля в консоль.*/
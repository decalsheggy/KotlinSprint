package org.example.lesson_22

fun main() {
    val user = User("Саша", 25, 89240471267)
    val (name, age, phoneNumber) = user
    println("Данные пользователя: $name, $age, $phoneNumber")
}

data class User(
    val name: String,
    val age: Int,
    val phoneNumber: Long,
)

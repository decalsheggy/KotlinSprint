package org.example.lesson_11.task_1

fun main(){
    val user1: UserData = UserData(
        "warlock_3000",
        "1a2b3c4",
        "vlkvlkvyb5500",
    )
    val user2 = UserData(
        "barbarian_5000",
        "5d6e7f8",
        "zjjfjszss44))",
        false,
    )
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.message)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.message)

}
/*Создай класс, который будет хранить данные пользователя. В свойствах должна храниться информация
об уникальном идентификаторе, логине, пароле и почте. Названием может быть, например, User.
Создай два экземпляра класса с произвольными данными и выведи в консоль содержимое их полей.barbarian*/
package org.example.lesson_11.task_2

class UserData2(
    val id: String,
    val login: String,
    var password: String,
    val message: Boolean,
    var bio: String = ""
) {
    fun outputInformation() {
        val info = """
        id: $id,
        login: $login,
        password: $password,
        message: $message,
        bio: $bio 
        """.trimIndent()

        println("Обновленная информация о пользователе: \n$info")
    }

    fun writeBiography() {
        println("Ваша биография:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите ваш старый пароль:")
        val enteredPassword = readln()

        if (password == enteredPassword) {
            println("Введите ваш новый пароль:")

            password = readln()
            println("Пароль изменен на: $password")
        } else println("Пароль введен неверно.")
    }
}
package org.example.lesson_11.task_2

fun main() {
    val user = UserData2(
        "warlock_3000",
        "1a2b3c4",
        "vlkvlkvyb5500",
        "ock9753@mail.ru",
    )
    user.writeBiography()
    user.changePassword()
    user.outputInformation()
}

class UserData2(
    val id: String,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = ""
) {
    fun outputInformation() {
        val info = """
        id: $id,
        login: $login,
        password: $password,
        message: $mail,
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
/* Скопируй класс User из первой задачи и назови User2. Добавь к классу новое
необязательное свойство bio и несколько методов:
- вывод информации о пользователе в консоль;
- считывание из консоли текста и запись в поле bio;
- изменение пароля — сначала запросить текущий пароль, и,
если он введен верно, запросить новый. Записать его в поле и сообщить, что пароль изменен;

Далее создай объект, заполни информацию “о себе” и замени пароль.
В конце выведи обновленную информацию о пользователе.*/
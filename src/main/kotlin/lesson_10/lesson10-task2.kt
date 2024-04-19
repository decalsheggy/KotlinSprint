package org.example.lesson_10

const val SIZE = 4
fun main() {
    println("Придумайте логин и пароль минимум из 4х символов:")
    val password = readln()
    val login = readln()

    if (isSizeRight(password, login)) {
        println("Введите ваши логин и пароль для входа:")
        val inputPassword = readln()
        val inputLogin = readln()

        if (password == inputPassword && login == inputLogin) println("Добро пожаловать!")
        else println("Ты не пройдешь!")

    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isSizeRight(password: String, login: String): Boolean {
    return password.length >= SIZE && login.length >= SIZE
}
/*Для регистрации в приложении пользователь придумывает логин и пароль. И логин, и пароль должны
содержать в себе хотя бы 4 символа. Если всё верно, программа выводит приветственное сообщение.

- считывай логин и пароль с консоли поочередно;
- вынеси в отдельную функцию валидацию длины введенных данных;
- если логин или пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
*/
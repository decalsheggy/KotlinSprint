package org.example.lesson_1

fun main(){
    val year = "1961"
    var hour = "09"
    var minute = "07"

    println("Время взлета: \n$year год \n$hour часов \n$minute минут")

    hour = "10"
    minute = "55"

    println()
    println("Время посадки: $hour:$minute")
}
/* Объяви переменные и выведи данные о полете в космос первого человека.

 – Запиши в новую переменную year год полета Юрия Гагарина в космос;
 – Объяви и проинициализируй переменные hour и minute – час и минуту взлета соответственно;
 – Выведи год, час и минуту взлета по одной переменной на каждую строку;
 – Затем измени значения переменных hour и minute,
 чтобы они теперь имели значение часа и минуты посадки;
 – Выведи время посадки в одной строке в формате [часы:минуты]. Пример: 10:55.

Определи, где в программе переменные должны задаваться через val, а где через var.

Данные для задачи:
Год полета – 1961
Взлет – 09:07
Посадка – 10:55 */
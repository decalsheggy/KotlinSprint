package org.example.lesson_13

fun main() {
    val listOfNumbers = mutableListOf<DataPhoneBook>()

    while (true) {
        println("Добавить новый контакт? да/нет")
        val answer = readln()
        if (answer.equals("да", true)) {

            println("Введите имя:")
            val userName = readln()

            println("Введите номер телефона:")
            val userNumber = readln().toLongOrNull()
            if (userNumber == null) {
                println("Номер телефона отсутствует или введен некорректно.")
                continue
            }

            println("Введите место работы:")
            val userCompany = readln()

            val user = DataPhoneBook(userName, userNumber, userCompany)
            listOfNumbers.add(user)
            user.outputObjects()
        } else {
            println("Список всех контактов:")
            listOfNumbers.forEach { it.outputObjects() }
            break
        }
    }
}

class DataPhoneBook(val name: String, val phoneNumber: Long?, val company: String? = null) {
    fun outputObjects() {
        println("Имя: $name, номер телефона: $phoneNumber, место работы: ${company}")
    }
}
/*Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Программа должна заполнять контакты в телефонную книгу (отдельный список объектов).

- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя
и такая запись не должна добавляться;
- для приведения введенного номера к числу используй toLongOrNull();
- если пользователь не заполнил компанию, то в объект записывать null.

Выведи созданные объекты в консоль методом класса*/
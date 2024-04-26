package org.example.lesson_13

fun main() {
    val phone1 = PhoneBook("Олег", 87070183582, "null")
    val phone2 = PhoneBook("Лена", 89503684437)
    val phone3 = PhoneBook("Женя", 87040587488, "RiskStudio")
    val phone4 = PhoneBook("Никита", 89070654434, "Nice to meAt")
    val phone5 = PhoneBook("Дима", 87350684580)

    val listOfNumbers = listOf(phone1, phone2, phone3, phone4, phone5)

    val companies = listOfNumbers.mapNotNull { it.company }.joinToString()
    println("Список всех существующих компаний в телефонной книге: $companies.")
}

class PhoneBook(val name: String, val phoneNumber: Long, val company: String? = null) {
}
/*Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым,
их нужно объединить в список.
- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
- 2 контакта должны принимать null для поля компании;
- 1 контакт должен иметь название компании “null”;
- выведи список всех существующих компаний, которые есть в телефонной книге.*/
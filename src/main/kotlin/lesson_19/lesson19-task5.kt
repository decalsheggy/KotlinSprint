package org.example.lesson_19

import java.util.NoSuchElementException
import java.util.Scanner

fun main() {
    val people = mutableListOf<Person>()
    val scanner = Scanner(System.`in`)

    println(
        "Введите ваше имя и пол (${Gender.values().joinToString { it.person }})\n" +
                "Ввод текста должен быть таким: Имя пол"
    )

    while (people.size < 5) {
        try {
            val input = scanner.nextLine().trim()
            val parts = input.split(" ")
            if (parts.size == 2) {
                val name = parts[0]
                val genderInput = parts[1]
                val gender = Gender.fromPerson(genderInput)
                val person = Person(name, gender)
                people.add(person)
            } else println("Допущена ошибка в написании. Убедитесь, что вы ввели имя и пол через один пробел.")
        } catch (e: NoSuchElementException) {
            println("Ошибка в написании пола. Допустимые значения: женщина, мужчина.")
        }
    }
    println("Данные картотеки:")
    people.forEach {
        println("${it.nameOfPerson}(${it.genderOfPerson.person})")
    }
}

enum class Gender(val person: String) {
    WOMAN("женщина"),
    MAN("мужчина");

    companion object {
        fun fromPerson(person: String): Gender {
            return values().first { it.person.equals(person, true) }
        }
    }
}

class Person(val nameOfPerson: String, val genderOfPerson: Gender)

/*Разрабатываем приложение “Картотека”.
Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.

Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum.
После ввода 5 человек, список выводится в консоль.

При старте приложения печатается инструкция в каком формате вводить имя и пол
(и какие значения полов доступны).*/
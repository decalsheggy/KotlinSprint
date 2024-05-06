package org.example.lesson_13

fun main(){
    PhoneDirectory("Олег",87070684432, null)
}
class PhoneDirectory(val name: String, val phoneNumber: Long, val company: String?){
    init {
        println("Имя: $name, номер телефона: $phoneNumber, место работы: ${company ?:"нет"}.")
    }
}
/*Для программы телефонного справочника создай класс, который будет хранить имя,
номер телефона и компанию. Номер телефона – целочисленное значение (Long).

При создании объекта компания может оставаться незаполненной.
Вместо пустой строки поле может принимать null.

Все свойства класса не должны иметь инициализации по умолчанию.*/
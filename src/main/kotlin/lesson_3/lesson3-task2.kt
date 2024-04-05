package org.example.lesson_3

fun main(){
    val name = "Татьяна"
    val secondName = "Сергеевна"
    val beforeWeddingName = "Андреева"
    val afterWeddingName = "Сидорова"
    val ageBeforeWedding = 20
    val ageAfterWedding = 22

    println("[$beforeWeddingName $name $secondName, $ageBeforeWedding лет]")
    println("[$afterWeddingName $name $secondName, $ageAfterWedding года]")
}
/* Девушка по имени Андреева Татьяна Сергеевна в 22 года
вышла замуж за Сидорова, и поменяла фамилию.
О ней есть запись в одном из государственных приложений.
Приложение отслеживает изменения персональных данных граждан.

Выведи в консоль данные на момент когда ей было 20 и на момент,
когда ей было 22 в формате [ФИО, возраст].
Все части ФИО и возраст изначально хранятся в отдельных переменных.*/
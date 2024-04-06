package org.example.lesson_3

fun main() {
    val stringWhite = "D2-D4;0"

    val moveNumber = stringWhite.split(";","-")

    val whereFrom = moveNumber[0]
    val where = moveNumber[1]
    val number = moveNumber[2]

    println(whereFrom)
    println(where)
    println(number)
}
/*Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера,
которая примет строку, отправленную игроком (считаем эти данные уже известными
и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее
на 3 составляющих: откуда, куда и номер хода, присвоить соответствующим
переменным и распечатать по отдельности.*/
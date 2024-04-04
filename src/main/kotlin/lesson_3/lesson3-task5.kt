package org.example.lesson_3

fun main() {
    val stringWhite = "D2-D4;0"
    val firstParts = stringWhite.split(";")

    val part1 = firstParts[0]
    val strokeNumber = firstParts[1]

    val secondParts = part1.split("-")

    val whereFrom = secondParts[0]
    val where = secondParts[1]

    println(whereFrom)
    println(where)
    println(strokeNumber)
}
/*Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера,
которая примет строку, отправленную игроком (считаем эти данные уже известными
и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее
на 3 составляющих: откуда, куда и номер хода, присвоить соответствующим
переменным и распечатать по отдельности.*/
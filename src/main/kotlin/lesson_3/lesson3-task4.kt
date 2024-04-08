package org.example.lesson_3

fun main(){
    var whereFrom = "E2"
    var where = "E4"
    var strokeNumber = "1"

    println("$strokeNumber-й ход белых - [$whereFrom-$where; $strokeNumber]")

    whereFrom = "D2"
    where = "D"+(2 + 1)
    strokeNumber = "2"

    println("$strokeNumber-й ход белых - [$whereFrom-$where; $strokeNumber]")
}
/*В приложении шахматы, ходы отправляются на сервер в виде строки
формата [откуда-куда;номер хода]. Игрок начал партию ходом из E2 в E4.
Все данные (откуда, куда, номер хода) инициализировать
и хранить в отдельных переменных.

 – Напиши код, который сформирует строку для отправки, а затем выведет ее в консоль.
 Нужно "собрать" единую строку из объявленных переменных
 и сохранить в новую переменную (или сразу распечатывать).

 – Далее этим переменным нужно присвоить новые данные и вывести
 в консоль следующий ход белых. Определить, какое значение будет
 в переменной "куда" для фигуры, стоящей на D2 и продвинувшейся
 на одну клетку вперед.*/
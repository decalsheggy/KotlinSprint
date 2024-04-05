package org.example.lesson_3

fun main() {
    val number = 7
    val arrayOfNumber = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var table = ""

    for (i in arrayOfNumber){
        table += "$number * $i = ${number * i}\n"
    }

    println(table)

    /*println ("""$number * ${arrayOfNumber[0]} = ${number * arrayOfNumber[0]}
        |$number * ${arrayOfNumber[1]} = ${number * arrayOfNumber[1]}
        |$number * ${arrayOfNumber[2]} = ${number * arrayOfNumber[2]}
        |$number * ${arrayOfNumber[3]} = ${number * arrayOfNumber[3]}
        |$number * ${arrayOfNumber[4]} = ${number * arrayOfNumber[4]}
        |$number * ${arrayOfNumber[5]} = ${number * arrayOfNumber[5]}
        |$number * ${arrayOfNumber[6]} = ${number * arrayOfNumber[6]}
        |$number * ${arrayOfNumber[7]} = ${number * arrayOfNumber[7]}
        |$number * ${arrayOfNumber[8]} = ${number * arrayOfNumber[8]}
    """.trimMargin())*/
}
/*Пишем программу, которая будет помогать учить таблицу умножения.
В отдельную переменную будет записываться число (объявить и проинициализировать),
а выводиться будет таблица умножения для этого числа.
Таблица должна корректно печататься, если в исходную
переменную подставлять разные числа.

Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54

 – Вместо числа 6 использовать данные из объявленной переменной;
 – Вычислять значения прямо в строке;
 – Вывод всей таблицы нужно сделать в одной функции println(),
 которая вызывается один раз.
 */
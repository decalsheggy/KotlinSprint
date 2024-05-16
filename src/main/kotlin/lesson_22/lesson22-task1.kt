package org.example.lesson_22

fun main() {
    val regularBook1 = RegularBook("RegularBook", "Author")
    val regularBook2 = RegularBook("RegularBook", "Author")
    println(regularBook1 == regularBook2)
    /*Сравниваются ссылки на объекты в памяти, а не их значения(ссылки не равны => false)*/

    val dataBook1 = DataBook("DataBook", "Author")
    val dataBook2 = DataBook("DataBook", "Author")
    println(dataBook1 == dataBook2)
    /*Здесь сравниваются уже сами значения(значения равны => true)*/
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

package org.example.lesson_22

fun main() {
    val regularBook1 = RegularBook1("RegularBook", "Author")
    println(regularBook1)
    /*RegularBook1 является обычным классом с переопределенным методом toString(),
    где явно указано, как будет выводиться информация*/

    val dataBook1 = DataBook1("DataBook", "Author")
    println(dataBook1)
    /*DataBook1 является data-классом, в котором метод toString() по умолчанию выводит
    значения всех свойств, объявленных в первичном конструкторе*/
}

class RegularBook1(
    val name: String,
    private val author: String,
) {
    override fun toString(): String {
        return "RegularBook1(name=$name, author=$author)"
    }
}

data class DataBook1(
    val name: String,
    val author: String,
)

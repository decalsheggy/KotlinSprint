package org.example.lesson_20

fun main() {
    val listOfString = listOf("каждый", "охотник", "желает", "знать", "где", "сидит", "фазан")
    val listOfLambda: List<(String) -> String> = listOfString.map { lambda ->
        { "Нажат элемент \"$lambda\"" }
    }

    val everyElement = listOfLambda.map { it.invoke("") }
    everyElement.forEach { println(it) }
}

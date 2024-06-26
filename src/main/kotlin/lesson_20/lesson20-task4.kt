package org.example.lesson_20

fun main() {
    val listOfString = listOf("каждый", "охотник", "желает", "знать", "где", "сидит", "фазан")
    val listOfLambda: List<(String) -> String> = listOfString.map { lambda ->
        { "Нажат элемент \"$lambda\"" }
    }

    listOfLambda.forEachIndexed { index, lambda ->
        if (index % 2 == 0) println(lambda.invoke(""))
    }
}

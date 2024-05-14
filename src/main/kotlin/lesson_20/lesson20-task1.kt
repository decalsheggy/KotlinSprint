package org.example.lesson_20

fun main() {
    val username = "Никита"
    val splashScreen: () -> String = { "С наступающим Новым Годом, $username!" }
    println(splashScreen())
}


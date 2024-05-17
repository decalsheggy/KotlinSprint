package org.example.lesson_21

fun main() {
    val categories =
        mapOf(
            "Ловкость" to 10,
            "Интеллект" to 14,
            "Мудрость" to 17,
            "Харизма" to 17,
            "Сила" to 10,
            "Телосложение" to 13,
        )
    println(categories.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? = maxByOrNull { it.value }?.key


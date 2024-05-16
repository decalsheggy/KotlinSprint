package org.example.lesson_21

import java.util.Random

fun main() {
    val categories =
        mapOf(
            "Ловкость" to 10,
            "Интеллект" to 14,
            "Мудрость" to 14,
            "Харизма" to 19,
            "Сила" to 10,
            "Телосложение" to 13,
        )
    println(categories.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? {
    val maxValue = this.maxByOrNull { it.value }?.value
    val maxKeys = this.filter { it.value == maxValue }.keys.toList()
    return if (maxKeys.isNotEmpty()) maxKeys[Random().nextInt(maxKeys.size)] else null
}

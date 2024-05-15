package org.example.lesson_21

fun main() {
    val player = Player("player", 67, 119)
    println("Игрок полностью здоров: ${player.isHealthy()}")
}

class Player(
    val name: String,
    val currentHP: Int,
    val maxHP: Int,
)

fun Player.isHealthy(): Boolean {
    return currentHP == maxHP
}

package org.example.lesson_20

fun main() {
    val player1 = Player("Игрок1", false)
    val player2 = Player("Игрок2", true)

    val hasKey: (Player) -> Unit = {
        if (it.key) println("${it.name} открыл дверь.")
        else println("${it.name} не может войти. Дверь заперта.")
    }
    hasKey(player1)
    hasKey(player2)
}

class Player(val name: String, var key: Boolean)


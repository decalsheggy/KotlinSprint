package org.example.lesson_20

fun main() {
    val player1 = Player("Игрок1", false)
    val player2 = Player("Игрок2", true)

    val checkTheKey: (Player) -> Unit = {
        if (it.hasKey) println("${it.name} открыл дверь.")
        else println("${it.name} не может войти. Дверь заперта.")
    }
    checkTheKey(player1)
    checkTheKey(player2)
}

class Player(val name: String, var hasKey: Boolean)


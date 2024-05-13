package org.example.lesson_20

fun main() {
    val healingPotion = 50
    val player = Player("KittenWoof", 46, 190)

    val useHealingPotion: (Player) -> Int = { it ->
        it.currentHP += healingPotion
        if (it.currentHP > it.maxHP) it.currentHP = it.maxHP
        it.currentHP
    }
    println("Текущее здоровье игрока: ${player.currentHP}")
    println("Применить зелье лечения +$healingPotion, текущее здоровье: ${useHealingPotion(player)}")
}

class Player(
    val name: String,
    var currentHP: Int,
    val maxHP: Int,
)

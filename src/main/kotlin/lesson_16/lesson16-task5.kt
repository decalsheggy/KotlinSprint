package org.example.lesson_16

fun main() {
    val player = Player("player", 230, 28)

    player.getPhysicalDamage(90)
    player.getHealing(20)

    player.getPhysicalDamage(120)
    player.getHealing(30)

    player.getPhysicalDamage(80)
    player.getHealing(20)
}

class Player(
    private val name: String,
    private var hitPoints: Int,
    private var attackPower: Int
) {

    fun getPhysicalDamage(damage: Int) {
        if (hitPoints > 0) {
            hitPoints -= damage
            if (hitPoints <= 0) {
                println("Вы получили $damage урона, осталось 0 здоровья")
                onDeath()
                return
            }
            println("Вы получили $damage урона, осталось $hitPoints здоровья")
        }
    }

    fun getHealing(healingPoints: Int) {
        if (hitPoints > 0) {
            hitPoints += healingPoints
            println("Вы восстановили $healingPoints здоровья, осталось $hitPoints")
        } else println("Вы мертвы, нельзя восстановить здоровье")
    }

    private fun onDeath() {
        attackPower = 0
        println("Вы мертвы")
    }
}
/*Для игры требуется создать класс игрока. С полями: имя, здоровье и сила удара.
Здоровье должно изменяться только через методы получения урона и лечения.


Добавить приватный метод, который вызывается, если при получении урона заканчивается здоровье.
Смерть обнуляет силу удара, здоровье и не позволяет лечиться.

Сымитируй бой, вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.*/
package org.example.lesson_19

fun main() {
    val tank = Tank()
    tank.shoot()

    tank.loadAmmo(AmmoType.BLUE)
    tank.shoot()

    tank.loadAmmo(AmmoType.RED)
    tank.shoot()

    tank.loadAmmo(AmmoType.GREEN)
    tank.shoot()
}

enum class AmmoType(val colors: String, val damage: Int) {
    BLUE("синие", 5),
    GREEN("зеленые", 10),
    RED("красные", 20);
}

class Tank {
    private var loadedAmmo: AmmoType? = null

    fun loadAmmo(ammo: AmmoType) {
        loadedAmmo = ammo
        println("Зарядить патронами типа: ${ammo.colors}(${ammo.damage} урона).")
    }

    fun shoot() {
        if (loadedAmmo != null) println("Вы нанесли ${loadedAmmo!!.damage} урона.")
        else println("Танк не заряжен! Выстрел невозможен.")
    }
}
/*В компьютерной игре танк может подбирать разные виды патронов.
Патроны различаются силой удара.
Синие – 5 единиц, зеленые – 10, красные – 20.

 – создай enum класс для патронов и класс танка.
 У танка должны быть методы вооружения новым типом патронов и выстрела.
 При выстреле в консоль должен выводиться нанесенный урон;
 – создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
– экземпляр танка при создании ничем не заряжен;
 – в решении должен использоваться enum.*/
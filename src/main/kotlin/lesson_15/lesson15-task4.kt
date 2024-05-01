package org.example.lesson_15

fun main() {
    val instrument = Instruments("домбра", 15)
    val accessories = Accessories("тиек", 20)
    instrument.search()
    println("Комплектующие ${accessories.name} - в количестве ${accessories.quantity} шт.")
}

abstract class Products(
    open val name: String,
    open val quantity: Int
)

class Instruments(
    override val name: String,
    override val quantity: Int
) : Products(name, quantity), Search {
    override fun search() {
        println("Выполняется поиск для инструмента: $name. Доступное количество $quantity шт.")
    }
}

class Accessories(
    override val name: String,
    override val quantity: Int
) : Products(name, quantity)

interface Search {
    fun search()
}
/*На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним.
Все товары имеют название и количество единиц на складе.

Для инструментов есть возможность поиска соответствующих комплектующих.

Опиши классы для категорий товаров. Имитируй процесс поиска текстовым сообщением «Выполняется поиск».
Для выноса логики поиска используй интерфейс.*/
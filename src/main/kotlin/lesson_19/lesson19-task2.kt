package org.example.lesson_19

fun main() {
    val product1 = Product("Пенал", 43234086, Categories.STATIONERY)
    product1.printProductInfo()

    val product2 = Product("Копилка", 13540864, Categories.OTHER)
    product2.printProductInfo()

    val product3 = Product("Джинсы", 98723406, Categories.CLOTHING)
    product3.printProductInfo()
}

enum class Categories {
    CLOTHING,
    STATIONERY,
    OTHER;

    fun printCategoryInfo(): String {
        return when (this) {
            CLOTHING -> "одежда"
            STATIONERY -> "канцтовары"
            OTHER -> "разное"
        }
    }
}

class Product(val name: String, private val id: Int, private val category: Categories) {
    fun printProductInfo() {
        println("\"$name($id)\" - находится в категории: ${category.printCategoryInfo()}.")
    }
}

/*В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.
 – создай enum класс с категориями;
 – создай метод внутри enum, который вернет текстовое название категории для пользователя;
 – создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод,
 который выводит инфо о товаре. Вызови его для нескольких созданных товаров;
 – для вывода информации о товаре, для категории используй метод определения категории.*/
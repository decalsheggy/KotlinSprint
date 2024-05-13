package org.example.lesson_16

fun main() {
    val order = Order(675634, "В пути на склад")
    order.changeStatus("Готов к выдаче")

}

class Order(private val numberOfOrder: Int, private var statusOfOrder: String) {
    private fun changeStatusRequest(newStatus: String) {
        println("Статус заказа $numberOfOrder: \"$statusOfOrder\" изменить на: \"$newStatus\"")
        this.statusOfOrder = newStatus
    }

    fun changeStatus(newStatus: String) {
        changeStatusRequest(newStatus)
        println(newStatus)
    }
}
/*Создай класс, описывающий заказ в интернет-магазине.
В заказе должны быть номер заказа и статус готовности.
Номер заказа должен быть недоступен для изменения.

Создай метод, который меняет статус заказа.
Поменять статус заказа можно только отправив заявку менеджеру.
Имитируй это действие отдельной публичной функцией.
Она будет принимать новый статус и обращаться
к внутреннему методу класса для изменения статуса.
println(order.statusOfOrder)*/
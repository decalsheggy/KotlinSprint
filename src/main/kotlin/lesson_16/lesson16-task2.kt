package org.example.lesson_16

import kotlin.math.pow

private const val PI = 3.14

fun main() {
    val circle = Circle(5)
    circle.perimeter()
    circle.area()
}

class Circle(private val radius: Int) {
    fun perimeter() {
        println("Периметр окружности равен: ${String.format("%.1f", 2 * PI * radius)}см.")
    }

    fun area() {
        println("Площадь окружности равна: ${String.format("%.1f", PI * radius.toDouble().pow(2))}см.")
    }
}
/*Создай класс, описывающий круг. У него должны быть методы, вычисляющие
длину окружности и площадь круга, используя радиус.

Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным от изменений извне.
Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.

Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.
public
private
protected
internal
*/
package org.example.lesson_18

fun main() {
    val point = Point(5.8f, 7)
    val square = Square(3, 4.2f, 21)
    val circle = Circle(1.6f, 5, 37)

    val screen = Screen()
    screen.draw(point)
    screen.draw(square)
    screen.draw(circle)
}

open class Object(val x: Number, val y: Number) {
    open fun draw() {
    }
}

class Point(x: Number, y: Number) : Object(x, y) {
    override fun draw() {
        println("Нарисовать точку с координатами ($x;$y)")
    }
}

class Square(x: Number, y: Number, private val length: Number) : Object(x, y) {
    override fun draw() {
        println("Нарисовать квадрат с координатами ($x;$y) и стороной $length см.")
    }
}

class Circle(x: Number, y: Number, private val radius: Int) : Object(x, y) {
    override fun draw() {
        println("Нарисовать круг с координатами ($x;$y) и радиусом $radius см.")
    }
}

class Screen {
    fun draw(point: Point) {
        point.draw()
    }

    fun draw(square: Square) {
        square.draw()
    }

    fun draw(circle: Circle) {
        circle.draw()
    }
}
/*point, square, circle
В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.

Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).
*/
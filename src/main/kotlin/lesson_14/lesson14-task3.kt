package org.example.lesson_14

fun main() {
    val whiteCircle = Circle("white", 10)
    val blackCircle = Circle("black", 15)
    val whiteRectangle = Rectangle("white", 18, 8)
    val blackRectangle = Rectangle("black", 17, 7)

    val listOfFigures = listOf(whiteCircle, whiteRectangle, blackCircle, blackRectangle)
}

abstract class Figure {
    abstract val color: String

    abstract fun calculateTheArea()

    abstract fun calculateThePerimeter()
}

class Circle(override val color: String, val radius: Int) : Figure() {
    override fun calculateTheArea() {
        println("Площадь окружности = ${String.format("%.0f",Math.PI * (radius * radius))}см.")
    }

    override fun calculateThePerimeter() {
        println("Периметр окружности = ${String.format("%.0f",2 * Math.PI * radius)}см.")
    }
}

class Rectangle(override val color: String, val length: Int, val width: Int) : Figure() {
    override fun calculateTheArea() {
        println("Площадь прямоугольника = ${length * width}см.")
    }

    override fun calculateThePerimeter() {
        println("Периметр прямоугольника = ${(length + width) * 2}см.")
    }
}
/*Напиши программу для работы с геометрическими фигурами: кругом и прямоугольником.
Каждая фигура имеет свой цвет и уникальные параметры:

- для круга — радиус;
- для прямоугольника — ширину и высоту.

Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:

- для вычисления площади;
- для вычисления периметра.

Добавь классы-наследники для вышеупомянутых типов фигур. Реализуй методы для вычисления
площади и периметра в каждом из классов-наследников (формулы можно найти в интернете).

Создай несколько объектов разных цветов (черные и белые) и сохрани в единый список. Выведи в консоль:

- сумму периметров всех черных фигур;
- сумму площадей всех белых фигур.*/
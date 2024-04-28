package org.example.lesson_14

fun main() {
    val whiteCircle = Circle("white", 10)
    val blackCircle = Circle("black", 15)
    val whiteRectangle = Rectangle("white", 18, 8)
    val blackRectangle = Rectangle("black", 17, 7)

    var sumBlackPerimeters = 0.0
    var sumWhiteAreas = 0.0

    val listOfFigures = listOf(whiteCircle, whiteRectangle, blackCircle, blackRectangle)
    listOfFigures.forEach {
        when (it.color) {
            "black" -> sumBlackPerimeters += it.calculateThePerimeter()
            "white" -> sumWhiteAreas += it.calculateTheArea()
        }
    }
    println("Сумма периметров всех черных фигур: ${String.format("%.1f", sumBlackPerimeters)} см.")
    println("Сумма площадей всех белых фигур: ${String.format("%.1f", sumWhiteAreas)} см.")
}

abstract class Figure(val color: String) {
    abstract fun calculateTheArea(): Double

    abstract fun calculateThePerimeter(): Double
}

class Circle(color: String, val radius: Int) : Figure(color) {
    override fun calculateTheArea(): Double {
        val area = Math.PI * (radius * radius)
        println("Площадь окружности = ${String.format("%.1f", area)} см.")
        return area
    }

    override fun calculateThePerimeter(): Double {
        val perimeter = 2 * Math.PI * radius
        println("Периметр окружности = ${String.format("%.1f", perimeter)} см.")
        return perimeter
    }
}

class Rectangle(color: String, val length: Int, val width: Int) : Figure(color) {
    override fun calculateTheArea(): Double {
        val area = length * width.toDouble()
        println("Площадь прямоугольника = $area см.")
        return area
    }

    override fun calculateThePerimeter(): Double {
        val perimeter = (length + width) * 2.toDouble()
        println("Периметр прямоугольника = $perimeter см.")
        return perimeter
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
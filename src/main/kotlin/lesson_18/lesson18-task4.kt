package org.example.lesson_18

fun main() {
    val squareBox: Package = SquareBox(5)
    println("Площадь поверхности квадратной коробки = ${squareBox.areaOfSurface()} см².")

    val rectangularBox: Package = RectangularBox(4, 5, 6)
    println("Площадь поверхности прямоугольной коробки = ${rectangularBox.areaOfSurface()} см².")
}

abstract class Package {
    abstract fun areaOfSurface(): Int
}

class SquareBox(currentLength: Int) : Package() {
    private val length = currentLength

    override fun areaOfSurface(): Int {
        return (length * length) * 6
    }
}

class RectangularBox(currentLength: Int, currentWidth: Int, currentHeight: Int) : Package() {
    private val length = currentLength
    private val width = currentWidth
    private val height = currentHeight

    override fun areaOfSurface(): Int {
        return ((length * width) + (length * height) + (width * height)) * 2
    }
}

/*В программе хранятся данные о посылках. Нужно написать иерархию классов, описывающих коробки.
Чтобы рассчитывать упаковку для посылок, в классе должен быть метод, возвращающий площадь поверхности посылки.

Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой.
Если посылка – куб, то только с длиной ребра*/
package org.example.lesson_18

fun main() {
    val fox: Animal = Fox()
    val dog: Animal = Dog()
    val cat: Animal = Cat()

    val animals: List<Animal> = listOf(fox, dog, cat)
    for (animal in animals) {
        animal.toEat()
    }
}

abstract class Animal(
    val name: String,
    private val food: String,
    val sleeping: Boolean,
) {
    open fun toEat() {
        println("$name -> ест $food")
    }
}

class Fox : Animal("Лиса", "ягоды", true)

class Dog : Animal("Собака", "кости", true)

class Cat : Animal("Кошка", "рыбу", true)

/*В тамагочи есть лиса, собака и кошка. Они могут только есть и спать.

Лиса ест ягоды, собака – кости, а кошка – рыбу. У каждого животного есть имя.
Эти действия отображаются в консоли по такому шаблону: “[имя] -> [действие]”.

– опиши эти классы, используя полиморфизм;
– создай по одному объекту животного, сохрани их в список с принудительным указанием типа списка;
– в цикле вызывай метод приема пищи для каждого экземпляра.*/
package org.example.lesson_20

fun main() {
    val robot = Robot()

    println("Original: ${robot.say()}")
    robot.setModifier { phrase ->
        phrase.split(" ").joinToString { it.reversed() }
    }
    println("Modified: ${robot.say()}")
}

class Robot {
    private var currentModifier: (String) -> String = { it }

    fun setModifier(modifier: (String) -> String) {
        currentModifier = modifier
    }

    fun say(): String {
        val randomPhrases = Phrases.entries.toTypedArray().random().phrase
        return currentModifier(randomPhrases)
    }
}

enum class Phrases(var phrase: String) {
    PHRASE_1("   Приветствую вас, человеческий пользователь. Как я могу улучшить ваш день?"),
    PHRASE_2("Анализирую информацию... Пожалуйста, подождите."),
    PHRASE_3("Ваши инструкции приняты. Выполняю..."),
    PHRASE_4("Готов к новым заданиям. Какую задачу вы хотели бы решить?"),
    PHRASE_5("Заряд батареи низкий. Отправляюсь на боковую.");
}
/*Программируем робота. Робот умеет говорить и работать с модификаторами речи.
Речь реализуется методом say(). Модификатор устанавливается функцией setModifier(), принимающей лямбду.

Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно).
Реализуй модификатор, инвертирующий слова робота.

В результате в главной функции должен быть воспроизведен такой алгоритм:
– Вызов say(). Метод печатает одну фразу в обычном виде.
– Вызов setModifier(). Устанавливает переданный в него модификатор строки.
– Вызов say(). Метод выводит одну фразу в инвертированном виде.*/
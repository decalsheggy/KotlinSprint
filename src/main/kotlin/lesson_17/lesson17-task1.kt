package org.example.lesson_17

fun main() {
    val elementQuiz = ElementQuiz("В какой стране снимался \"Властелин колец\"?", "Новая Зеландия")
    println("Вопрос: ${elementQuiz.questionText}")
    println("Ответ: ${elementQuiz.answerText}")

    elementQuiz.answerText = "New Zealand"
    println("Измененный ответ: ${elementQuiz.answerText}")
}

class ElementQuiz(
    private val question: String,
    private var answer: String,
) {
    val questionText: String
        get() = question

    var answerText: String
        get() = answer
        set(value) {
            answer = value
        }
}
/*Создай класс, описывающий элемент викторины. В primary конструкторе два текстовых свойства: вопрос и ответ.
Явно пропиши для вопроса геттер, для ответа геттер и сеттер.*/
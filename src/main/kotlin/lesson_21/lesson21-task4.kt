package org.example.lesson_21

import java.io.File

fun main() {
    val file = File("text")
    file.writeWordToFile("word")
}

fun File.writeWordToFile(word: String) {
    createNewFile()
    writeText(word)
    println(word.lowercase() + this)
}
/*val message = "some message for file"
В курсовой работе мы разрабатываем телеграм-бота на Kotlin,
который помогает пользователям учить иностранные слова.
Создай extension функцию для класса File из стандартной библиотеки,
которая будет записывать переданное ей слово в файл.

- дополнительные материалы про файлы есть в 1-2 этапах курсовой;
- функция-расширение должна записывать текст в нижнем регистре;
- функция-расширение должна записывать текст в начало файла.*/
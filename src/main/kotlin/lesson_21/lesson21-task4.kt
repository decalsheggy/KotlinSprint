package org.example.lesson_21

import java.io.File

fun main() {
    val file = File("text.txt")
    file.writeWordToFile("Слово")
}

fun File.writeWordToFile(word: String) {
    val currentContent = if (this.exists()) this.readText() else ""
    this.writeText(word.lowercase() + "\n" + currentContent)
    println("Записанное слово: ${word.lowercase()}.")
}

package org.example.lesson_17

fun main() {
    val pack1 = Package("Референсы", 44, false)
    pack1.readData()

    val pack2 = Package("Идеи", 56)
    pack2.readData()
}

class Package(
    private val _name: String,
    private val _numberOfFiles: Int,
    private val secretFlag: Boolean = true,
) {

    val name: String
        get() = if (secretFlag) "Скрытая папка" else _name

    val numberOfFiles: Int
        get() = if (secretFlag) 0 else _numberOfFiles

    fun readData() {
        println("\"${this.name}\", количество файлов: ${this.numberOfFiles}")
    }
}
/*В приложении для хранения облачных файлов есть папки и файлы.

Создай класс папки, который имеет имя, количество файлов и флаг “секретно”.
Если флаг имеет значение true, то при попытке прочитать имя,
возвращать строку “скрытая папка” и количество файлов – 0.
В ином случае возвращать ее название и реальное количество файлов.
Для реализации должны использоваться геттеры.

Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.
*/
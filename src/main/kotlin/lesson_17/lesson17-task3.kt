package org.example.lesson_17

fun main() {
    val pack1 = Package("Референсы", 44, false)
    pack1.readData()
    println(pack1.folderName)

    val pack2 = Package("Идеи", 56)
    pack2.readData()
    println(pack2.folderName)
}

class Package(
    private val name: String,
    private val numberOfFiles: Int,
    private val secretFlag: Boolean = true,
) {

    val folderName: String
        get() = if (secretFlag) "Скрытая папка" else name

    private val files: Int
        get() = if (secretFlag) 0 else numberOfFiles

    private val flag: Boolean
        get() = secretFlag

    fun readData() {
        println("Конфиденденциальность: ${this.flag}, название: \"${this.folderName}\", количество файлов: ${this.files}")
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
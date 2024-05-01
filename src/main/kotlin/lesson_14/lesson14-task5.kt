package org.example.lesson_14

fun main() {
    val chat = Chat()

    chat.addMessage("human1", "Всем привет!")
    chat.addMessage("human2", "Вечер в хату")
    chat.addThreadMessage("human3", "Hi", 1)
    chat.addThreadMessage("human4", "Hi", 3)

    chat.printChat()
}
class Chat {
    val messages = mutableListOf<Message>()
    var messageId = 0

    fun addMessage(author: String, text: String) {
        messages.add(Message(author, text, messageId++))
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        messages.add(ChildMessage(author, text, messageId++, parentMessageId))
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }
        messages.forEach { i ->
            if (i is ChildMessage) println("\t${i.text} by ${i.author} (reply to ${i.parentMessageId})\"")
            else println("${i.text} by ${i.author}")
            groupedMessages[i.id]?.forEach { childMessage ->
                if (childMessage is ChildMessage) {
                    println("\t${childMessage.text} by ${childMessage.author}")
                }
            }
        }
    }

    open class Message(
        val author: String,
        val text: String,
        val id: Int,
    )

    class ChildMessage(
        author: String,
        text: String,
        id: Int,
        val parentMessageId: Int,
    ) : Message(author, text, id)
}

/*Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord.
Класс должен иметь следующие методы:

- addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;
- addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения), дополнительно
принимает на вход parentMessageId для идентификации сообщения, под которым создается ветка обсуждения;

Сообщения чата должны храниться в списке, в классе Chat. Для создания сообщений соответствующих типов
используй классы Message и ChildMessage в соответствующей иерархии. У каждого типа сообщения должен быть id.

- printChat() — печатает все сообщения чата. Если создано дочернее сообщение, необходимо применить для вывода
табуляцию и печатать его под родительским сообщением. Используй groupBy() для группировки сообщений по parentMessageId,
если сообщение является экземпляром ChildMessage, или по id если это обычное сообщение.*/
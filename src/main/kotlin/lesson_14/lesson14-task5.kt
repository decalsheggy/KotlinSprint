package org.example.lesson_14

fun main() {
    val chat = Chat()

    val message1 = chat.addMessage("human1", "Всем привет, подскажите домашку пж")
    chat.addThreadMessage("human2", "Привет, учим слова на 103стр", message1.id)

    val message2 = chat.addMessage("human3", "Нам что-то задали?..")
    chat.addThreadMessage("human4", "Как видишь", message2.id)

    chat.printChat()
}

class Chat {
    val messages = mutableListOf<Message>()
    var messageId = 0

    fun addMessage(author: String, text: String): Message {
        val newMessage = Message(author, text, messageId++)
        messages.add(newMessage)
        return newMessage
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        messages.add(ChildMessage(author, text, messageId++, parentMessageId))
    }

    fun printChat() {
        val groupedMessages = messages.filterIsInstance<ChildMessage>().groupBy { it.parentMessageId }

        messages.forEach { message ->
            if (message !is ChildMessage || !groupedMessages.containsKey(message.parentMessageId)) {
                println("${message.author}: ${message.text}")
            }
            groupedMessages[message.id]?.forEach { childMessage ->
                println("\t${childMessage.author}: ${childMessage.text}")
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
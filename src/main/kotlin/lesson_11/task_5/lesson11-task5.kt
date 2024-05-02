package org.example.lesson_11.task_5

fun main() {
    val forum = Forum()

    forum.addMember("user1")
    val user1 = forum.members.last().userId

    forum.addMember("user2")
    val user2 = forum.members.last().userId

    forum.addMessage(user1, "Работа не волк")
    forum.addMessage(user1, "Работа это ворк")
    forum.addMessage(user2, "А волк это ходить")
    forum.addMessage(user2, "Запомните, а то забудете")
    forum.printThread()
}

open class ForumMember(val userId: String, val userName: String)
class ForumMemberFactory {
    var memberIdCounter = 0
    fun createNewMember(userName: String): ForumMember {
        val userId = (++memberIdCounter).toString()
        return ForumMember(userId, userName)
    }
}

open class ForumMessage(val authorId: String, val message: String)
class ForumMessageFactory {
    fun createNewMessage(authorId: String, message: String): ForumMessage {
        return ForumMessage(authorId, message)
    }
}

class Forum {
    val members = mutableListOf<ForumMember>()
    val messages = mutableListOf<ForumMessage>()
    val newMember = ForumMemberFactory()
    val newMessage = ForumMessageFactory()

    fun addMember(userName: String) {
        val member = newMember.createNewMember(userName)
        members.add(member)
    }

    fun addMessage(authorId: String, message: String) {
        val member = members.find { it.userId == authorId }
        if (member != null) {
            val message = newMessage.createNewMessage(authorId, message)
            messages.add(message).toString()
        } else println("Не найден пользователь с ID: $authorId")
    }

    fun printThread() {
        messages.forEach { msg ->
            val memberName = members.find { it.userId == msg.authorId }?.userName
            println("$memberName: ${msg.message}")
        }
    }
}
/*Реализовать класс работы форума (Forum). Для реализации создай дополнительные классы для сущностей
“Член форума” (с полями userId и userName) и “Сообщение форума” (с полями authorId и message).

Примени паттерн “Фабрика” для создания пользователей и сообщений форума. Напрямую объекты не создаются,
логика должна быть инкапсулирована внутри методов класса.

- createNewUser() создает новых пользователей, принимая имя пользователя. Метод сохраняет нового
пользователя в общий список и одновременно возвращает новый объект. Генерация id-шников новых
пользователей происходит внутри;
- createNewMessage() создает сообщения, принимая id пользователя. Сообщения создаются только если
такой пользователь есть на форуме;
- printThread() печатает в консоль все сообщения добавленные на форум в формате:

    автор: сообщение
    автор: сообщение

Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два
сообщения от каждого пользователя.*/
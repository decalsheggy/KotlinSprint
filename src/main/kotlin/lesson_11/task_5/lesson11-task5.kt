package org.example.lesson_11.task_5

fun main() {
    val forum = Forum()

    forum.addMember("user1")
    val user1 = forum.members.last().userId

    forum.addMember("user2")
    val user2 = forum.members.last().userId

    forum.addMember("user3")
    val user3 = forum.members.last().userId

    forum.addMessage(user1, "Работа не волк")
    forum.addMessage(user1, "Работа это ворк")
    forum.addMessage(user2, "А волк это ходить")
    forum.addMessage(user3, "Запомните, а то забудете")
    forum.printThread()
}

class ForumMember(val userId: String, val userName: String)

class ForumMessage(val authorId: String, val message: String)

class Forum {
    val members = mutableListOf<ForumMember>()
    val messages = mutableListOf<ForumMessage>()
    var memberIdCounter = 0

    fun addMember(userName: String): ForumMember {
        val userId = (++memberIdCounter).toString()
        val newMember = ForumMember(userId, userName)
        members.add(newMember)
        return newMember
    }

    fun addMessage(authorId: String, message: String): ForumMessage? {
        val member = members.find { it.userId == authorId }
        return if (member != null) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            newMessage
        } else {
            println("Не найден пользователь с ID: $authorId")
            null
        }
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
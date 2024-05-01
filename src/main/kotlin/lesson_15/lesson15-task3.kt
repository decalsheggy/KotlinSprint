package org.example.lesson_15

fun main() {
    val user = User("User")
    user.print()
    user.read()
    val admin = Admin("Admin")
    admin.print()
    admin.read()
    admin.deleteUser()
    admin.deleteMessage()
}

abstract class ParticipantsOfForum {
    abstract val name: String
    abstract fun read()
    abstract fun print()
}

class User(override val name: String) : ParticipantsOfForum() {
    override fun read() {
        println("Пользователь $name читает сообщение.")
    }

    override fun print() {
        println("Пользователь $name пишет сообщение.")
    }
}

class Admin(override val name: String) : ParticipantsOfForum() {
    override fun read() {
        println("Админ $name читает сообщение.")
    }

    override fun print() {
        println("Админ $name пишет сообщение.")
    }

    fun deleteUser() {
        println("Админ $name удалил пользователя.")
    }
    fun deleteMessage() {
        println("Админ $name удалил сообщение.")
    }

}
/*На форуме есть два типа пользователей – обычные пользователи и администраторы.

Пользователи могут читать форум и писать сообщения.
Администраторы дополнительно могут удалять сообщения и пользователей.

Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс.
У абстрактного класса должны быть соответствующие общие поля и методы.
Действия на форуме отобрази сообщениями в консоль*/
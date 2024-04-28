package org.example.lesson_11.task_3

fun main() {
    val room1 = Room("roomImage", "не выходи из комнаты")

    room1.addParticipant(Participant("ImageView1", "Оля", Participant.defaultStatus[0]))
    room1.addParticipant(Participant("ImageView2", "Света", Participant.defaultStatus[2]))
    room1.addParticipant(Participant("ImageView3", "Лена", Participant.defaultStatus[1]))

    room1.updateStatus("Света", "микрофон выключен")

    println(room1.image)
    println(room1.roomName)

    room1.outputInformation("ImageView1")
    room1.outputInformation("ImageView2")
    room1.outputInformation("ImageView3")
}

class Room(
    val image: String,
    var roomName: String,
    var participants: MutableList<Participant> = mutableListOf()
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun updateStatus(userName: String, newStatus: String) {
        val name = participants.find { it.participantName == userName }
        name?.updateStatus(newStatus)
    }

    fun outputInformation(image: String) {
        val participant = participants.find { it.participantImage == image }
        if (participant != null) println("${participant.participantName}, ${participant.status}")
        else println("Не найден.")
    }
}

class Participant(
    val participantImage: String,
    val participantName: String,
    var status: String,
) {

    companion object {
        val defaultStatus = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    }

    fun updateStatus(newStatus: String) {
        if (newStatus in defaultStatus) status = newStatus
        else println("Не найден.")
    }
}

/*Прокачиваем абстрактное мышление. Задача на проектирование сущностей для упрощенной версии приложения
социальной сети, в которой общаются только голосом. Требуется описать сущности и имитировать действия методами.

Функционал одного из модулей будет такой. Есть лента, в которой отображаются
“комнаты” для общения по интересам. В карточке “комнаты” отображается:

- обложка;
- название;
- список участников — отображаются в виде аватарок. При долгом нажатии на аватар подсветится его никнейм.
Рядом с аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего:
“разговаривает”, “микрофон выключен”, “пользователь заглушен”.

Класс должен содержать методы:

– добавления участника (принимает объект участника и сохраняет в свойство комнаты);
– обновления статуса (принимает имя пользователя и новый статус);
– вывода информации о пользователе при долгом нажатии на аватар.

После проектирования создай объект комнаты с произвольными данными.*/
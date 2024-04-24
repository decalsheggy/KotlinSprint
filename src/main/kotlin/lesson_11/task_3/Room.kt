package org.example.lesson_11.task_3

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

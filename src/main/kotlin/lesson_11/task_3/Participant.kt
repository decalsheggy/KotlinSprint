package org.example.lesson_11.task_3

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
        else println("not found")
    }
}

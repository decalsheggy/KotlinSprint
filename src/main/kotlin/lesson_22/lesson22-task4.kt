package org.example.lesson_22

fun main() {
    val state = MainScreenViewModel()
    state.loadData()
}

class MainScreenViewModel {
    private var mainScreenState: MainScreenState = MainScreenState("Данные отсутствуют")

    fun loadData() {
        println("Загрузка данных:")
        mainScreenState = mainScreenState.copy(isLoading = true)
        printState()

        Thread.sleep(2000)

        val fetchedData = "Загруженные данные с сервера"
        mainScreenState = mainScreenState.copy(data = fetchedData, isLoading = false)
        printState()
    }

    private fun printState() {
        println("Текущее состояние: data = ${mainScreenState.data}, isLoading = ${mainScreenState.isLoading}")
    }
}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)

package org.example.lesson_4

fun main() {
    val damage = false
    val people = 55..70
    val minProvisions = 50//не включительно
    val favorableWeather = true || false
}
/*Научно-исследовательский корабль может приступить
к долгосрочному плаванию при выполнении следующих условий:

- корабль не имеет повреждений;
- число экипажа составляет от 55 до 70 человек (включительно);
- на борту есть более 50 ящиков провизии;
- погода благоприятная или неблагоприятная.

Альтернативно, корабль может отплыть даже при наличии незначительных
повреждений, при условии что:

- на борту рекомендованный состав экипажа - 70 человек;
- погода благоприятна;
- на борту есть 50 и более ящиков провизии.

В качестве входных данных используй информацию, введенную через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание.
Программа должна анализировать эти данные и выводить результат в консоль.
Для анализа должно использоваться единое составное условие,
состоящее только из логических операторов.*/
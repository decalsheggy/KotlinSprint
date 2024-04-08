package org.example.lesson_4


const val MIN_PEOPLE = 55
const val MAX_PEOPLE = 70
const val MIN_PROVISIONS = 50
const val IS_FAVORABLE_WEATHER = true
const val IS_NO_DAMAGE = true

fun main() {
    val peopleOnBoard = 60
    val provision = 51

    if ((IS_NO_DAMAGE) &&
        (peopleOnBoard >= MIN_PEOPLE && peopleOnBoard <= MAX_PEOPLE) &&
        (provision > MIN_PROVISIONS)
    ) {
        println("Научно-исследовательский корабль может приступить" +
                " к долгосрочному плаванию: ${true}.")
    } else if ((peopleOnBoard == MAX_PEOPLE) &&
        (IS_FAVORABLE_WEATHER == true) &&
        (provision >= MIN_PROVISIONS)
    ) {
        println("Научно-исследовательский корабль может приступить" +
                " к долгосрочному плаванию: ${true}.")
    } else {
        println("Научно-исследовательский корабль может приступить" +
                " к долгосрочному плаванию: ${false}.")
    }
}
           /*val isGoSailing = ((IS_NO_DAMAGE)
            && (peopleOnBoard >= MIN_PEOPLE
            && peopleOnBoard <= MAX_PEOPLE)
            && (provision > MIN_PROVISIONS))
            || ((!IS_NO_DAMAGE == true) &&
            (peopleOnBoard == MAX_PEOPLE) &&
            (IS_FAVORABLE_WEATHER == true) &&
            (provision >= MIN_PROVISIONS))
            println(isGoSailing)
Научно-исследовательский корабль может приступить
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
состоящее только из логических операторов.
*/
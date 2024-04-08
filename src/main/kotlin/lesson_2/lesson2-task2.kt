package org.example.lesson2

const val EMPLOYEE_SAL = 30000
const val TRAINEE_SAL = 20000
const val EMPLOYEES = 50
const val TRAINEES = 30

fun main(){
    val costsForEmployees = EMPLOYEE_SAL * EMPLOYEES
    val costsForTrainees = TRAINEE_SAL * TRAINEES
    val costsForEveryone = costsForEmployees + costsForTrainees
    val averageSalary = costsForEveryone / (EMPLOYEES + TRAINEES)

    println("- Расходы на выплату зарплаты постоянных сотрудников: $costsForEmployees рублей;")
    println("– Общие расходы по ЗП после прихода стажеров: $costsForEveryone рублей;")
    println("– Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary рублей.")
}
/* В компании работало 50 человек с зарплатой по 30000 рублей.
Затем в компанию устроилось 30 стажеров, которым назначили зарплату
в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии,
который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

    Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел. */
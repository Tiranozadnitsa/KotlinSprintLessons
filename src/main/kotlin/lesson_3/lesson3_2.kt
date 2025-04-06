package org.example.lesson_3

fun main() {
    var name: String = "Татьяна"
    var patronymic: String = "Сергеевна"
    var firstSurname: String = "Андреева"
    val firstAge: Byte = 20
    val changedAge: Byte = 22
    var changedSurname: String = "Сидорова"

    println("ФИО: $firstSurname $name $patronymic, возраст: $firstAge")
    println("ФИО: $changedSurname $name $patronymic, возраст: $changedAge")

}
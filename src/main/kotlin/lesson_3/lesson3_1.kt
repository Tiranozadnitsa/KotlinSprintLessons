package org.example.lesson_3

fun main() {
    val greetingForDay: String = "Добрый день,"
    val greetingForEvening: String = "Добрый вечер,"
    var userName: String = "Мулан"

    var greeting: String = "$greetingForDay $userName!"
    println(greeting)

    greeting = "$greetingForEvening $userName!"

    println(greeting)
}
package org.example.lesson_4

fun main() {
    val numberOfTables: Byte = 13
    var todayBookedTables: Byte = 13
    var tomorrowBookedTables: Byte = 9

    println("Доступность столиков на сегодня: ${todayBookedTables < numberOfTables},\nДоступность столиков на завтра: ${tomorrowBookedTables < numberOfTables}")
}
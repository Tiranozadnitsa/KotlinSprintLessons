package org.example.lesson_2

fun main() {
    var hoursOfDeparture: Int = 9
    var minutesOfDeparture: Int = 39
    var travelTime: Int = 457
    val minutesInHour: Byte = 60

    var hoursOfArrival: Int = (hoursOfDeparture * minutesInHour + travelTime) / 60
    var minutesOfArrival: Int = (minutesOfDeparture + travelTime) % 60

    println("Время прибытия: $hoursOfArrival:$minutesOfArrival")
}
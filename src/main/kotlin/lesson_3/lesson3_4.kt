package org.example.lesson_3

fun main() {
    var verticalStartPosition: Int = 2
    var horizontalStartPosition: Char = 'E'
    var verticalFinalPosition: Int = 4
    var horizontalFinalPosition: Char = 'E'

    var moveNumber: Short = 3

    println("Ход №$moveNumber: $horizontalStartPosition$verticalStartPosition->$horizontalFinalPosition$verticalFinalPosition")

    verticalStartPosition = 2
    horizontalStartPosition = 'D'
    verticalFinalPosition = verticalStartPosition + 1
    horizontalFinalPosition = horizontalStartPosition
    moveNumber++

    println("Ход №$moveNumber: $horizontalStartPosition$verticalStartPosition->$horizontalFinalPosition$verticalFinalPosition")

}
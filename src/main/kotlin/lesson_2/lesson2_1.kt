package org.example.lesson_2

fun main() {
    val amountOfStudents: Int = 4
    val firstStudent: Int = 3
    val secondStudent: Int = 4
    val thirdStudent: Int = 3
    val fourthStudent: Int = 5
    var averageGrade = (firstStudent.toFloat() + secondStudent.toFloat() + thirdStudent.toFloat() + fourthStudent.toFloat()) / amountOfStudents.toFloat()
    println(averageGrade)
}

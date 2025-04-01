package org.example.lesson_1

fun main(){
    val year: Int = 1961
    var hour: Int = 9 //По Мск
    var minute: Int = 7
    println("$year")
    println("$hour")
    println("$minute")
    hour = 10
    minute = 55

    //вывод как удобнее
    println("$hour:$minute")

    //вывод по подсказке
    print("$hour")
    print(":")
    print("$minute")
}
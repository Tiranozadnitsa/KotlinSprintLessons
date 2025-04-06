package org.example.lesson_4

fun main() {
    var isSun: Boolean = true
    var isAwningOpen: Boolean = true
    var airHumidity: Int = 20
    var currentSeason: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSun == true && isAwningOpen == true && airHumidity == 20 && currentSeason != "зима"}")
}
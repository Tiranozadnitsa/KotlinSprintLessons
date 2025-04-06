package org.example.lesson_4

fun main() {
    val minKgAverage: Int = 35
    val maxKgAverage: Int = 100
    val maxLiterAverage: Int = 100
    var weightCargo: Int = 42
    var volumeOfCargo: Int = 120

    println("Груз с весом $weightCargo кг и объемом $volumeOfCargo л соответствует категории 'Average': ${weightCargo > minKgAverage && weightCargo <= maxKgAverage && volumeOfCargo < maxLiterAverage}")

    weightCargo = 20
    volumeOfCargo = 80
    println("Груз с весом $weightCargo кг и объемом $volumeOfCargo л соответствует категории 'Average': ${weightCargo > minKgAverage && weightCargo <= maxKgAverage && volumeOfCargo < maxLiterAverage}")

    weightCargo = 50
    volumeOfCargo = 100
    println("Груз с весом $weightCargo кг и объемом $volumeOfCargo л соответствует категории 'Average': ${weightCargo > minKgAverage && weightCargo <= maxKgAverage && volumeOfCargo < maxLiterAverage}")

}
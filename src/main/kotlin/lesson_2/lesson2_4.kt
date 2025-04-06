package org.example.lesson_2

fun main() {
    var buff: Int = 20
    var crystallineOre: Int = 7
    var ironOre: Int = 11

    var coeffBuff: Double = (100 + buff.toDouble()) / 100
    var bonusCrystallineOre: Int = (crystallineOre * coeffBuff - crystallineOre).toInt()
    var bonusIronOre: Int = (ironOre * coeffBuff - ironOre).toInt()

    println("Количество бонусной кристаллической руды: $bonusCrystallineOre")
    println("Количество бонусной железной руды: $bonusIronOre")
}
package org.example.lesson_2

fun main() {
    var buff: Int = 20
    var crystallineOre: Int = 7
    var ironOre: Int = 11

    var bonusCrystallineOre: Int = (crystallineOre.toDouble() * ((100+buff.toFloat())/100) - crystallineOre).toInt()
    var bonusIronOre: Int = (ironOre.toDouble() * ((100+buff.toFloat())/100) - ironOre).toInt()

            println("Количество бонусной кристаллической руды: $bonusCrystallineOre")
            println("Количество бонусной железной руды: $bonusIronOre")
}
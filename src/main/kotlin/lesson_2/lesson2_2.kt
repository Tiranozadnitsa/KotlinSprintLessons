package org.example.lesson_2

fun main() {
    var amountOfPermanentEmployees: Int = 50
    var salaryOfPermanentEmployees: Int = 30000
    var amountOfInterns: Int = 30
    var salaryOfInterns: Int = 20000

    var expensesForPermanentEmployees: Int = amountOfPermanentEmployees * salaryOfPermanentEmployees
    var totalExpenses: Int = expensesForPermanentEmployees + amountOfInterns * salaryOfInterns
    var averageSalary: Int = totalExpenses / (amountOfInterns + amountOfPermanentEmployees)

    println(expensesForPermanentEmployees)
    println(totalExpenses)
    println(averageSalary)
}
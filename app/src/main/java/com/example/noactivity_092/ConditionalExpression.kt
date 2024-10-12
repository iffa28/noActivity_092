package com.example.noactivity_092

fun conditionalStatement() {
    println("===Conditional Expression ===")
    //if-else
    val number = 10
    if (number > 1) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    //when
    val day = 1
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }

    //Try - Catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid Number")
    }
}

fun Perulangan() {
    println()
    println("=== Perulangan ===")

    for ( i in 1..5) {
        println("Perulangan ke-$i")
    }
    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }

    var x = 1
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }





}
fun main() {
    conditionalStatement()
    Perulangan()
}
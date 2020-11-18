package com.example.testkotlin

// ----- RANGES -----
// You define ranges by providing a starting and ending
// value
fun main(args : Array<String> ) {
    val oneTo10 = 1..10
    val alpha = "A".."Z"

// Use in to search a Range
    println("R in alpha : ${"R" in alpha}")

// Create ranges that decrement
    val tenTo1 = 10.downTo(1)

// Create array up to a value
    val twoTo20 = 2.rangeTo(20)

// Step through an array while adding 3 to the index
    val rng3 = oneTo10.step(3)

// Cycle through a range and print
    for (x in rng3) println("rng3 : $x")

// Reverse a range
    for (x in tenTo1.reversed()) println("Reverse : $x")

}

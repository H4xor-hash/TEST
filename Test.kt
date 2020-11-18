package com.example.testkotlin
fun main(args : Array<String> ) {
    var arr3: Array<Int> = arrayOf(3,6,9)

    // Iterate for indexes
    for (i in arr3.indices){
        println("Mult 3 : ${arr3[i]}")
    }

}


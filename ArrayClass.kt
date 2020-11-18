package com.example.testkotlin

fun main(args : Array<String> ){
    //define
    var myArray = arrayOf(1,1.23,"Nima")

    //read from array
    println(myArray[2])

    //change value
    myArray[1]=3.14

    //get size
    println("Array size :  ${myArray.size}")

    //array is include some element
    println("Nima in array ?   ${myArray.contains("Nima")}")

    //get part of an array
    var partArray = myArray.copyOfRange(0,1)

    //get first and the last element
    println("First : ${partArray.first()}")
    println("last : ${partArray.last()}")


    //get the index of n element
    //what is the first index for "nime" string
    println("Nima index : ${myArray.indexOf("Nima")}")



    //array full of square
    var sqArray = Array(5,{x->x*x})
    println(sqArray[2])


    //define array of a specific type
    var arr2:Array<Int> = arrayOf(1,2,3,4)

    //for two dimentional array go to :
    //https://www.techiedelight.com/declare-and-initialize-two-dimensional-array-kotlin/
}

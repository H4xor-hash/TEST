package com.example.testkotlin

    fun main(args : Array<String> ){
        println("Hello World!")
        val name="Nima" //unchangable
        var myAge = 42 //changable

        //we can define our type like this
        var bigInt : Int = Int.MAX_VALUE // max value of integer inside the bigInt
        var smallInt : Int = Int.MIN_VALUE

        println("big=" + bigInt)
        println("big= $bigInt")


        //using "is" for defining type
        var letterGrade: Char='A'
        println("A is a Char :  ${letterGrade is Char}")

        //casting
        println("A to Int : " + ('A'.toInt()))

        //String
        val myName="Nima"
        val longString = """This is the long string"""
        var fName: String = "Nima"
        var lName: String = "  AK"
        fName = "ABCDEFGHIJKLMNOP"
        var fullName = fName+ "" + lName
        println("full name  is $fullName")

        //String compare
        println("String Equal : ${fName.equals(lName)}") //return true  or false
        println("Compare A and B : ${"A".compareTo("B")}") // return 0 or 1

        //get the second index of a string
        println("String Equal : ${fName.get(2)}")
        //OR
        println("String Equal : ${fName[2]}")

        //getting index of an intervale for example index 2 to 7
        println("Index 2-7 of fName ${fName.subSequence(2,8)}")//it come back to 7 not 8

        //see if the string contain any string
        println("Contain random : ${fName.contains("random")}") //fname contain "random" string or not ?


    }

package Loops

fun main(args: Array<String>) {

    var upperLimit: Int
    var numberofdivisors: Int
    println("Enter Upper Limit: ")
    upperLimit = readLine()!!.toInt()

    for (i in 2..upperLimit){
        numberofdivisors = 0
        for (j in 1..i) {

            if (i % j == 0) numberofdivisors++
        }
        if (numberofdivisors == 2) println(i)
    }
}
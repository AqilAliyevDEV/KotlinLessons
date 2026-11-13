package Loops

fun main(args: Array<String>){

    //Break

    for (i in 1..5) {
        if( i == 5) break
        println(i)
    }

    //A program that sums the numbers entered until the user inputs 0

    var num: Int
    var total: Int = 0
    while (true){
        println("Enter Number: ")
        num = readLine()!!.toInt()

        if (num == 0) break
        total += num
    }

    println("Total: $total")

    //Continue

    for (t in 1..5) {
        if (t == 5) continue
        println(t)
    }

    //A program that calculates the sum of the positive numbers among 5 entered numbers

    var num1: Int
    var total1: Int = 0

    for (a in 1..5) {
        println("Enter a number: ")
        num1 = readLine()!!.toInt()

        if(num1 < 0) continue
        total1 += num1
    }
    println("Total: $total1")
}
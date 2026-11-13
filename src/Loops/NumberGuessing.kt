package Loops

import java.util.*

fun main(ags: Array<String>) {

//    var guess = Random()
//    var num = guess.nextInt(5)
//    println(num)


    var guess = Random()
    var num = guess.nextInt(100) + 1
    var gnum: Int

    println("Enter guess: ")

    while (true){

        gnum = readLine()!!.toInt()

        if (gnum == num) break
        else if(gnum > num) println("Enter smallest guess: ")
        else println("Enter biggest guess: ")
    }
    println("guess is $num")


}
package ConditionalStatements

fun main(args: Array<String>) {
    /*
        when (the variable to be checked against the condition) {
        condition1 -> // code to be executed
        condition2 -> // code to be executed
        condition3 -> // code to be executed
        else -> // code to be executed if none of the conditions are met
        }
    */

    var num = 1
    when (num) {
        1 -> println("1")
        2 -> println("2")
        5 -> println("5")
        else -> println("else")
    }


    var num1 = 1
    var result = when (num) {
        1 -> {
            println("1")
            println("hello")
        }
        else -> println("undefined")
    }

    var x = 13
    when (x) {
        in 1..10 -> println("number is in the 1 10")
        !in 1..10 -> println("number is outside the 1 10")
    }


}
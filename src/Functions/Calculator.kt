package Functions

fun main(args: Array<String>) {

//    var result = addition(5, 8)
//    println(result)

//    var result = calculate(5, 8, "+")
//    println(result)

    infiniteLoop()


}

fun infiniteLoop(){
    var a: Int
    var b: Int
    var operation: String
    var score: Int
    while (true) {
        println("First Number: ")
        a = readLine()!!.toInt()

        println("Second Number: ")
        b = readLine()!!.toInt()

        if(a == 0 && b == 0) break
        println("Operation: ")
        operation = readLine()!!.toString()

        println("Your calculate is : ${calculate(a, b, operation)}")
    }
    println("You ended loop")
}


fun addition (a: Int, b: Int): Int = a + b
fun substraction (a: Int, b: Int): Int = a - b
fun multiplication (a: Int, b: Int): Int = a * b
fun division (a: Int, b: Int): Int = a / b

fun calculate(a: Int, b: Int, operation: String): Int = when (operation) {
    "+" -> addition(a, b)
    "-" -> substraction(a, b)
    "*" -> multiplication(a, b)
    "/" -> division(a, b)
    else -> 0
}

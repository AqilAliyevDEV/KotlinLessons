package functionalprograming

fun main(args: Array<String>) {

    hello()
    hello2()

    addition(15, 28)
    addition2(15, 28)

    max(15, 28)
    max2(15, 28)

    var myLambda: (String, String) -> Unit = {name, lastName ->
        println("Name: $name, Age: $lastName")
    }

    /*
    // Same as above
    var myLambda = {name: String, lastName: String -> println("Name: $name, Age: $lastName")}
    */
    myLambda("Aqil", "Aliyev")


    val list = listOf(1, 2, 3, 4, 5)
    list.forEach { i -> println(i) }
    list.forEach { println(it) } // vIf the lambda function has a single parameter, you can use it, which is short for iteration.


}

fun hello() = println("hello")
var hello2 = {println("hello")}

fun addition(a: Int, b: Int): Int = a + b
var addition2 = {a: Int, b: Int -> a + b}

fun max(a: Int, b: Int): Int = if (a > b) a else b
var max2 = {a: Int, b: Int -> if (a > b) a else b}


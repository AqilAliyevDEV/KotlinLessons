package Functions



    /*
    1. All infix functions are extension functions, but not all
    extension functions are infix functions.
    2. Infix functions take a single parameter.
    */


fun main(args: Array<String>) {

    5 downTo 1
    5.downTo(1)

    var b = 5 topla 4
    println(b)
    println(8.topla(7))

    var c: String = "Kotlin".concat("Android")
    println(c)

}

infix fun Int.topla(num: Int): Int = this + num

infix fun String.concat(other: String): String = this + other
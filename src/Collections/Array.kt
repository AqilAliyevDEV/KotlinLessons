package Collections

/*
    Array : mutable (fixed-size)

    Collections
    Immutable (Read only)
        1. Immutable List -> listOf
        2. Immutable Map -> mapOf
        3. Immutable Set -> setOf

    Mutable (Read and write)
    1. Mutable List -> ArrayList, arrayListOf, mutableListOf
    2. Mutable Map -> HashMap, hashMapOf, mutableMapOf
    3. Mutable Set -> mutableSetOf, hashSetOf
*/

fun main(args: Array<String>) {

    var array = Array<Int>(5) {0} //All elements is 0

    var array2 = arrayOf(1, 2, 3)
    println(array2[2])

    println(array2[0])
    array2[0] = 20
    println(array2[0])

    for (items in array2) println(items)

    array2[3] = 25 //ArrayIndexOutOfBoundsException


}
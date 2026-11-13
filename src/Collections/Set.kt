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

    // SET : A structure that holds data as unique (single) values

    //IMMUTABLE SET
    var set = setOf<Int>(1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 8, 9, 10)
    println(set.size)

    //MUTABLE SET
    var set2 = mutableSetOf<Int>(1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 8, 9, 10)
    set2.add(25)
    set2.add(25)

    println()
    for (item in set2) println(item)

    set2.remove(3)
    println()
    for (item in set2) println(item)

    var set3 = hashSetOf<Int>(1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 8, 9, 10)
    println()
    for (item in set3) println(item)
}
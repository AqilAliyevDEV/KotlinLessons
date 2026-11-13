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

fun main(args: Array<String>){

    var list = listOf<String>("Java", "kotlin", "PHP", "C++", "Node.js")
    println(list)
    // list[0] = "Kotlin" //Immutable list not changed read only

    for (item in list) println(item)

    for (i in 0..list.size-1) println(list[i])

}
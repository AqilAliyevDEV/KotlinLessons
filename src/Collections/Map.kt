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

    // MAP : Stores data as key-value pairs.

    //IMMUTABLE MAP
    var map = mapOf<Int, String>() //Immutable, constant element

    var map2 = mapOf<Int, String>(20 to "Aqil", 25 to "John", 18 to "Elizabeth")

    for (key in map2.keys) println("Key: $key, Value: ${map2[key]}")

    //MUTABLE MAP
    var map3 = HashMap<Int, String>() //Mutable dynamic

    map3.put(12, "Aqil")
    map3.put(25, "John")
    map3.put(18, "Elizabeth")
    map3.put(28, "Jonathan")

    println("-------")
    for (key in map3.keys) println("Key: $key, Value: ${map3[key]}")

    map3.replace(25, "Wick")
    println("-------")
    for (key in map3.keys) println("Key: $key, Value: ${map3[key]}")

    map3.remove(25)
    println("-------")
    for (key in map3.keys) println("Key: $key, Value: ${map3[key]}")

    var map4 = hashMapOf<Int, String>(20 to "Aqil", 25 to "John", 18 to "Elizabeth", 28 to "Jonathan") //HashMap
    println("-------")
    for (key in map4.keys) println("Key: $key, Value: ${map4[key]}")


    var map5 = mutableMapOf<Int, String>(20 to "Aqil", 25 to "John", 18 to "Elizabeth", 28 to "Jonathan") //Linked HashMap
    println("-------")
    for (key in map5.keys) println("key: $key, Value: ${map5[key]}")

}


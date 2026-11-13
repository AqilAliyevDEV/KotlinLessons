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

    var list = mutableListOf<String>("Kotlin", "Java", "Asp.net", "Python", "Rubby")
    println("--------Original List----------")
    for (items in list) println(items)

    println()
    println("------Changing an element------")
    list[2] = "CSharp"
    for (items in list) println(items)

    println()
    println("------Adding an element------")
    list.add("JavaScript")
    for (items in list) println(items)

    println()
    println("------Removing an element by name------")
    list.remove("Java")
    for (items in list) println(items)

    println()
    println("------Removing an element by index------")
    list.removeAt(0)
    for (items in list) println(items)


    var list1 = mutableListOf<String>()
    var list2 = arrayListOf<String>()
    var list3 = ArrayList<String>() // not add element in this scope
    list3.add("Kotlin") //using add
}
package SpecialFunctions

fun main(args: Array<String>) {

    //FILTER

    var list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    var list2 = list.filter {it > 10} // = t -> t > 10

    list2.printArray()

    println()

    var list3 = list.map {it * 2}
    list3.printArray()

    var a = list.all { it > 5 }
    println(a)

    var b = list.any { it > 10 }
    println(b)

    var c = list.count {it > 5}
    println(c)

    var d = list.find {it > 2}
    println(d)



}

fun <T> List<T>.printArray(){
    for (item in this) println(item)
}
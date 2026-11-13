package generics

fun main(args: Array<String>) {

    printRepeated("hello world", 5)
    printRepeated(100, 9)

    val list = arrayOf(1, 2, 3, 4, 5)
    val list2 = arrayOf("Kotlin", "Java", "JavaScript", "Python", "Rubby")
    val list3 = arrayOf(2.3, 1.5, -9.2, 1.0, 0.7)

    printArray(list)
    printArray(list2)
    printArray(list3)

    list.printArrayExt()
    list2.printArrayExt()
    list3.printArrayExt()

    var result = maximum(2.3, 7.5, 4.7)
    println(result)

}

fun <T> printRepeated(t: T, k: Int) {
    for (i in 0..k) println(t)
}

fun <T> printArray(myArray:Array<T>) {
    for (items in myArray) println(items)
}

fun <T> Array<T>.printArrayExt() {             // Generic Extension functions
    for (items in this) println(items)
}

fun <T: Comparable<T>> maximum(x: T, y: T, z: T): T {
    var max = x

    if (y.compareTo(max) > 0) max = y

    if (z.compareTo(max) > 0) max = z

    return max
}
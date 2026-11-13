package Functions

fun main(args: Array<String>) {
    println(multiple(5))
    println(5.triple())
    println(10.triple())

    println("kotlin".reversed())

    var list = arrayListOf<String>("Kotlin", "Java", "JavaScript", "C#")
    for (item in list) println(item)

    list.swap(0, 3)
    for (item in list) println(item)

}

fun multiple(num: Int) = num * 3

fun Int.triple() = this * 3

fun ArrayList<String>.swap(x: Int, y: Int){
    val temp = this[x]
    this[x] = this[y]
    this[y] = temp

}
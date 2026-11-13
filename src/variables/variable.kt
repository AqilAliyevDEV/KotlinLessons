package variables

fun main(args: Array<String>) {
    val name: String? = "Kotlin Lesson"
    println(name?.length)

    val name1: String? = null //Null safety
    println(name1?.length)

    val name2: String? = null
    //println(name2!!.length) //Null pointer exception
}
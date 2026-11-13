package operators

fun main(args: Array<String>) {

    //1 assignment operators
    var x = 5
    var y = 10

    println(x)
    println(y)

    x = y
    println(x)
    println(y)

    x++
    x--


    //2 Arithmetic operators
    // + - * / %

    //3 relational operators
    // >, <, =>, =<, !=


    //4 Logical Operators
    // && , ||
    var g = true
    var f = false
    println(g && f) // false
    println(g || f) // true

    //5 Concatenation Operators
    // +
    var lessonname: String = "Kotlin"
    var lessonname2: String = "Java"
    println(lessonname + lessonname2) //KotlinJava
    println("$lessonname lesson") // Kotlin lesson
    println("$lessonname2 lesson") //Java Lesson
    println("${lessonname.length} length") // 6 length
}
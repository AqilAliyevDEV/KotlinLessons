package Loops

fun main(args: Array<String>){

    /*
    WHILE LOOP
    while(condition) {
        // code to run
    }
     */

    var i = 1
    while (i <= 100){
        println("Kotlin")
        i++
    }

    //print even digits which one locate between 0 to 100
    var a = 0
    while (a <= 100){
        if(a % 2 == 0){
            println(a)
        }
        a++
    }

    //print single digits which one located between 0 to 100
    var b = 0
    while (b <= 100) {
        if (b % 2 == 1) {
            println(b)
        }
        b++
    }

    // Do While
    /*
    do{
        //code to run
    }while(condition
     */

    var t = 1
    do{
        println(t)
        t++
    }while (t < 11)

    var y = 1
    while (y < 11){
        println(y)
        y++
    }

    var name: String
    var password: String
    do{
        println("Enter your Name: ")
        name = readLine().toString() // readLine() returns String?, so you need to add .toString() or !!

        println("Enter your password: ")
        password = readLine().toString() //readLine().toString() yerinə readln()
    }while(name != "Kotlin" || password != "123")

    println("Logged is successful")

}
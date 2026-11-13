package Functions

fun main(args: Array<String>) {

    /*
    fun functionName (parametr){
        //code to be run
    }
     */

    //println("Hello World")
    helloWorld()
    helloWorld2()
    writeMessage("Hello")
    var message = getMessage()
    println(message)

    var message2 = getMessage2()
    println(message2)

    var getNameLastName = getFullName("John", "Wick")
    println(getNameLastName)
}



fun helloWorld(){
    println("Hello World")
}

fun helloWorld2() = println("Hello World")

fun writeMessage(message: String){
    println("Your Message is : $message")
}

fun getMessage(): String {
    return "Hello John"
}

fun getMessage2(): String = "Welcome Back"

fun getFullName(name: String, lastName: String): String = "Name : $name, Lastname : $lastName"
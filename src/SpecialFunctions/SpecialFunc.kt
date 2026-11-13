package SpecialFunctions

fun main(args: Array<String>) {


    // LET //
    // The let function checks whether a variable is null or not.

    var str: String? = "kotlin"
    if (str != null) {
        //Code to run when it is not null
    }else{
        //Code to run when it is null
    }

    str?.let{
        //Code to run when it is not null
        println("Not null")
    } ?: println("null")  // Code to run when it is null

    val result = str?.let{
        println(it) //Argument
        5 // return value
    }

    println(result)

    // APPLY //
    val task = Runnable {println("running")}
    val thread = Thread(task)
    thread.isDaemon = true
    thread.name = "thread"
    thread.state
    thread.start()


    val task2 = Runnable {println("running")}
    val thread2 = Thread(task2)
    thread2.apply {
        isDaemon = true
        name = "thread2"
        state
        start()
    }

    var dev = Developer()
    dev.name = "Aqil"
    dev.age = 20

    dev.writeCode()

    dev.apply {
        age = 24
        name = "Steve"
        writeCode()
    }

    // REPEAT //
    repeat(10, {println("Kotlin")})

}

class Developer {
    var name: String? = null
    var age: Int? = null

    fun writeCode() = println("Write code")
}
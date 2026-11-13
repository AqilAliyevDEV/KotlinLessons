package SpecialFunctions

fun main(args: Array<String>) {

    // WITH

    var person = Person()

    with(person) {
        name = "Bob"
        age = 23

        eat()
        run()
    }

    // With = Apply
    person.apply {
        name = "Aqil"
        age = 20

        eat()
        run()
    }


    //RUN

    // run = with + let
//    val outputPath = Paths.get("/user/home").run {
//        val path = resolve("output")
//        path.toFile().createNewFile()
//        path
//    }

    val address = Address("new street", 12445)
    val user = User("Edmund", address)

    val result = user.also {it.age = 50}

    println(user)


    // TAKEIF //
    // It returns the object if the condition is true, and null if it is not.
    var person1 = Person()
    var x = person1.takeIf { it !is Person } ?: "not a person"
    println(x)

    //TAKEUNLESS
    //Take Unless is opposite of Take If
    var y = person1.takeUnless { it is Person } ?: "a person"
    println(y)

}

class Person {
    var name: String? = null
    var age: Int = 0

    fun eat() = println("eating")
    fun run() = println("running")
}


data class Address(var street: String? = null, var code: Int? = null)
data class User(var name: String? = null, var adress: Address? = null, var age: Int? = null)
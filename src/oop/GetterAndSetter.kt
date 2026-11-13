package oop

fun main(args: Array<String>) {

    var person = Person2()
    person.name = "Aqil"
    var firstName = person.name

    var user1 = User1()
    user1.actualAge = 15
    user1.age = 15

    println("User1 actual age is : ${user1.actualAge}")
    println("User1 age is : ${user1.age}")

    var user2 = User1()
    user2.actualAge = 35
    user2.age = 35
    println("User2 actual age is : ${user2.actualAge}")
    println("User2 age is : ${user2.age}")

}

class Person2 {
    var name: String = "Steve"
        get() = field
        set(value) {
            field = value
        }

}


class User1 {
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value -3
        }

    var actualAge: Int = 0
}


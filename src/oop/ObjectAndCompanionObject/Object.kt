package oop.ObjectAndCompanionObject

fun main(args: Array<String>) {

    var result = MyObject.multiple(6, 5)
    println(result)

    MyObject.a
    MyObject.b
    println(Math.min(6, 5))

    var person = object : Person(){
        override fun writeCode() {
            println("I don't write code.")


        }
    }

    person.talk()
    person.eat()
    person.writeCode()

    println(person.javaClass)

    var person2 = Person()
    println(person2.javaClass)

}

object ObjectExample {
    //property
    //method
}

object MyObject {
    var a: Int = 0
    var b: Int = 1

    fun multiple(x: Int, y: Int): Int = x * y
}

open class Person {
    fun eat() = println("Eating food")
    fun talk() = println("Talking people")

    open fun writeCode() = println("Writing Code")
}
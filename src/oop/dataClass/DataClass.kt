package oop.dataClass

fun main(args: Array<String>) {

    val person1 = Person("Aqil", 20)
    println("name: ${person1.name}, age: ${person1.age}")

    println("name: ${person1.component1()}, age: ${person1.component2()}")

    val person2 = person1.copy("Steve")
    println("name: ${person2.name}, age: ${person2.age}")

    println(person2.toString())

    val person3 = person2.copy()

    println("person1 hashcode = ${person1.hashCode()}")
    println("person2 hashcode = ${person2.hashCode()}")
    println("person3 hashcode = ${person3.hashCode()}")

    if (person1.equals(person2)) println("person1 equals person2")
    else println("person1 not equals person2")

    if (person2.equals(person3)) println("person2 equals person3")
    else println("person2 not equals person3")

}

data class Person(var name: String, var age: Int)
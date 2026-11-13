package oop.Abstraction

import oop.calculateForDay

/*
    ABSTRACTION
    1. Objects cannot be instantiated from an abstract class.
    2. If a class contains an abstract method, that class must also be abstract.
    3. Abstract subclasses can be derived from abstract classes.
       In this case, it does not have to override the superclass's abstract method.
*/

fun main(args: Array<String>) {

    val aqil = Teacher("Aqil")
    aqil.writeJobDescription("Android Developer")
    aqil.showAge(20)

//    var person = Person() // GIVES AN ERROR. An object cannot be created from an abstract class.

}

abstract class Person(name: String) {
    init {
        println("Name: $name")
    }

    fun showAge(age: Int) {
        println("Age: $age")
    }

    abstract fun writeJobDescription(jobDescription: String)
}

class Teacher(name: String): Person(name) {

    override fun writeJobDescription(jobDescription: String) {
        println(jobDescription)
    }

}

abstract class Shape(var height: Int, var width: Int) {
    abstract fun calculateArea(height: Int, width: Int)
}

abstract class Rectangle(height: Int, width: Int): Shape(height, width) {

}
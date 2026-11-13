package oop

fun main(args: Array<String>) {

    var p = Person("Steve", 24)
    var p2 = Person("John")
    var p3 = Person(age = 12)
    // p.age = 25  // access is not provided
    var age1 = p.age


    var user1 = User("trump", 56)

}

class Person(var name: String? = null, val age: Int? =  0) {

    // var - When you write var, you can both write and read at the same time.
    //val - When you write val, you can read only


    //class Person(name: String, age: Int)  //property


    /*
    //Constructor

    var name: String? = null
    var age: Int? = null


    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }
     */
}

class User(firstName: String, userAge: Int){
    var name: String? = null
    var age: Int? = null

    init{
        name = firstName.capitalize()
        age  = userAge

        println("First Name: $name")
        println("Age: $age")
    }
}
package oop.Inheritance

fun main(args: Array<String>) {
    var teacher = Teacher("Aqil", 20)
    teacher.techLesson()

    println()
    var footballPlayer = FootballPlayer("Messi", 40)
    footballPlayer.playFootball()

    println()
    var businessman = Businessman("Elon Musk", 38)
    businessman.working()


}


open class Human(var name: String, var age: Int) {
    init {
        println("Name: $name")
        println("Age: $age")
    }
}

class Teacher(name: String, age: Int): Human(name, age){
    fun techLesson() = println("$name teach lesson")
}

class FootballPlayer(name: String, age: Int): Human(name, age) {
    fun playFootball() = println("$name plays football")
}

class Businessman(name: String, age: Int): Human(name, age) {
    fun working() = println("$name working")
}
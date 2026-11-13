package oop.Inheritance

fun main(args: Array<String>) {

    var girl = Girl()
    girl.displayAge(15)
    girl.name = "Elizabeth"

    println("Name: ${girl.name}")
}

open class Person(){
    open fun displayAge(age: Int) {
        println("Age: $age")
    }

    open var name: String? = null
        get() = field
        set(value) {
            field = value
        }


}

class Girl: Person() {
    override fun displayAge(age: Int) {
        println("Age: ${age - 5}")

        super.displayAge(age)
    }


    override var name: String? = null
        get() = super.name
        set(value) {
            field = if (value == null) "No Name" else value
        }

}
package oop.ObjectAndCompanionObject

fun main(args: Array<String>) {

    val user = User()
    user.name
    user.func()

    User.age
    User.callMe()
}

class User {
    var name: String? = null

    companion object{
        var age: Int? = 20
        fun callMe() = println("Called")
    }

    fun func() = println("Function")
}
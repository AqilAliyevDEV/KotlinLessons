package oop.Interface

fun main(args: Array<String>) {

    var z = Z()
    z.hello()
}

interface X {
    fun hello() {
        println("Hello from X")
    }
}

interface T {
    fun tfunc()
}

interface B {
    interface C {
        fun cfunc()
    }
}

interface Y: T {
    fun hello() {
        println("Hello from Y")
    }
}

class Z: X, Y, B.C {
    override fun hello() {
        super<X>.hello()
        super<Y>.hello()
    }

    override fun tfunc() {

    }

    override fun cfunc(){

    }
}
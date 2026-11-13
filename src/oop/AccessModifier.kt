package oop

/*
     public -> Open to everyone. All classes can access it.
     private -> Accessible only from within its own class.
     protected -> Accessible from its own class and subclasses.
     internal -> Accessible only from within its own module
*/

fun main(args: Array<String>) {

}

class PublicClass {
    val i = 1
    fun func() {
        var pc = PrivateClass()
       // pc.a  // access is not provided
       // pc.privateFunc()  // access is not provided
    }
}

private class PrivateClass {
    private val a = 0
    private fun privateFunc() {

    }
}

open class A {
    protected val b = 2
}

class B: A() {
    fun getMethod() = b
}

class C {
    fun getValue() {
        var a = A()
        // a.b
    }
}

internal class InternalClass {
    var i = 5
}

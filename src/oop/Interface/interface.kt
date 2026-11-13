package oop.Interface

fun main(args: Array<String>) {

    val myinterface = InterfaceImpl()
    println("Prop: ${myinterface.prop}")

    myinterface.foo()
    myinterface.hello()
}

interface InterfaceName {
    // properties
    // methods
}

interface MyInterface {
    var prop: String

    fun foo()
    fun hello() = "hello world"
}

interface A {
    fun afunc()
}

class InterfaceImpl : MyInterface, A {

    override var prop: String = ""

    override fun foo() {

    }

    override fun afunc() {

    }

}
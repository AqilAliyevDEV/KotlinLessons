package generics

import oop.Interface.T

fun main(args: Array<String>) {

    var box = Box<Int>()
    box.add(3)

    var box2 = Box<Boolean>()
    box2.add(false)

    var myclass = MyClass<SecondClass>()
    myclass.myFunc(SecondClass())
}

class Box<T>{
    var s: T? = null

    fun add(s: T){
        this.s = s
    }

    fun get(): T? = this.s
}

open class FirstClass {
    fun first() { }
}

class SecondClass: FirstClass() {
    fun second() { }
}

class ThirdClass: FirstClass() {
    fun third() { }
}

class MyClass<T: FirstClass> {
    fun myFunc(t: T) {

    }
}

class Producer<out T>(val value: T) {
    fun get(): T = value
}

class Consumer<in S> {
    fun toString(value: S): String {
        return value.toString()
    }
}



package functionalprograming

fun main(args: Array<String>) {

    callMe {
        println("Hello")
    }

    sayHello("Aqil", {
        println(it)
    })
    foo("Kotlin", {
        it.reversed()
    })

    add(3, 6, {
        println(it)
    })

    fooBar {
        func1()
        func2()
        func3()
        prop
    }
}

fun callMe(func: () -> Unit){
    func()
}

fun sayHello(name: String, body: (String) -> Unit){
    body("Hello $name")
}

fun foo(str: String, func: (String) -> String) {
    var x = func(str)
    println(x)
}

fun add(a: Int, b: Int, action: (Int) -> Unit) {
    action(a + b)
}

class Bar {
    var prop: String? = null
    fun func1() = println("func1")
    fun func2() = println("func2")
    fun func3() = println("func3")
}

fun fooBar(block: Bar.() -> Unit) {
    var bar = Bar()
    bar.block()
}
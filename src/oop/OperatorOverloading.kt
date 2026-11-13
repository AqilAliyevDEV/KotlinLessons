package oop

/*
    https://kotlinlang.org/docs/reference/operator-overloading.html

    a++     a.inc()
    a--     a.dec()
    a + b   a.plus(b)
    a - b   a.minus(b)
    a * b   a.times(b)
    a / b   a.div(b)
    a % b   a.rem(b), a.mod(b) (deprecated)
    a..b    a.rangeTo(b)
*/

fun main(args: Array<String>) {

    var a: Int = 1
    a++
    var b: Double = 1.0
    b++

    //ObjectName++

    var point = Point(3, -6)
    ++point

    println("point: ${point.x}, ${point.y}")

    val fraction1 = Fraction(1, 3)
    val fraction2 = Fraction(1, 4)
    val result = fraction1 + fraction2
    println(result)

}

class Point(var x: Int = 0, var y: Int = 5) {
    operator fun inc() = Point(++x, ++y)
}


data class Fraction(val numerator: Int, val denominator: Int) {
    operator fun plus(addedFraction: Fraction): Fraction =
        if (this.denominator == addedFraction.denominator)
            Fraction(this.numerator + addedFraction.numerator, this.denominator)
        else
            Fraction(
                this.numerator * addedFraction.denominator + addedFraction.numerator * this.denominator,
                this.denominator * addedFraction.denominator
            )
}

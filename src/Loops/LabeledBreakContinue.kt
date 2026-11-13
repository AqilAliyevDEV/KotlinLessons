package Loops

fun main(args: Array<String>) {

    outerloop@ for (i in 1..3) {
        innerloop@ for (j in 1..5) {

            if (i == 2) break@outerloop
            println("i = $i, j = $j")

        }
    }

    outerloop@ for (t in 1..3) {
        innerloop@ for (y in 1..5) {

            if (t == 2) continue@outerloop
            println("t = $t, y = $y")
        }
    }


}
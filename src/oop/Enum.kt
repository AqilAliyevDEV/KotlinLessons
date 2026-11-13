package oop

fun main(args: Array<String>) {

    calculateForDay(Days.THURSDAY, 100)

    println(Colors.RED.rgb)
    println(Colors.Green.rgb)
    println(Colors.Blue.rgb)

}

fun calculateForDay(day: Days, value: Int): Int =
    when (day) {
        Days.MONDAY -> value + 6
        Days.TUESDAY -> value * 5
        Days.WEDNESDAY -> value
        Days.THURSDAY -> value - 5
        Days.FRIDAY  -> value * value
        Days.SATURDAY -> value - 2
        Days.SUNDAY -> value + 10
        else -> -1
    }


enum class Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


enum class Colors(val rgb: Int) {
    RED(0xFF0000),
    Green(0x00FF00),
    Blue(0x0000FF)
}
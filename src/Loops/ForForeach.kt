package Loops

/*
 * Loops
 * 1. For
 * 2. ForEach
 * 3. While
 * 4. Do-While
 */


fun main(args: Array<String>){

    // For
    /*
     * for (loop variable in range) {
     *     // Code to be executed
     * }
     */

    for(i in 1..5) println(i)
    for(a in 5..1) println(a) //don't give output
    for(b in 5 downTo 1) println(b)
    for(c in 5.downTo(1)) println(c)
    for(d in 1..5 step 2) println(d)
    for(e in 5 downTo 1 step 2) println(e)

    // ForEach

    /*
    (range).forEach { loopVariable ->
        // Code to be executed
     */

    (1..10).forEach {f -> println(f)}
    (1..10 step 2).forEach {g -> println(g)}
    (10 downTo 1 step 2).forEach {h -> println(h)}


}
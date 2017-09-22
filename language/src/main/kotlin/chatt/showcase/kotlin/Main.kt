package chatt.showcase.kotlin

fun main(args: Array<String>) {

    val a = 4
    val b = 7
    println("Sum of $a and $b is ${a + b}.")
    println("Max of $a and $b is ${max(a, b)}.")

}

fun max(a: Int, b: Int) = if (a > b) a else b
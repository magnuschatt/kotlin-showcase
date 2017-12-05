package chatt.showcase.kotlin

fun main(args: Array<String>) {

    val list = listOf("hello", "bob", "here", "we", "go")

    for (text in list) {}

    for (i in 1..10) {}
    for (i in 0 until 10) {}
    for (i in 2..10 step 2) {}
    for (i in 10 downTo 1) {}

    if (args.size in 1..10) {}
    if ("hello" in list) {}

}
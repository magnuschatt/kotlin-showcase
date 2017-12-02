package chatt.showcase.kotlin

import java.io.File
import java.io.IOException

@Suppress("UNUSED_VARIABLE")
fun main(args: Array<String>) {

    val x = args.size

    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        3, 4 -> println("x is 3 or 4")
        in 5..10 -> println("x is 5, 6, 7, 8, 9, or 10")
        else -> println("x is out of range")
    }

    val msg = when {
        args.isEmpty() -> "args is empty"
        args.size > 255 -> "args is too large"
        args[0].isBlank() -> "first argument can not be blank"
        else -> "args is fine"
    }

    val foo = if (args.isEmpty()) msg else args[0]

    val bob = try {
        File("bob.txt").readText()
    } catch (e: IOException) {
        "<file corrupted>"
    }

}

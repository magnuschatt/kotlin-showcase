package chatt.showcase.kotlin

import java.io.File

fun main(args: Array<String>) {

    val file1 = File("some/path")
    val file2 = File("some/path")

    println(file1 == file2)         // true     (structural equality)
    println(file1 === file2)        // false    (referential equality)

}
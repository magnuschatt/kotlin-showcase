@file:Suppress("UNUSED_VARIABLE")

package chatt.showcase.kotlin

import java.io.File
import javax.swing.JFrame

fun main(args: Array<String>) {

    val sum = { x: Int, y: Int -> x + y }
    val result = sum(10, 17)

    fun printResult(x: Int, y: Int, lambda: (Int, Int) -> Int) {
        println(lambda(x, y))
    }

    printResult(10, 4, sum)





    val list = listOf<String>()
    list.filter({ s: String -> s.length > 10 })







    val users = listOf<KotlinUser>()
    users.filter { it.age >= 18 }
            .sortedBy { it.name }
            .map { it.email }
            .forEach { println(it) }






    val extLambda: String.() -> String = { replace(' ', '_') }
    val formatted = "hello world".extLambda()











    val frame = JFrame()
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.isResizable = true
    frame.isVisible = true







    fun getFile(path: String): File {
        return File(path).apply { mkdirs() }
    }

}








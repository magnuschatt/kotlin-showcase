@file:Suppress("UNUSED_VARIABLE")

package chatt.showcase.kotlin

import java.io.File
import javax.swing.JFrame

fun main(args: Array<String>) {

    val sum = { x: Int, y: Int -> x + y }
    val result = sum(10, 17)



    val list = listOf<String>()
    val filtered1 = list.filter({ s: String -> s.length > 10 })
    val filtered2 = list.filter({ s -> s.length > 10 })
    val filtered3 = list.filter { s -> s.length > 10 }
    val filtered4 = list.filter { it.length > 10 }



    val users = listOf<KotlinUser>()
    users.filter { it.age >= 18 }
            .sortedBy { it.name }
            .map { it.email }
            .forEach { println(it) }



    val extLambda: String.() -> String = { replace(' ', '_') }
    val formatted = "hello world".extLambda()







    val frame = jFrame {
        setLocationRelativeTo(null)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }

    val frame2 = JFrame().apply {
        setLocationRelativeTo(null)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }

}



fun jFrame(config: JFrame.() -> Unit): JFrame {
    val frame = JFrame()
    frame.config()
    return frame
}

fun getFile(path: String): File {
    return File(path).apply { mkdirs() }
}


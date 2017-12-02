package chatt.showcase.kotlin

import java.util.*

class Frame(val title: String,
            val fullscreen: Boolean) {

    var width = 400
    var height = 300

    val pixels: Int
        get() = height * width

    fun printInfo() {
        println(toString())
    }

}

object Context {

    val hostName = "local"

    fun log(msg: String) {
        println("${Date()} - $msg")
    }

}
package chatt.showcase.kotlin

import java.util.*

class Frame(val title: String, val fullscreen: Boolean) {

    var width = 400
    var height = 300

    val pixels: Int
        get() = height * width

    val factor: Double by lazy {
        someCalculation()
    }

    private fun someCalculation(): Double {
        return 3.42123 * 23213.23123
    }

}

object Context {

    val hostName = "local"

    fun log(msg: String) {
        println("${Date()} - $msg")
    }

}
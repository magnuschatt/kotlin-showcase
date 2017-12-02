package chatt.showcase.kotlin

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) = runBlocking {
    val inData = (1..1000000).toList()

    val outData = inData.map { async { process(it) } }.map { it.await() }

    for (i in 0..20) {
        println("${inData[i]} -> ${outData[i]}")
    }
}

suspend fun process(input: Int): Int {
    delay(100)
    return input * input - input
}

